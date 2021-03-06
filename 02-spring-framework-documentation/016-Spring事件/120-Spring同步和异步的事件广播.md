# 120-Spring同步和异步的事件广播

[TOC]

## 一言蔽之



## 实现同步异步执行的方式

- 基于实现实现
- 基于注解实现

### 基于实现类 - org.springframework.context.event.SimpleApplicationEventMulticaster

- 模式切换 : setTaskExecutor(@Nullable Executor taskExecutor)
  - 默认模式: 同步 ,taskExecutor = null
  - 异步模式 : 如java.util.concurrent.ThreadPoolExecutor
- 设计缺陷 : 非基于接口契约编程,必须要强转成SimpleApplicationEventMulticaster 以后才能进行切换

### 基于注解- org.springframework.context.event.EventListener

- 模式切换-
  - 默认模式: 同步
  - 异步模式 : 标注 @org.springframework.scheduling.annotation.Async

- 实现限制: 无法直接实现同步/异步动态切换

## Spring同步和异步事件处理的使用场景

- Spring同步事件-绝大多数的Spring使用场景,如ContextRefreshedEvent
- Spring异步事件-主要@EventListener 与 @Asyc配合实现异步处理,不阻塞主线程,比如长时间的数据计算任务等等
  - 不要轻易调整SimpleApplicationEventMulticaster中关联的taskExecutor对象,除非你非常了解Spring事件机制,不然很容易出错

## 代码实例

#### SimpleApplicationEventMulticaster

```java
@Nullable
private Executor taskExecutor;

@Nullable
private ErrorHandler errorHandler;
@Override
public void multicastEvent(final ApplicationEvent event, @Nullable ResolvableType eventType) {
  ResolvableType type = (eventType != null ? eventType : resolveDefaultEventType(event));
  for (final ApplicationListener<?> listener : getApplicationListeners(event, type)) {
    Executor executor = getTaskExecutor();
    if (executor != null) {
      //如果存在执行器，则直接调用执行器里的线程执行listener
      executor.execute(() -> invokeListener(listener, event));
    } else {
      //如果不存在则直接执行
      invokeListener(listener, event);
    }
  }
}
```

#### 完整代码

```java
public class AsyncEventHandlerDemo {

    public static void main(String[] args) {
        GenericApplicationContext context = new GenericApplicationContext();

        // 1.添加自定义 Spring 事件监听器
        context.addApplicationListener(new MySpringEventListener());

        // 2.启动 Spring 应用上下文
        context.refresh(); // 初始化 ApplicationEventMulticaster

        // 依赖查找 ApplicationEventMulticaster
        ApplicationEventMulticaster applicationEventMulticaster =
            context.getBean(AbstractApplicationContext.APPLICATION_EVENT_MULTICASTER_BEAN_NAME, ApplicationEventMulticaster.class);

        // 判断当前 ApplicationEventMulticaster 是否为 SimpleApplicationEventMulticaster
        if (applicationEventMulticaster instanceof SimpleApplicationEventMulticaster) {
            SimpleApplicationEventMulticaster simpleApplicationEventMulticaster =
                (SimpleApplicationEventMulticaster) applicationEventMulticaster;
            // 切换 taskExecutor
            ExecutorService taskExecutor = newSingleThreadExecutor(new 
 //使用Spring的线程工厂
                                                                   CustomizableThreadFactory("my-spring-event-thread-pool"));
            // 同步 -> 异步
            simpleApplicationEventMulticaster.setTaskExecutor(taskExecutor);

            // 添加 ContextClosedEvent 事件处理
            applicationEventMulticaster.addApplicationListener(new ApplicationListener<ContextClosedEvent>() {
                @Override
                public void onApplicationEvent(ContextClosedEvent event) {
                    if (!taskExecutor.isShutdown()) {
                        taskExecutor.shutdown();
                    }
                }
            });

            simpleApplicationEventMulticaster.setErrorHandler(e -> {
                System.err.println("当 Spring 事件异常时，原因：" + e.getMessage());
            });
        }
        context.addApplicationListener(new ApplicationListener<MySpringEvent>() {
            @Override
            public void onApplicationEvent(MySpringEvent event) {
                throw new RuntimeException("故意抛出异常");
            }
        });

        // 3. 发布自定义 Spring 事件
        context.publishEvent(new MySpringEvent("Hello,World"));

        // 4. 关闭 Spring 应用上下文（ContextClosedEvent）
        context.close();

    }
}

```






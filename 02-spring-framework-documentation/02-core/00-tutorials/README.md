# 目录



- [01-spring-kick-start.md](01-bean-config-dependency-wiring/01-spring-kick-start.md) Spring 快速实践
-  [02-configuration-metadata.md](01-bean-config-dependency-wiring/02-configuration-metadata.md) 配置元数据
-  [03-java-based-configuration.md](01-bean-config-dependency-wiring/03-java-based-configuration.md) 基于 Java 的配置方式
-  [04-using-import.md](01-bean-config-dependency-wiring/04-using-import.md) 使用 import注解导入配置文件
-  [05-using-bean.md](01-bean-config-dependency-wiring/05-using-bean.md) 使用 Bean,bean 的属性
-  [06-beans-auto-wiring.md](01-bean-config-dependency-wiring/06-beans-auto-wiring.md)  bean 自动装载
-  [07-inject-bean-by-name-and-using-qualifier.md](01-bean-config-dependency-wiring/07-inject-bean-by-name-and-using-qualifier.md) 根据名称注入 bean,使用`@Qualifier`指定 bean
-  [08-inject-bean-by-name-and-using-resource.md](01-bean-config-dependency-wiring/08-inject-bean-by-name-and-using-resource.md) 根据名称注入 bean,使用`@Resource`注解
-  [09-different-ways-of-injecting-dependency.md](01-bean-config-dependency-wiring/09-different-ways-of-injecting-dependency.md) 注入依赖的不同方式
-  [10-initialization-and-destruction-lifecycle-callbacks.md](01-bean-config-dependency-wiring/10-initialization-and-destruction-lifecycle-callbacks.md) 初始化与销毁生命周期回调
-  [11-lazy-initialzation.md](01-bean-config-dependency-wiring/11-lazy-initialzation.md) 懒加载初始化
-  [12-lazy-injection.md](01-bean-config-dependency-wiring/12-lazy-injection.md)  懒注入
-  [13-controlling-bean-loading-order.md](01-bean-config-dependency-wiring/13-controlling-bean-loading-order.md) 控制 bean 的加载顺序
-  [14-bean-scopes.md](01-bean-config-dependency-wiring/14-bean-scopes.md) bean 的 scope
-  [15-java-config-with-component-scan.md](01-bean-config-dependency-wiring/15-java-config-with-component-scan.md) 使用 `@componentScan`扫描 java 配置类
-  [16-register-beans-with-conponent-classes.md](01-bean-config-dependency-wiring/16-register-beans-with-conponent-classes.md) 使用`@Conponent`注解注册 bean
-  [17-component-scan-custom-filtering.md](01-bean-config-dependency-wiring/17-component-scan-custom-filtering.md) `ComponentScan` 自定义过滤
-  [18-implicit-constructor-injection.md](01-bean-config-dependency-wiring/18-implicit-constructor-injection.md)  隐式构造器注入(implicit constructor injection)
-  [19-dependency-injection-in-bean-method-parameters.md](01-bean-config-dependency-wiring/19-dependency-injection-in-bean-method-parameters.md) `@Bean`方法参数中的依赖项注入

-  [20-inject-array-and-collections.md](01-bean-config-dependency-wiring/20-inject-array-and-collections.md)  注入数组与集合
-  [21-circular-dependencies.md](01-bean-config-dependency-wiring/21-circular-dependencies.md) 循环依赖
-  [22-using-primary-annotation.md](01-bean-config-dependency-wiring/22-using-primary-annotation.md) 使用@Primary 注解的方式
-  [23-java-generics-as-autowiring-qualifiers.md](01-bean-config-dependency-wiring/23-java-generics-as-autowiring-qualifiers.md) Java 泛型(Generics) 注入
-  [24-required-dependency-checking.md](01-bean-config-dependency-wiring/24-required-dependency-checking.md) 必须依赖检测
-  [25-bean-conditional-registraction.md](01-bean-config-dependency-wiring/25-bean-conditional-registraction.md) Spring @Bean conditional 注册
-  [26-spring-support-for-java-8-default-method.md](01-bean-config-dependency-wiring/26-spring-support-for-java-8-default-method.md) Spring Java8 默认方法支持
-  [27-programmatic-lookup-of-dependencies-via-object-provider.md](02-programmatic-bean-look-up/27-programmatic-lookup-of-dependencies-via-object-provider.md) 编程方式使用 ObjectProvider 获取依赖
-  [28-java-8-functions-support-callbacks.md](02-programmatic-bean-look-up/28-java-8-functions-support-callbacks.md) ObjectProvider 支持 Java 8函数式编程 
-  [29-java-8-stream-support.md](02-programmatic-bean-look-up/29-java-8-stream-support.md) Spring中的 Stream 支持 (ObjectProvider)
-  [30-injecting-prototype-bean.md](03-incompatible-bean-scopes/30-injecting-prototype-bean.md) 将一个 Prototype Bean 注入到 Singleton Bean
-  [31-bean-application-context-aware.md](03-incompatible-bean-scopes/31-bean-application-context-aware.md) 让 Bean 能够感知到 ApplicationContext
-  [32-lookup-method-injection-using-lookup.md](03-incompatible-bean-scopes/32-lookup-method-injection-using-lookup.md) 使用@Lookup 注解查询方法进行注入
-  [33-injecting-a-bean-as-a-class-based-proxy-object.md](03-incompatible-bean-scopes/33-injecting-a-bean-as-a-class-based-proxy-object.md) 注入一个基于类的代理对象的 bean
-  [34-inject-a-bean-as-a-jdk-interface-based-proxy.md](03-incompatible-bean-scopes/34-inject-a-bean-as-a-jdk-interface-based-proxy.md) 基于 注入JDK接口的代理对象的 bean
-  [35-using-jsr-330-provider-to-inject-narrower-scoped-bean.md](03-incompatible-bean-scopes/35-using-jsr-330-provider-to-inject-narrower-scoped-bean.md) 使用 JSR-330 Provider 去注入一个更小作用域的 bean
-  [36-using-object-provider-to-inject-narrower-scoped-bean.md](03-incompatible-bean-scopes/36-using-object-provider-to-inject-narrower-scoped-bean.md) 使用 ObjectProvider 去注入更小作用域 Bean
-  [37-environment-profiles.md](04-environment-abstaraction-and-profile/37-environment-profiles.md) Environment Profile
-  [38-environment-properties.md](04-environment-abstaraction-and-profile/38-environment-properties.md) Environment properties 
-  [39-accessing-application-args-with-commondlinepropertysource.md](04-environment-abstaraction-and-profile/39-accessing-application-args-with-commondlinepropertysource.md) 使用`CommandLinePropertySource`获取应用参数
-  [40-resource-injection.md](05-resource-handling/40-resource-injection.md) 资源注入(Resource Injection)
-  [41-internationzlization-in-spring.md](05-resource-handling/41-internationzlization-in-spring.md) Spring 中的国际化
-  [42-standard-and-custom-events.md](06-standard-and-custom-events/42-standard-and-custom-events.md) 标准和自定义事件(Events)
-  [43-manipulating-java-beans.md](07-data-binding-validation-conversion-and-formatting/43-manipulating-java-beans.md) 对 Java Bean 的操纵
-  [44-property-editors.md](07-data-binding-validation-conversion-and-formatting/44-property-editors.md) Spring 是如何使用 JavaBeans API 来将文本转化成 Object,创建一个自定义的 Editor,如何使用 Spring 默认的 property editors
-  [45-core-data-binding.md](07-data-binding-validation-conversion-and-formatting/45-core-data-binding.md) 什么是DataBinder, DataBinder 和 BeanWrapper 的区别
-  [46-spring-validation.md](07-data-binding-validation-conversion-and-formatting/46-spring-validation.md) Spring core 级别的不同校验 bean 方式
-  [47-message-codes-created-by-messageCodesResolver.md](07-data-binding-validation-conversion-and-formatting/47-message-codes-created-by-messageCodesResolver.md) 理解 MessageCodesResolver 如何解析message code
-  [48-creating-custom-validation-constraint-anno.md](07-data-binding-validation-conversion-and-formatting/48-creating-custom-validation-constraint-anno.md) Spring Core 创建常量注解 
-  [49-method-validation.md](07-data-binding-validation-conversion-and-formatting/49-method-validation.md)方法校验 
-  [50-conversion-service.md](07-data-binding-validation-conversion-and-formatting/50-conversion-service.md) Spring ConversionService 进行通用类型转换,创建 converters 的不同方式,使用 带有DataBinder 的 DataBinder
-  [51-field-formatting.md](07-data-binding-validation-conversion-and-formatting/51-field-formatting.md) Spring 解析格式化字符串
-  [52-anno-driven-formatting.md](07-data-binding-validation-conversion-and-formatting/52-anno-driven-formatting.md) 基于注解的格式化
-  [53-task-execution.md](08-task-execution-and-scheduling/53-task-execution.md)  任务执行
-  [54-task-scheduling.md](08-task-execution-and-scheduling/54-task-scheduling.md) 任务计划
-  [55-asyn-execution-using-async.md](08-task-execution-and-scheduling/55-asyn-execution-using-async.md) 异步执行任务
-  [56-task-scheduling-using-scheduled.md](08-task-execution-and-scheduling/56-task-scheduling-using-scheduled.md) 任务计划
-  [57-dynamically-register-beans.md](09-programmatic-bean-registration/57-dynamically-register-beans.md)  使用 BeanFactory 和 Bean Definition 动态注册对象成为 SpringBean
-  [58-beanDefinitionCustomizer.md](09-programmatic-bean-registration/58-beanDefinitionCustomizer.md) 使用 Spring5 BeanDefinitionCustomizer 和 GenericApplicationContext 的新方法
-  [59-configuration-selection-by-using-importSelector.md](09-programmatic-bean-registration/59-configuration-selection-by-using-importSelector.md) 如何编程方式使用 ImportSelector 接口导入
-  [60-using-deferredimportSelector.md](10-advance-configuration/60-using-deferredimportSelector.md) 使用 DeferredImportSelector 和 ImportSelector的区别
-  [61-using-importBean-Definition-Registrar.md](10-advance-configuration/61-using-importBean-Definition-Registrar.md)  使用ImportBeanDefinitionRegistrar 和 import动态注册 bean
-  [62-understanding-aliasFor-anno.md](10-advance-configuration/62-understanding-aliasFor-anno.md)  认识@AliasFor 注解
-  [63-spring-core-logging-support.md](11-logging-support/63-spring-core-logging-support.md)  Spring 日志支持,默认日志
-  [64-logging-in-log4j.md](11-logging-support/64-logging-in-log4j.md)  如何在运行时使用 Log4j
-  [65-logging-in-log4j2.md](11-logging-support/65-logging-in-log4j2.md)  如何在运行时使用 Log4j2
-  [65-logging-in-SLF4j-and-logback.md](11-logging-support/65-logging-in-SLF4j-and-logback.md) Spring + Logback

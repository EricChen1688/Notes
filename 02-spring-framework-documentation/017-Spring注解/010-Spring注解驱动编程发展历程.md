# 010-Spring注解驱动编程发展历程.md

[TOC]

## Springframework-1.x

当时Java5刚刚出炉，业界正刮起使用Annotation的技术风，Spring一样

在框架中予以支持了

- @ManageSource JMX拓展
- @Transactional

等等注解，

- 被注解的SpringBean需要使用XML方式引入，XML配置文件方式是唯一选择

## Springframework-2.x

2006年发布的Springframework2.0 在软件兼容方面非常强

- @Required
- @Repository
- @Aspect

等等，同时也支持了可扩展的XML编写（Extensible XML authoring),Dubbo等开源框架都拓展了自身的xml配置方式以及Schema文件

- @Autowired依赖注入
- @Quilifier 依赖查找, 逻辑限定
- @Component,@Service 组件声明
- @Controller,@RequestMapping,@ModelAttribute: SpringMVC注解

## Springframework-3.x

此阶段, 全面支持Java5 (泛型,变量参数)

- @ImportResource : 允许导入遗留的XML文件 
- @Import :  允许导入一个或者多个类作为SpringBean
- @Bean 注解
- @Profile

#### web方

- @Controller
- @ReponseBody
- @ResponseStatus

#### 配置

- @PropertySource

#### 缓存

- @Caching
- @Cacheable

#### 校验

- @Validated

#### Enable模块注解

- @EnableWebMVC

## 注解完善阶段 :Springframework-4.x

#### 条件注解

- @Conditional
- @GetMapping
- @RestController

## Springframework-5.x

- @Indexed
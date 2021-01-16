# 130-SpringBoot拓展点-CommandLineRunner

org.springframework.boot.CommandLineRunner

这个接口也只有一个方法：run(String… args)，触发时机为整个项目启动完毕后，自动执行。如果有多个CommandLineRunner，可以利用@Order来进行排序。

使用场景：用户扩展此接口，进行启动项目之后一些业务的预处理。

扩展方式为：

```
publicclassTestCommandLineRunnerimplementsCommandLineRunner{
@Overridepublicvoid run(String... args)throwsException{System.out.println("[TestCommandLineRunner]");}}
```

## 
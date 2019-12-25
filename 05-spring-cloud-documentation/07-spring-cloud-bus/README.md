# Spring Cloud Bus 消息总线

在微服务架构的系统中， 我们通常会使用轻量级的消息代理来构建一个共用的消息主 题让系统中所有微服务实例都连接上来， 由于该主题中产生的消息会被所有实例监听和消费， 所以我们称它为消息总线。 在总线上的各个实例都可以方便地广播一些需要让其他连接在该主题上的实例都知道的消息， 例如配置信息的变更或者其他一些管理操作等。
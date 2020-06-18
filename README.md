# [讨论] Gateway自主提取Eureka中ServiceId作为路由路径匹配

## 背景介绍
- YML配置中，spring.cloud.gateway.discovery.locator.enabled：指示了是否与服务注册与发现组件进行结合，通过 serviceId转发到具体的服务实例。默认为false，设为true便开启通过服务中心的自动基于serviceId创建路由的功能。
- 但是如果一旦按照上述情况开始路由，随后的状态和动作又会如何？

## 案例准备
- gateway设置一个断言(Path)，转发给服务时加入一个参数；定义一个服务producer，并在其中建立一个controller，利用'/foo'试图去接传入的参数
![image](https://github.com/skymarlio82/spring-cloud-topic01/blob/master/screens/img01.png)
- 开始测试，请求网关试图将参数转发到服务producer中去
![image](https://github.com/skymarlio82/spring-cloud-topic01/blob/master/screens/img021.png)
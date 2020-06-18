# [讨论] Gateway自主提取Eureka中ServiceId作为路由路径匹配

## 背景介绍
- YML配置中，spring.cloud.gateway.discovery.locator.enabled：指示了是否与服务注册与发现组件进行结合，通过 serviceId转发到具体的服务实例。默认为false，设为true便开启通过服务中心的自动基于serviceId创建路由的功能。
- 但是如果一旦按照上述情况开始路由，随后的状态和动作又会如何？

## 案例准备
- gateway设置一个断言(Path)，转发给服务时加入一个参数；定义一个服务producer，并在其中建立一个controller，利用'/foo'试图去接传入的参数
![image](https://github.com/skymarlio82/spring-cloud-topic01/blob/master/screens/img01.png)
- 开始测试，请求网关试图将参数转发到服务producer中去
![image](https://github.com/skymarlio82/spring-cloud-topic01/blob/master/screens/img02.png)

## 深度测试
- 将上图的producer替换成SC-PRODUCER(serviceId)，再试一次
![image](https://github.com/skymarlio82/spring-cloud-topic01/blob/master/screens/img03.png)

## 结论与设想
- 如果我们未来期望一种场景，就是转发的contextPath与serviceId一样，然后我们还是希望路由中的断言和过滤器生效，那么只能将spring.cloud.gateway.discovery.locator.enabled关掉
![image](https://github.com/skymarlio82/spring-cloud-topic01/blob/master/screens/img04.png)
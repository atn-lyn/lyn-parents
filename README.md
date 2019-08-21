# lyn-parents

使用SpringBoot集成Dubbo、Zookeeper、Redis、Kafka实现的分布式开发微服务落点的电商项目实现。

实现的功能：

1，Maven父子级项目，实现了分环境部署配置及服务端口号统一配置

2，Dubbo的集成接入、服务层分模块实现，提供者（四个）和消费者（一个）的配置及服务调用，微服务落地实现。

3，Maven子模块项目（接口及服务层）的版本号统一配置管理实现。

4，Redis的接入、单点登录及分布式缓存实现。

5，接口安全防范，令牌、签名及撒盐算法实现，过滤器对签名、token校验及拦截处理。

6，全局异常处理，Aop日志打印，防SQL注入拦截处理实现。

190628---添加Redis分布式锁实现。

190718 --- 商品SPU、SKU实现

````
ElasticSearch的接入实现
````

## 欢迎关注

一个有温度有灵魂的技术微信公众号，期待与你共同进步，分享各种Java项目开发及学习资源

![image](https://github.com/atn-lyn/lyn-parents/blob/master/wxqr.png)

 

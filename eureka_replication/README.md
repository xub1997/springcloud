##一、改造工作
在eureka-server工程中resources文件夹下，创建配置文件application-peer1.yml:
~~~   
#端口
server:
  port: 8761
spring:
  #安全认证
  security:
    basic:
      enabled: true
    user:
      name: admin
      password: 123456
  #应用名称
  application:
    name: register
  profiles: peer1

eureka:
  instance:
    hostname: peer1
    prefer-ip-address: true #使用ip注册
  client:
    # 表示是否注册自身到eureka服务器(默认：true)
    register-with-eureka: false
    # 是否从eureka上获取注册信息(默认：true)
    fetch-registry: false
    # 查询注册都依赖此地址 默认为http://localhost:8761/eureka 多个地址使用","分割
    serviceUrl:
      defaultZone: http://${spring.security.user.name}:${spring.security.user.password}@peer2:8762/eureka/, http://${spring.security.user.name}:${spring.security.user.password}@peer3:8763/eureka/

  server:
    # 安全保护机制
    enable-self-preservation: false
    # 清理无效节点的时间间隔,默认60000毫秒,即60秒
    eviction-interval-timer-in-ms: 60000

~~~

并且创建另外一个配置文件application-peer2.yml：

~~~
#端口
server:
  port: 8762
spring:
  #安全认证
  security:
    basic:
      enabled: true
    user:
      name: admin
      password: 123456
  #应用名称
  application:
    name: register
  profiles: peer2

eureka:
  instance:
    hostname: peer2
    prefer-ip-address: true #使用ip注册
  client:
    # 表示是否注册自身到eureka服务器(默认：true)
    register-with-eureka: false
    # 是否从eureka上获取注册信息(默认：true)
    fetch-registry: false
    # 查询注册都依赖此地址 默认为http://localhost:8761/eureka 多个地址使用","分割
    serviceUrl:
      defaultZone: http://${spring.security.user.name}:${spring.security.user.password}@peer1:8761/eureka/, http://${spring.security.user.name}:${spring.security.user.password}@peer3:8763/eureka/

  server:
    # 安全保护机制
    enable-self-preservation: false
    # 清理无效节点的时间间隔,默认60000毫秒,即60秒
    eviction-interval-timer-in-ms: 60000


~~~

并且创建另外一个配置文件application-peer3.yml：
~~~~
#端口
server:
  port: 8763
spring:
  #安全认证
  security:
    basic:
      enabled: true
    user:
      name: admin
      password: 123456
  #应用名称
  application:
    name: register
  profiles: peer3

eureka:
  instance:
    hostname: peer3
    prefer-ip-address: true #使用ip注册
  client:
    # 表示是否注册自身到eureka服务器(默认：true)
    register-with-eureka: false
    # 是否从eureka上获取注册信息(默认：true)
    fetch-registry: false
    # 查询注册都依赖此地址 默认为http://localhost:8761/eureka 多个地址使用","分割
    serviceUrl:
      defaultZone: http://${spring.security.user.name}:${spring.security.user.password}@peer1:8761/eureka/, http://${spring.security.user.name}:${spring.security.user.password}@peer2:8762/eureka/
    
  server:
    # 安全保护机制
    enable-self-preservation: false
    # 清理无效节点的时间间隔,默认60000毫秒,即60秒
    eviction-interval-timer-in-ms: 60000

~~~~

这时eureka-server就已经改造完毕。
~~~
ou could use this configuration to test the peer awareness on a single host (there’s not much value in doing that in production) by manipulating /etc/hosts to resolve the host names.
~~~
按照官方文档的指示，需要改变etc/hosts，linux系统通过vim /etc/hosts ,加上：
~~~~
127.0.0.1 peer1
127.0.0.1 peer2
127.0.0.1 peer3
~~~~

## 三、启动工程 ####
启动eureka-server：
~~~~
java -jar eureka-server-0.0.1-SNAPSHOT.jar - -spring.profiles.active=peer1

java -jar eureka-server-0.0.1-SNAPSHOT.jar - -spring.profiles.active=peer2

java -jar eureka-server-0.0.1-SNAPSHOT.jar - -spring.profiles.active=peer3
~~~~
启动service-hi:
~~~~
java -jar service-hi-0.0.1-SNAPSHOT.jar
~~~~
访问：localhost:8761,如图：

Paste_Image.png

你会发现注册了service-hi，并且有个peer2节点，同理访问localhost:8769你会发现有个peer1节点。

client只向8761注册，但是你打开8769，你也会发现，8769也有 client的注册信息。

个人感受：这是通过看官方文档的写的demo ，但是需要手动改host是不是不符合Spring Cloud 的高上大？

Prefer IP Address
In some cases, it is preferable for Eureka to advertise the IP Adresses of services rather than the hostname. Set eureka.instance.preferIpAddress to true and when the application registers with eureka, it will use its IP Address rather than its hostname.

摘自官网

eureka.instance.preferIpAddress=true是通过设置ip让eureka让其他服务注册它。也许能通过去改变去通过改变host的方式。


Eureka-eserver peer1 8761,Eureka-eserver peer2 8769相互感应，当有服务注册时，两个Eureka-eserver是对等的，它们都存有相同的信息，这就是通过服务器的冗余来增加可靠性，当有一台服务器宕机了，服务并不会终止，因为另一台服务存有相同的数据。

eureka安全认证
eureka安全中心可以增加用户名和密码进行安全验证访问。

通过spring-boot-starter-security模块实现。

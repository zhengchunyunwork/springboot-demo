## Springboot + mybatis访问mysql数据库
引入的jar的pom配置：
``<dependency>
 <groupId>org.mybatis.spring.boot</groupId>
 <artifactId>mybatis-spring-boot-starter</artifactId>
 <version>2.1.2</version>
</dependency>
<dependency>
 <groupId>mysql</groupId>
 <artifactId>mysql-connector-java</artifactId>
</dependency>
``

## SpringBoot + redis
引入jar的pom配置,此配置为spring官方提供的配置
``
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-redis</artifactId>
</dependency>
``

## 引入自已写的starter， redission-spring-boot-starter
``
<dependency>
    <groupId>com.zcy.learn.redission</groupId>
    <artifactId>redission-spring-boot-starter</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
<dependency>
    <groupId>org.redisson</groupId>
    <artifactId>redisson</artifactId>
    <version>3.13.1</version>
</dependency>
``
在redission-spring-boot-starter中虽然已经引入了redission的依赖，但是使用了属性optional进行了标示，所以关闭了集联依赖
``
<optional>true</optional>
``
所以上面还需要再此引入redission包。

而且在redission-spring-boot-starter中还使用了@ConditionalOnClass(Redisson.class)，所以此处如果不引用redission包，在
Spring IOC容器中是不会自动装配RedissionClient对象的
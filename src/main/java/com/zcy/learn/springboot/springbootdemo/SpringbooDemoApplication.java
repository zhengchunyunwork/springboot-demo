package com.zcy.learn.springboot.springbootdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.zcy.learn.springboot.springbootdemo.dao.mappers") //扫描mybatis的注解
@SpringBootApplication
public class SpringbooDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbooDemoApplication.class, args);
    }

}

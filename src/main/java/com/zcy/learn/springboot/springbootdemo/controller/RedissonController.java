package com.zcy.learn.springboot.springbootdemo.controller;

import org.redisson.api.RBucket;
import org.redisson.api.RBuckets;
import org.redisson.api.RedissonClient;
import org.redisson.client.codec.StringCodec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedissonController {


    @Autowired
    RedissonClient redissonClient;

    @GetMapping("/sayHello")
    public String sayHello(){
        RBucket<Object> bucket = redissonClient.getBucket("name", StringCodec.INSTANCE);
        if (bucket.get() == null) {
            bucket.set("laozheng superman");
        }
        return bucket.get().toString();

    }
}

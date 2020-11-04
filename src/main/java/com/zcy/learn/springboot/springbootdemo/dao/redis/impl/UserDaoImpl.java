package com.zcy.learn.springboot.springbootdemo.dao.redis.impl;

import com.zcy.learn.springboot.springbootdemo.dao.redis.IUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements IUserDao {

    @Autowired
    private RedisTemplate<String, String> template;

    @Override
    public String getUserMsg(String name) {
        return template.opsForValue().get(name);
    }
}

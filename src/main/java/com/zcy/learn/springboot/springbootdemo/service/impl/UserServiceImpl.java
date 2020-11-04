package com.zcy.learn.springboot.springbootdemo.service.impl;

import com.zcy.learn.springboot.springbootdemo.dao.entity.User;
import com.zcy.learn.springboot.springbootdemo.dao.mappers.UserMapper;
import com.zcy.learn.springboot.springbootdemo.dao.redis.IUserDao;
import com.zcy.learn.springboot.springbootdemo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    UserMapper userMapper;

    @Autowired
    IUserDao userReidsDao;

    @Override
    public void insertUser(User user) {

        userMapper.insert(user);

    }

    @Override
    public String getUserMsg(String name) {
        return userReidsDao.getUserMsg(name);
    }
}

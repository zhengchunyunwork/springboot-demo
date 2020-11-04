package com.zcy.learn.springboot.springbootdemo.service;

import com.zcy.learn.springboot.springbootdemo.dao.entity.User;

public interface IUserService {

    void insertUser(User user);

    String getUserMsg(String name);
}

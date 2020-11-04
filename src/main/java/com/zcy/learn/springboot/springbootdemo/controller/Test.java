package com.zcy.learn.springboot.springbootdemo.controller;

import com.zcy.learn.springboot.springbootdemo.dao.entity.User;
import com.zcy.learn.springboot.springbootdemo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

    @Autowired
    IUserService userService;

    @RequestMapping("/test")
    public String test(){

        User user = new User();
        user.setName("xiaohong");
        userService.insertUser(user);
        return "Hello SpringBoot";
    }

    @GetMapping("/getUserMsg")
    public String getUserMsg() {
        return userService.getUserMsg("zcy");
    }

}

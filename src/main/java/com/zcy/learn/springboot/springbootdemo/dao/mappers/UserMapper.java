package com.zcy.learn.springboot.springbootdemo.dao.mappers;

import com.zcy.learn.springboot.springbootdemo.dao.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    int insert(User user);
}

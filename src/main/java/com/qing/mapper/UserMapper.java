package com.qing.mapper;

import com.qing.entity.User;

import java.util.List;

public interface UserMapper {
    //获取用户表前八条
    List<User> GetEightUser(User user);

    //登陆
    User login(User user);
}
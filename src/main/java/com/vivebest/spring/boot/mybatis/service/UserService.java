package com.vivebest.spring.boot.mybatis.service;

import com.vivebest.spring.boot.mybatis.entity.User;

public interface UserService {

    User queryUser(Integer id);
}
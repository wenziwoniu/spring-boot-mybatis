package com.vivebest.spring.boot.mybatis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vivebest.spring.boot.mybatis.dao.UserDao;
import com.vivebest.spring.boot.mybatis.entity.User;
import com.vivebest.spring.boot.mybatis.service.UserService;

@Service("com.vivebest.spring.boot.mybatis.service.UserService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User queryUser(Integer id) {
        return userDao.findOne(id);
    }
}
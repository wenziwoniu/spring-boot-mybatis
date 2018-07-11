/*@(#)UserController.java   2017年4月27日 
 * Copy Right 2017 Tencent Group Holding Limited.
 * All Copyright Reserved
 */

package com.vivebest.spring.boot.mybatis.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vivebest.spring.boot.mybatis.entity.User;
import com.vivebest.spring.boot.mybatis.service.UserService;

/**
 * 用户查询接口
 * <p>
 * 
 * @version 1.0.0,2017年4月27日
 * @author zhengzhangwen
 * @since 1.0.0
 */
@RestController
@RequestMapping("user")
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userservice;

    @RequestMapping("/queryUser")
    public User queryUser(String id) {
        logger.info("queryUser by id:{}", id);
        return userservice.queryUser(Integer.valueOf(id));
    }
}

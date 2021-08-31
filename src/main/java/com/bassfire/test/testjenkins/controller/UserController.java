package com.bassfire.test.testjenkins.controller;

import com.bassfire.test.testjenkins.entity.User;
import com.bassfire.test.testjenkins.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description
 * @Author fengguangbao
 * @Date 2021/8/31 10:48
 */
@RestController
public class UserController {

    @Autowired
    UserMapper userMapper;

    @RequestMapping("/fgb")
    public List<User> getList(){
        List<User> users = userMapper.selectList(null);
        return users;
    }
}

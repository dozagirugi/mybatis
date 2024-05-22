package com.mysite.mybatis.controller;

import com.mysite.mybatis.mapper.UserMapper;
import com.mysite.mybatis.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

// RestController는 화면 없이 바로 객체나 문자열을 제이슨으로 리턴한다
@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/users/{id}")
    public User users(@PathVariable String id) {
        User user = userMapper.getUser(id);
        return user;
    }
}

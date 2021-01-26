package com.djc.service;

import com.djc.pojo.User;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class UserService {

    @Resource
    private User user;

    public User getUser(){
        return user;
    }
}

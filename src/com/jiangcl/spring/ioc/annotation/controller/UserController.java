package com.jiangcl.spring.ioc.annotation.controller;

import com.jiangcl.spring.ioc.annotation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author jiangcl
 * @date 2019/12/20
 * @desc
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    public UserController(){
        System.out.println("userController init...");
    }

    public void excute(){
        System.out.println("method in controller...");
        userService.add();
    }
}

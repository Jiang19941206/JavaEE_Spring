package com.jiangcl.spring.ioc.annotation.service;

import com.jiangcl.spring.ioc.annotation.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author jiangcl
 * @date 2019/12/20
 * @desc
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    public UserServiceImpl(){
        System.out.println("userService init...");
    }

    public void add(){
        System.out.println("method in service...");
        userRepository.add();
    }
}

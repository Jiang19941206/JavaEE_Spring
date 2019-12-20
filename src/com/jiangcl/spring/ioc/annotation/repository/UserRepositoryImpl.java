package com.jiangcl.spring.ioc.annotation.repository;

import org.springframework.stereotype.Service;

/**
 * @author jiangcl
 * @date 2019/12/20
 * @desc
 */
@Service("userRepository")
public class UserRepositoryImpl implements UserRepository {
    public UserRepositoryImpl(){
        System.out.println("userRepository init...");
    }

    public void add(){
        System.out.println("method in repository...");
    }
}

package com.jiangcl.spring.ioc.annotation.component;

import org.springframework.stereotype.Component;

/**
 * @author jiangcl
 * @date 2019/12/20
 * @desc
 */
@Component
public class User {
    public User(){
        System.out.println("user init...");
    }
}

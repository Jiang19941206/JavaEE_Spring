package com.jiangcl.spring.ioc.annotation;

import com.jiangcl.spring.ioc.annotation.component.User;
import com.jiangcl.spring.ioc.annotation.controller.UserController;
import com.jiangcl.spring.ioc.annotation.repository.UserRepository;
import com.jiangcl.spring.ioc.annotation.repository.UserRepositoryImpl;
import com.jiangcl.spring.ioc.annotation.service.UserService;
import com.jiangcl.spring.ioc.annotation.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author jiangcl
 * @date 2019/12/20
 * @desc
 */
public class AnnotationBeanTest {

    @Test
    public void test1(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-annotation.xml");
        User user = (User) ctx.getBean("user");
        System.out.println(user);

        UserController userController = (UserController) ctx.getBean("userController");
        System.out.println(userController);

        UserService userService = (UserServiceImpl) ctx.getBean("userService");
        System.out.println(userService);

        UserRepository userRepository = (UserRepositoryImpl) ctx.getBean("userRepository");
        System.out.println(userRepository);
    }

    @Test
    public void test2(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-annotation.xml");
        UserController userController = (UserController) ctx.getBean("userController");
        userController.excute();
    }
}

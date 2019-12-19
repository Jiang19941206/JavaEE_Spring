package com.jiangcl.spring.properties;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author jiangcl
 * @date 2019/12/19
 * @desc spring 加载配置文件并赋值
 */
public class PropertiesMainClass {

    @Test
    public void test1(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        User user = (User) ctx.getBean("user");
        System.out.println(user);
    }
}

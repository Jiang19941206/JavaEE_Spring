package com.jiangcl.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author jiangcl
 * @date 2019/12/19
 * @desc
 */
public class MainClass {
    public static void main(String[] args) {
        //创建Spring的IOC容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //从IOC容器中获取Bean实例
        HelloSpring helloSpring = (HelloSpring) context.getBean("helloSpring");

        //调用方法
        helloSpring.hello();
    }
}

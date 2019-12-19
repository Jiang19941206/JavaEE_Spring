package com.jiangcl.spring.factory;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author jiangcl
 * @date 2019/12/19
 * @desc 测试类
 */
public class FactoryMainClass {

    @Test
    public void test1(){
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring_factory.xml");
        Car staticCar = (Car) ctx.getBean("staticCar");
        System.out.println(staticCar);

        Car instanceCar = (Car) ctx.getBean("instanceCar");
        System.out.println(instanceCar);
    }
}

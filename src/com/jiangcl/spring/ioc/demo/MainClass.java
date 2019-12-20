package com.jiangcl.spring.ioc.demo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author jiangcl
 * @date 2019/12/19
 * @desc
 */
public class MainClass {

    @Test
    public void test1(){
        //创建Spring的IOC容器
        //ApplicationContext即为IOC容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //从IOC容器中获取Bean实例
        HelloSpring helloSpring = (HelloSpring) context.getBean("helloSpring");

        //调用方法
        helloSpring.hello();
    }

    @Test
    public void test2(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //scope="singleton"
        Person singlePerson1 = (Person) ctx.getBean("person");
        Person singlePerson2 = (Person) ctx.getBean("person");
        System.out.println(singlePerson1 == singlePerson2);//true

        //scope="prototype"
        Person prototypePerson1 = (Person) ctx.getBean("person1");
        Person prototypePerson2 = (Person) ctx.getBean("person1");
        System.out.println(prototypePerson1 == prototypePerson2);//false
    }
}

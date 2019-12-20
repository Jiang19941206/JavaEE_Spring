package com.jiangcl.spring.aop.demo;

import com.jiangcl.spring.ioc.annotation.repository.UserRepository;
import com.jiangcl.spring.ioc.annotation.repository.UserRepositoryImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author jiangcl
 * @date 2019/12/20
 * @desc
 */
public class MyAspectJTest {

    @Test
    public void test1(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-aop.xml");
        //当该类为一个切面的连接点时，应强转为接口类型，而不是实现类
        Calculator calculator = (Calculator)ctx.getBean("calculator");
        calculator.add(1,2);
        calculator.sub(4,2);
        calculator.mul(3,3);
        calculator.div(15,3);
    }
}

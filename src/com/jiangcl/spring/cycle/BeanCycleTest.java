package com.jiangcl.spring.cycle;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author jiangcl
 * @date 2019/12/19
 * @desc spring Bean生命周期测试
 */
public class BeanCycleTest {

    @Test
    public void test1(){
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring_cycle.xml");

        SpringBeanCycle cycle = (SpringBeanCycle) ctx.getBean("cycle");

        System.out.println(cycle);

        ctx.destroy();
    }
}

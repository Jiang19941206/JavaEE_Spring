package com.jiangcl.spring.transcation;

import com.jiangcl.spring.transcation.service.PurchaseService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author jiangcl
 * @date 2019/12/23
 * @desc spring管理事物
 */
public class TranscationTest {

    @Test
    public void test1(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-transcation.xml");
        PurchaseService purchaseService = (PurchaseService) ctx.getBean("purchaseService");
        purchaseService.purchaseBook(1,1,1);
        System.out.println("********** 执行结束 **********");
    }

    /**
     * 使用注解操作dao的返回值
     */
    @Test
    public void test2(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-transcation.xml");
        PurchaseService purchaseService = (PurchaseService) ctx.getBean("purchaseService");
        int info = purchaseService.getInfo();
        System.out.println(info);
    }

}

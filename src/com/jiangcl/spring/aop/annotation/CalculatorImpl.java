package com.jiangcl.spring.aop.annotation;

import org.springframework.stereotype.Service;

/**
 * @author jiangcl
 * @date 2019/12/20
 * @desc 实现类
 */
@Service("calculator")
public class CalculatorImpl implements Calculator {
    @Override
    public int add(int i, int j) {
        System.out.println("the add result is ：" + (i + j));
        return (i + j);
    }

    @Override
    public void sub(int i, int j) {
        System.out.println("the sub result is ：" + (i - j));
    }

    @Override
    public void mul(int i, int j) {
        System.out.println("the mul result is ：" + (i * j));
    }

    @Override
    public void div(int i, int j) {
        System.out.println("the div result is ：" + (i / j));
    }
}

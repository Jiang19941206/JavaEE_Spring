package com.jiangcl.spring.aop.aopconfig;

/**
 * @author jiangcl
 * @date 2019/12/23
 * @desc
 */
public class ConfigCalImpl implements ConfigCal {

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

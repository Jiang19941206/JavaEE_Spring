package com.jiangcl.spring.aop.demo;

/**
 * @author jiangcl
 * @date 2019/12/20
 * @desc 定义一个用于运算的接口
 */
public interface Calculator {

    /**
     * 加
     * @param i
     * @param j
     */
    int add(int i,int j);

    /**
     * 减
     * @param i
     * @param j
     */
    void sub(int i,int j);

    /**
     * 乘
     * @param i
     * @param j
     */
    void mul(int i,int j);

    /**
     * 除
     * @param i
     * @param j
     */
    void div(int i,int j);

}

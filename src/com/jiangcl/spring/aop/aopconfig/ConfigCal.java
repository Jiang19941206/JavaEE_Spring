package com.jiangcl.spring.aop.aopconfig;

/**
 * @author jiangcl
 * @date 2019/12/23
 * @desc
 */
public interface ConfigCal {

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

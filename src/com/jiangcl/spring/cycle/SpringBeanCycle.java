package com.jiangcl.spring.cycle;

/**
 * @author jiangcl
 * @date 2019/12/19
 * @desc spring Bean生命周期测试
 */
public class SpringBeanCycle {
    private String name;

    public SpringBeanCycle() {
        System.out.println("constructor。。。");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("setName。。。");
        this.name = name;
    }

    /**
     * bean的初始化方法
     */
    public void init(){
        System.out.println("init。。。");
    }

    /**
     * bean的销毁方法
     */
    public void destroy(){
        System.out.println("destroy。。。");
    }

    @Override
    public String toString() {
        return "SpringCycle{" +
                "name='" + name + '\'' +
                '}';
    }
}

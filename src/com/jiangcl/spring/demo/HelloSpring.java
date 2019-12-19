package com.jiangcl.spring.demo;

/**
 * @author jiangcl
 * @date 2019/12/19
 * @desc spring helloWorld
 */
public class HelloSpring {

    private String name;

    public HelloSpring() {
        System.out.println("调用构造器。。。");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("调用set(String name)方法。。。");
        this.name = name;
    }

    public void hello(){
        System.out.println("hello " + name);
    }
}

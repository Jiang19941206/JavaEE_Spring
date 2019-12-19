package com.jiangcl.spring.demo;

/**
 * @author jiangcl
 * @date 2019/12/19
 * @desc 验证bean的作用域
 */
public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}

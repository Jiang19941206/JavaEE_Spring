package com.jiangcl.spring.factory;

/**
 * @author jiangcl
 * @date 2019/12/19
 * @desc 实体类
 */
public class Car {

    private String brand;

    private double price;

    public Car(String brand, double price) {
        this.brand = brand;
        this.price = price;
        System.out.println("生产汽车。。。");
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}

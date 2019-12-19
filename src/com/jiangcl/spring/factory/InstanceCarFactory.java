package com.jiangcl.spring.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jiangcl
 * @date 2019/12/19
 * @desc 实例工厂配置Bean
 */
public class InstanceCarFactory {

    private Map<String,Car> map = null;

    public InstanceCarFactory(){
        System.out.println("InstanceCarFactory...");
        map = new HashMap<>();
        map.put("audi",new Car("instance_audi",300000));
        map.put("benz",new Car("instance_benz",400000));
    }

    /**
     * @desc 通过实例工厂获取bean的实例
     * @author jiangcl
     * @date 2019/12/19
     * @param brand
     * @return com.jiangcl.spring.factory.Car
     */
    public Car getCar(String brand){
        return map.get(brand);
    }
}

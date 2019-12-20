package com.jiangcl.spring.ioc.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jiangcl
 * @date 2019/12/19
 * @desc 使用静态工厂创建对象
 *        由于不是通过配置静态工厂创建的实例，所以无需构造器，但是需要在类加载时创建好目标Bean对象
 */
public class CarStaticFactory {

    private static Map<String,Car> map = null;

    public CarStaticFactory() {
        System.out.println("CarStaticFactory...");
    }

    /**
     * 在类加载时创建好对象
     */
    static {
        map = new HashMap<>();
        map.put("audi",new Car("static_audi",300000));
        map.put("benz",new Car("static_benz",400000));
    }

    /**
     * @desc 通过静态方法获取Bean的实例
     * @author jiangcl
     * @date 2019/12/19
     * @param brand
     * @return Car
     */
    public static Car getCar(String brand){
        return map.get(brand);
    }
}

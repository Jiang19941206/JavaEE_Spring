package com.jiangcl.spring.aop.aopconfig;

import org.aspectj.lang.JoinPoint;
import java.util.Arrays;
import java.util.List;

/**
 * @author jiangcl
 * @date 2019/12/23
 * @desc
 */
public class ConfigAspect {

    /**
     * @desc 声明一个前置通知：在目标方法开始之前执行
     * @author jiangcl
     * @date 2019/12/20
     * @param joinPoint
     * @return void
     */
    public void before(JoinPoint joinPoint){
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        String name = joinPoint.getSignature().getName();
        System.out.println("前置通知：the " + name + " method is begins。。。the args is：" + args.toString());
    }

    /**
     * @desc 声明一个后置通知：在目标方法开始之后执行（目标方法无论是否发生异常都会执行）
     * @author jiangcl
     * @date 2019/12/20
     * @param joinPoint
     * @return void
     */
    public void after(JoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        System.out.println("后置通知：the " + name + " method is over");

    }

    /**
     * @desc 返回通知
     *      在后置通知之后执行
     *      若目标方法有返回值，则返回其对应的返回值
     *      若目标方法返回类型为void，则返回null
     *      当指定的方法出现异常时，不执行返回通知
     *      returning = "result"这个值和方法里面的Object result参数名称必须一致
     * @author jiangcl
     * @date 2019/12/20
     * @param joinPoint
     * @param result
     * @return void
     */
    public void afterReturning(JoinPoint joinPoint,Object result){
        String name = joinPoint.getSignature().getName();
        System.out.println("返回通知：the result of " + name + " is：" + result);
        System.out.println("**********************");
    }

    /**
     * @desc 异常通知
     *      在目标方法出现异常时执行
     *      可以通过afterThrowing(JoinPoint joinPoint,Exception e)中的Exception类型指定在何种异常的情况下才执行此通知方法
     *      throwing = "e"这个值和方法里面的Exception e参数名称必须一致
     * @author jiangcl
     * @date 2019/12/20
     * @param joinPoint
     * @param e
     * @return void
     */
    public void afterThrowing(JoinPoint joinPoint,Exception e){
        String name = joinPoint.getSignature().getName();
        System.out.println("异常通知：the methd " + name + " occur Exception " + e);
    }
}

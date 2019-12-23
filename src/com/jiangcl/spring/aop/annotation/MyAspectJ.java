package com.jiangcl.spring.aop.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * @author jiangcl
 * @date 2019/12/20
 * @desc 声明一个切面类，需要将此类放入IOC容器中
 */
//@Order(1)当定义了多个切面时，可以使用@Order(int num)定义切面的优先级，值越小优先级越高
@Aspect
@Component
public class MyAspectJ {

    /**
     * 定义一个方法，用于声明切入点表达式，一般情况下，该方法中不需要填入其他代码
     * 使用@Pointcut来声明切入点表达式
     * 其他通知可以直接使用方法名来引用此切入点表达式
     */
    @Pointcut("execution(* com.jiangcl.spring.aop.annotation.*.*(..))")
    public void declareJoinPointExpression(){}

    /**
     * @desc 声明一个前置通知：在目标方法开始之前执行
     * @author jiangcl
     * @date 2019/12/20
     * @param joinPoint
     * @return void
     */
    @Before("declareJoinPointExpression()")
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
    @After("declareJoinPointExpression()")
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
    @AfterReturning(value = "declareJoinPointExpression()",returning = "result")
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
    @AfterThrowing(value = "declareJoinPointExpression()",throwing = "e")
    public void afterThrowing(JoinPoint joinPoint,Exception e){
        String name = joinPoint.getSignature().getName();
        System.out.println("异常通知：the methd " + name + " occur Exception " + e);
    }


}

package com.jiangcl.spring.transcation.aspect;

import com.jiangcl.spring.transcation.annotation.ResultValue;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author jiangcl
 * @date 2019/12/24
 * @desc 定义一个切面，用来解析注解
 */
@Aspect
@Component
public class AnalysisAnnotation {

    /**
     * 定义一个返回通知，用于获取查询的值
     * @param joinPoint
     * @param result
     */
    @AfterReturning(value = "execution(* com.jiangcl.spring.transcation.dao.PurchaseDaoImpl.*(..))",returning = "result")
    public void afterResult(JoinPoint joinPoint,Object result) throws NoSuchMethodException {
        //获取切点所在的类
        Object target = joinPoint.getTarget();
        Class<?> aClass = target.getClass();
        //获取切点所在的方法名字
        String name = joinPoint.getSignature().getName();
        //获取切点方法的参数列表
        Object[] args = joinPoint.getArgs();
        //组装切点方法列表的参数类型
        Class[] class1 = new Class[args.length];
        //获取方法信息
        Method method = null;
        if(args.length > 0){
            for(int i = 0;i < args.length; i++){
                class1[i] = args[i].getClass();
            }
            method = aClass.getDeclaredMethod(name,class1);
        }else {
            method = aClass.getDeclaredMethod(name);
        }
        //获取方法的注解信息，此处可以根据不同的信息写不同的逻辑代码
        ResultValue annotation = method.getAnnotation(ResultValue.class);
        String value = annotation.value();
        System.out.println(value + " 的返回值是：" + result);

    }
}

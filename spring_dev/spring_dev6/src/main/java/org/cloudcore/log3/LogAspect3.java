package org.cloudcore.log3;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @author pengjun
 * @create 2021-08-17 1:00
 */
@Aspect
public class LogAspect3 {
    @Before("execution(* org.cloudcore.service.UserServiceImpl.*(..))")
    public void before() {
        System.out.println("333注解前置通知");
    }

    @After("execution(* org.cloudcore.service.UserServiceImpl.*(..))")
    public void after() {
        System.out.println("333注解后置通知");
    }

    @Around("execution(* org.cloudcore.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("333环绕前...");

        //获取连接点的信息(前面)
        Signature signature = joinPoint.getSignature();

        //执行连接点的业务方法
        Object proceed = joinPoint.proceed();

        System.out.println("333环绕后..."+signature);
    }
}

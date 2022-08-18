package com.dao;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @author diqiuqiu
 * @version v1.0
 * @Description TODO
 * @date 2022-07-17
 */
public class Logging {

    public void before() {
        System.out.println("前置通知。。。。");
    }

    public void after() {
        System.out.println("后置通知。。。。");
    }

    public void afterReturn(Object rt) {
        System.out.println("后置返回通知。。。。");
    }

    public void afterThrow() {
        System.out.println("后置异常通知。。。。");
    }

    public void around(ProceedingJoinPoint pj) throws Throwable {
        System.out.println("环绕通知1111。。。。");
        Object proceed = pj.proceed();
        System.out.println(proceed.toString());
        System.out.println("环绕通知2222。。。。");
    }
}

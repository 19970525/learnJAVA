package com.dao;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author diqiuqiu
 * @version v1.0
 * @Description TODO
 * @date 2022-07-17
 */
@Component("loggingBean")
@Aspect
public class Logging {

    @Before("pointCut()")
    public void before() {
        System.out.println("前置通知。。。。");
    }

    @After("pointCut()")
    public void after() {
        System.out.println("后置通知。。。。");
    }

    @AfterReturning("pointCut()")
    public void afterReturn(Object rt) {
        System.out.println("后置返回通知。。。。"+rt);
    }

    @AfterThrowing("pointCut()")
    public void afterThrow(Exception exception) {
        System.out.println("后置异常通知。。。。");
    }

    @Around("pointCut()")
    public void around(ProceedingJoinPoint pj) throws Throwable {
        System.out.println("环绕通知1111。。。。");
        //获取连接点信息
        Signature signature = pj.getSignature();
        //调用连接点的方法
        Object proceed = pj.proceed();
        System.out.println(proceed.toString()+"环绕里面的");
        System.out.println("环绕通知2222。。。。"+signature);
    }

    @Pointcut("execution(public String com.dao.StudyDao.doThing(..))")
    public void pointCut() {}
}

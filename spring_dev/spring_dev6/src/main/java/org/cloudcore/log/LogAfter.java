package org.cloudcore.log;

import org.springframework.aop.AfterAdvice;
import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author pengjun
 * @create 2021-08-16 21:56
 */
public class LogAfter implements AfterReturningAdvice {
    /*
    o：方法返回对象
     */
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("111后置返回通知：执行了类" + o1.getClass().getName() + "的" + method.getName() +
                "方法，方法的参数有：" + Arrays.toString(objects) + "返回对象是：" + o);
    }
}

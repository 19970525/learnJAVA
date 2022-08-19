package org.cloudcore.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author pengjun
 * @create 2021-08-16 21:46
 */
public class LogBefore implements MethodBeforeAdvice {
    /*
    method:要执行的目标对象的方法
    objects：参数
    o：目标对象
     */
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("111前置通知：执行了类" + o.getClass().getName() + "的" + method.getName() +
                "方法，方法的参数有：" + Arrays.toString(objects));
    }
}

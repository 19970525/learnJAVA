package com.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author diqiuqiu
 * @version v1.0
 * @Description TODO
 * @date 2022-07-26
 */
public class Common {
    private Target target;
    private Advice advice;

    public Object createProxy() {
        TargetInterface pro = (TargetInterface) Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        advice.before();
                        Object invoke = method.invoke(target, args);
                        advice.after();
                        return invoke;
                    }
                });
        return pro;
    }

    public void setTarget(Target target) {
        this.target = target;
    }

    public void setAdvice(Advice advice) {
        this.advice = advice;
    }
}

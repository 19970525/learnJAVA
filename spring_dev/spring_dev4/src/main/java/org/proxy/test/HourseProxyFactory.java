package org.proxy.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author pengjun
 * @create 2021-04-02 10:15
 * 代理工厂获取代理实例
 */
public class HourseProxyFactory {
    private Object target;

    public HourseProxyFactory(Object target) {
        this.target = target;
    }

    /*
    Proxy静态方法获取代理实例
     */
    public Object getProxyInstance() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object returnVal = method.invoke(target, args);
                return returnVal;
            }
        });
    }
}

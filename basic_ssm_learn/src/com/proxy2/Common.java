package com.proxy2;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author diqiuqiu
 * @version v1.0
 * @Description TODO
 * @date 2022-07-26
 */
public class Common {

    private Target target2;
    private Advice advice2;

    public Object createProxy() {
        //创建增强器
        Enhancer enhancer = new Enhancer();
        //设置父类目标
        enhancer.setSuperclass(Target.class);
        //设置回调
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                advice2.before();
                Object invoke = method.invoke(target2, objects);
                advice2.after();
                return invoke;
            }
        });
        Target proxy = (Target) enhancer.create();
        return proxy;
    }

    public void setTarget2(Target target2) {
        this.target2 = target2;
    }

    public void setAdvice2(Advice advice2) {
        this.advice2 = advice2;
    }
}

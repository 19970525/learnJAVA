package com.proxy2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author diqiuqiu
 * @version v1.0
 * @Description TODO CGLIB动态代理方式 产生代理对象
 * 条件： 目标代理类不需要实现接口
 * @date 2022-07-26
 */
public class ProxyTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Common common = applicationContext.getBean(Common.class);
        Target proxy = (Target) common.createProxy();
        proxy.save();
    }
}

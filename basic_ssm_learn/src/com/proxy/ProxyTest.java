package com.proxy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author diqiuqiu
 * @version v1.0
 * @Description TODO JDK动态代理方式 产生代理对象
 * 条件： 目标代理类需要实现接口
 * @date 2022-07-26
 */
public class ProxyTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Common common = applicationContext.getBean(Common.class);
        TargetInterface proxy = (TargetInterface) common.createProxy();
        proxy.save();
    }
}

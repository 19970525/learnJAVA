package org.proxy.test;

/**
 * @author pengjun
 * @create 2021-04-02 10:22
 */
public class MyTest {

    public static void main(String[] args) {
        Hourse hourse = new Hourse();
        HourseProxyFactory hourseProxyFactory = new HourseProxyFactory(hourse);
        IHourse proxyInstance = (IHourse) hourseProxyFactory.getProxyInstance();
        proxyInstance.sellHourse();
        proxyInstance.sellHourse2();
    }
}

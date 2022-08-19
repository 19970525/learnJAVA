package org.proxy.statictest;

/**
 * @author pengjun
 * @create 2021-04-02 10:22
 */
public class MyTest {

    public static void main(String[] args) {
        Hourse hourse = new Hourse();
        HourseProxy proxyFactory = new HourseProxy(hourse);
        proxyFactory.sellHourse();
        proxyFactory.writeOrder();
        proxyFactory.getMoney();
    }
}

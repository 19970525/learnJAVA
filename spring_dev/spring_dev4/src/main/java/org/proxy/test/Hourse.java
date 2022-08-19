package org.proxy.test;

/**
 * @author pengjun
 * @create 2021-04-02 10:06
 * 房东（被代理类）
 */
public class Hourse implements IHourse {

    @Override
    public void sellHourse() {
        System.out.println("卖房了！谁买房？");
    }

    @Override
    public void sellHourse2() {
        System.out.println("卖第2套房了！谁买房？");
    }
}

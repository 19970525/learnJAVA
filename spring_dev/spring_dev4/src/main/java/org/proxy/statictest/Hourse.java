package org.proxy.statictest;

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
}

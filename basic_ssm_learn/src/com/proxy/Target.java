package com.proxy;

/**
 * @author diqiuqiu
 * @version v1.0
 * @Description TODO 代理目标类
 * @date 2022-07-26
 */
public class Target implements TargetInterface {

    @Override
    public void save() {
        System.out.println("执行save方法.....");
    }
}

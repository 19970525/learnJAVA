package com.proxy2;

/**
 * @author diqiuqiu
 * @version v1.0
 * @Description TODO 切面类
 * @date 2022-07-26
 */
public class Advice {

    public void before() {
        System.out.println("before2方法执行。。。");
    }

    public void after() {
        System.out.println("after2方法执行。。。");
    }
}

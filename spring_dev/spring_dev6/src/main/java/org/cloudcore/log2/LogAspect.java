package org.cloudcore.log2;

/**
 * @author pengjun
 * @create 2021-08-17 0:38
 * 自定义切面(第2种方式)
 */
public class LogAspect {

    public void before() {
        System.out.println("222自定义前置通知");
    }

    public void after() {
        System.out.println("222自定义后置通知");
    }
}

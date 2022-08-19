package org.proxy.statictest;

/**
 * @author pengjun
 * @create 2021-04-02 10:15
 * 中介（代理类）--静态代理
 */
public class HourseProxy implements IHourse {
    private IHourse target;

    public HourseProxy(IHourse target) {
        this.target = target;
    }

    @Override
    public void sellHourse() {
        log("sellHourse");
        target.sellHourse();
    }

    /*
    中介的其他业务
     */
    public void getMoney() {
        log("getMoney:收取中介费！");
        System.out.println("收取中介费！");
    }

    /*
    中介的其他业务
     */
    public void writeOrder() {
        log("writeOrder:签买房合同...");
        System.out.println("签买房合同...");
    }

    /*
    切面方法
     */
    public void log(String msg) {
        System.out.println("[debug-]"+ msg);
    }
}

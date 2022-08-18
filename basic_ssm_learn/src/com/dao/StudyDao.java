package com.dao;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author diqiuqiu
 * @version v1.0
 * @Description TODO
 * @date 2022-07-17
 */
public class StudyDao {

    @Value("diqiuqiu")
    private String name;
    @Value("学习")
    private String active;
    @Value("SpringFramework")
    private String thing;

    public String doThing() {
        System.out.println("学习类："+this.getName()+this.getActive()+this.getThing());
        return "学习类："+this.getName()+this.getActive()+this.getThing();
    }

    public String getName() {
        return name;
    }

    public String getActive() {
        return active;
    }

    public String getThing() {
        return thing;
    }

    @Override
    public String toString() {
        return "StudyDao{" +
                "name='" + name + '\'' +
                ", active='" + active + '\'' +
                ", thing='" + thing + '\'' +
                '}';
    }
}

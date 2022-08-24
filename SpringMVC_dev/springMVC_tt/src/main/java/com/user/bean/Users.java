package com.user.bean;

import java.util.Map;

/**
 * @author diqiuqiu
 * @version v1.0
 * @Description TODO
 * @date 2022-08-24
 */
public class Users {

    private String name;
    private Integer age;
    private Map<String,Integer> sorces;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Map<String, Integer> getSorces() {
        return sorces;
    }

    public void setSorces(Map<String, Integer> sorces) {
        this.sorces = sorces;
    }

    @Override
    public String toString() {
        return "Users{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sorces=" + sorces +
                '}';
    }
}

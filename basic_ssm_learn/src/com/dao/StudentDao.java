package com.dao;

/**
 * @author diqiuqiu
 * @version v1.0
 * @Description TODO
 * @date 2022-07-14
 */
public class StudentDao {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void init() {
        System.out.println("11111111111");
    }

    public void destroy() {
        System.out.println("2222222222");
    }

    @Override
    public String toString() {
        return "StudentDao{" +
                "name='" + name + '\'' +
                '}';
    }
}

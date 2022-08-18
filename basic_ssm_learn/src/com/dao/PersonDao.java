package com.dao;

/**
 * @author diqiuqiu
 * @version v1.0
 * @Description TODO
 * @date 2022-07-14
 */
public class PersonDao {

    private String name;
    private MessageDao messageDao;

    public PersonDao(String name, MessageDao messageDao) {
        this.name = name;
        this.messageDao = messageDao;
    }

    @Override
    public String toString() {
        return "PersonDao{" +
                "name='" + name + '\'' +
                ", messageDao=" + messageDao +
                '}';
    }
}

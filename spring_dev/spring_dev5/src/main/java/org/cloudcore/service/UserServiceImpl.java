package org.cloudcore.service;

import org.cloudcore.daodao.UserDao;

/**
 * @author pengjun
 * @create 2021-03-30 21:03
 */
public class UserServiceImpl implements UserService {

    private String name;

    private UserDao userDao;

    @Override
    public void selectUser() {
        userDao.selectById();
        System.out.println(name);
    }
}

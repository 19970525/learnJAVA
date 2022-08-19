package org.cloudcore.service;

import org.cloudcore.daodao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.lang.Nullable;

import javax.annotation.Resource;
import java.util.Arrays;

/**
 * @author pengjun
 * @create 2021-03-25 21:34
 */
public class UserServiceImpl implements UserService {

    private String name;
    @Autowired
    @Qualifier("userDao")
    private UserDao userDao;
    @Resource
    private String[] likes;

    public void setName(@Nullable String name) {
        this.name = name;
    }

    public void setLikes(String[] likes) {
        this.likes = likes;
    }

    @Override
    public void userLogin() {
        System.out.println(userDao.selectById());
        System.out.println(name);
        System.out.println(Arrays.toString(likes));
    }
}

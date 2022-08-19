package org.cloudcore.service;

import org.cloudcore.daodao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @author pengjun
 * @create 2021-03-30 21:03
 */
//@Component
//@Repository
@Service
//@Controller
@Scope("singleton")
public class UserServiceImpl implements UserService {

    @Value("彭俊")
    private String name;
    @Autowired
    @Qualifier("userDaoImpl")
    private UserDao userDao;

    @Override
    public void selectUser() {
        System.out.println(userDao.selectById());
        System.out.println(name);
    }
}

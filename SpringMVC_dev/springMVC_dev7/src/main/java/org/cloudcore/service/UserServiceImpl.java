package org.cloudcore.service;

import org.cloudcore.dao.UserDao;
import org.cloudcore.pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author pengjun
 * @version v1.0
 * @create 2021-09-05 19:31
 * @Description TODO
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void addUser(Users user) {
        userDao.addUser(user);
    }

    @Override
    public void delUserById(int id) {
        userDao.delUserById(id);
    }

    @Override
    public void updateUser(Users user) {
        userDao.updateUser(user);
    }

    @Override
    public Users queryUserById(int id) {
        return userDao.queryUserById(id);
    }

    @Override
    public List<Users> queryUsers(String str) {
        return userDao.queryUsers(str);
    }
}

package org.cloudcore.service;

import org.cloudcore.pojo.Users;

import java.util.List;

/**
 * @author pengjun
 * @version v1.0
 * @create 2021-09-05 19:30
 * @Description TODO
 */
public interface UserService {

    /**
    * @param user
    * @throws
    * @Description TODO
    */
    void addUser(Users user);

    /**
    * @param id
    * @throws
    * @Description TODO
    */
    void delUserById(int id);

    /**
    * @param user
    * @throws
    * @Description TODO
    */
    void updateUser(Users user);

    /**
    * @param id
    * @return
    * @throws ClassNotFoundException 类找不到异常
    * @Description TODO
    */
    Users queryUserById(int id);

    List<Users> queryUsers(String str);
}

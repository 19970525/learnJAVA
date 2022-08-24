package org.cloudcore.dao;

import org.apache.ibatis.annotations.Select;
import org.cloudcore.pojo.Users;

import java.util.List;

/**
 * @author pengjun
 * @version v1.0
 * @create 2021-09-05 18:43
 * @Description TODO
 */
public interface UserDao {

    /**
    * @param users
    * @throws
    * @Description TODO 添加用户
    */
    void addUser(Users users);

    /**
    * @param id
    * @return
    * @throws
    * @Description TODO
    */
    void delUserById(int id);

    /**
    * @param users
    * @return
    * @throws
    * @Description TODO
    */
    void updateUser(Users users);

    /**
    * @param id
    * @return
    * @throws
    * @Description TODO
    */
    Users queryUserById(int id);

    /**
    * @param str
    * @return
    * @throws
    * @Description TODO
    */
    List<Users> queryUsers(String str);
}

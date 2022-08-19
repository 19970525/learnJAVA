package org.cloudcore.ddao;

import org.cloudcore.pojo.Users;

/**
 * @author pengjun
 * @version v1.0
 * @create 2021-08-25 16:14
 * @Description TODO 用户表beauty的操作接口
 */
public interface UserDaoMapper {
    /*
    * @Description TODO 添加一个新用户信息
    */
    void addUser(Users user);

    /*
    * @Description TODO 根据用户ID删除用户信息
    */
    void delUser(int id);

    /*
    * @Description TODO 修改用户信息
    */
    void updateUser(Users user);

    /*
    * @Description TODO 通过用户ID查询用户信息
    */
    Users queryUser(int id);
}

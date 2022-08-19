package org.cloudcore.daodao;

import org.cloudcore.pojo.Users;

import java.util.List;

/**
 * @author pengjun
 * @create 2021-08-24 6:35
 */
public interface UserDaoMapper {

    List<Users> selectUserById(int id);
}

package org.cloudcore.daodao;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

/**
 * @author pengjun
 * @create 2021-03-25 21:32
 */
@Repository
@Scope("singleton")
public class UserDaoImpl implements UserDao{
    @Override
    public String selectById() {
        return "通过userId查到了用户信息....";
    }
}

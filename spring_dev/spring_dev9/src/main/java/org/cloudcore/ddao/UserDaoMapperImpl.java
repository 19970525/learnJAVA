package org.cloudcore.daodao;

import org.cloudcore.pojo.Users;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * @author pengjun
 * @create 2021-08-24 6:58
 */
public class UserDaoMapperImpl extends SqlSessionDaoSupport implements UserDaoMapper {

    @Override
    public List<Users> selectUserById(int id) {
        return getSqlSession().getMapper(UserDaoMapper.class).selectUserById(id);
    }
}

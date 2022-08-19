package org.cloudcore.ddao;

import org.cloudcore.ddao.UserDaoMapper;
import org.cloudcore.pojo.Users;
import org.mybatis.spring.support.SqlSessionDaoSupport;

/**
 * @author pengjun
 * @version v1.0
 * @create 2021-08-25 16:52
 * @Description TODO
 */
public class UserDaoMapperImpl extends SqlSessionDaoSupport implements UserDaoMapper {
    @Override
    public void addUser(Users user) {
        getSqlSession().getMapper(UserDaoMapper.class).addUser(user);
    }

    @Override
    public void delUser(int id) {
        getSqlSession().getMapper(UserDaoMapper.class).delUser(id);
    }

    @Override
    public void updateUser(Users user) {
        getSqlSession().getMapper(UserDaoMapper.class).updateUser(user);
    }

    @Override
    public Users queryUser(int id) {
        return getSqlSession().getMapper(UserDaoMapper.class).queryUser(id);
    }
}

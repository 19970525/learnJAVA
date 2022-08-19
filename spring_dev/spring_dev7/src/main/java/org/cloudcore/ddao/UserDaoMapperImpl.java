package org.cloudcore.dao;

import org.cloudcore.pojo.Users;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

/**
 * @author pengjun
 * @create 2021-08-24 6:58
 */
public class UserDaoMapperImpl implements UserDaoMapper {

    private SqlSessionTemplate seqSession;

    public void setSeqSession(SqlSessionTemplate seqSession) {
        this.seqSession = seqSession;
    }

    @Override
    public List<Users> selectUserById(int id) {
        UserDaoMapper mapper = seqSession.getMapper(UserDaoMapper.class);
        List<Users> users = mapper.selectUserById(id);
        return users;
    }
}

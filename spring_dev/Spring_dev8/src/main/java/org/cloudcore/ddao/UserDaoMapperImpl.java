package org.cloudcore.dao;

import org.cloudcore.pojo.Users;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author pengjun
 * @create 2021-08-24 10:08
 */
@Component("userDaoMapper")
@Scope("singleton")
public class UserDaoMapperImpl implements org.cloudcore.daodao.UserDaoMapper {

    @Autowired
    @Qualifier("sqlSession")
    private SqlSessionTemplate sqlSession;

//    public void setSqlSession(SqlSessionTemplate sqlSession) {
//        this.sqlSession = sqlSession;
//    }

    @Override
    public List<Users> selectUserById(int id) {
        org.cloudcore.daodao.UserDaoMapper mapper = sqlSession.getMapper(org.cloudcore.daodao.UserDaoMapper.class);
        return mapper.selectUserById(id);
    }
}

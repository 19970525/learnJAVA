package org.cloudcore.test;

import org.cloudcore.config.MysConfig;
import org.cloudcore.ddao.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author pengjun
 * @create 2021-08-12 16:21
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MysConfig.class)
public class MyTest {

    @Autowired
    private UserDao userDao;
    @Test
    public void test(){
//        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MysConfig.class);
//        UserDao userService = (UserDao) applicationContext.getBean("userDao");
//        System.out.println(userService.selectById());
        System.out.println(userDao.selectById());
    }
}

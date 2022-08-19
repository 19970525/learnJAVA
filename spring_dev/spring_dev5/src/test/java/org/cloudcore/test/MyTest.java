package org.cloudcore.test;

import org.cloudcore.config.MysConfig;
import org.cloudcore.daodao.UserDao;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author pengjun
 * @create 2021-08-12 16:21
 */
public class MyTest {
    @Test
    public void test(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MysConfig.class);
        UserDao userService = (UserDao) applicationContext.getBean("userDao");
        System.out.println(userService.selectById());
    }
}

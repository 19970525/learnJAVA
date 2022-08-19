package org.cloudcore.test;

import org.cloudcore.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author pengjun
 * @create 2021-08-16 22:44
 */
public class MyTest {

    @Test
    public void myTest() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userServiceImpl = (UserService) context.getBean("userServiceImpl");
        userServiceImpl.add();
        userServiceImpl.delete();
        userServiceImpl.update();
        userServiceImpl.select(2);
    }
}

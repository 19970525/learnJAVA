package org.cloudcore.user;

import org.cloudcore.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author pengjun
 * @create 2021-03-25 21:39
 */
public class MyTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService bean = (UserService) context.getBean("uuu");
        UserService bean1 = (UserService) context.getBean("uuu");
        bean.userLogin();
        bean1.userLogin();
        System.out.println(bean == bean1);
    }
}

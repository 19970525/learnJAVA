package test;

import org.cloudcore.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author pengjun
 * @create 2021-03-30 21:08
 */
public class MyTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserServiceImpl user = (UserServiceImpl) context.getBean("userServiceImpl");
        user.selectUser();
    }
}

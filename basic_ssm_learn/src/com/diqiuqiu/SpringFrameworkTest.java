package com.diqiuqiu;

import com.dao.StudyDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author diqiuqiu
 * @version v1.0
 * @Description TODO
 * @date 2022-07-13
 */
public class SpringFrameworkTest {

    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        BeanFactory context = new ClassPathXmlApplicationContext("beans.xml");
        //property的set注入方式
//        MessageDao bean = context.getBean("messageBean", MessageDao.class);
//        String message = bean.getMessage();
//        System.out.println(message);

        //xml构造器注入方式
//        PersonDao personBean = context.getBean("personBean2", PersonDao.class);
//        System.out.println(personBean.toString());

        //测试初始化、销毁实例自动执行方法
//        StudentDao studentBean = context.getBean("studentBean", StudentDao.class);
//        System.out.println(studentBean.toString());
        //手动关闭上下文
//        ((ClassPathXmlApplicationContext) context).registerShutdownHook();

        //继承父Bean
//        SonMessageDao sonMessageBean = context.getBean("sonMessageBean", SonMessageDao.class);
//        System.out.println(sonMessageBean.toString());
//        System.out.println(sonMessageBean.getMessage());

        //内部Bean
//        BuyCatDao buyCarBean = context.getBean("buyCarBean", BuyCatDao.class);

        //注入集合
//        AddressDao addressBean = context.getBean("addressBean", AddressDao.class);
//        System.out.println(addressBean.toString());

        //自动装配注入
//        PersonalInfoDao personalInfoBean = context.getBean("personalInfoBean", PersonalInfoDao.class);
//        System.out.println(personalInfoBean.toString());
//        PersonalInfoDao personalInfoBean2 = context.getBean("personalInfoBean2", PersonalInfoDao.class);
//        System.out.println(personalInfoBean2.toString());
//        PersonDao personBean3 = context.getBean("personBean3", PersonDao.class);
//        System.out.println(personBean3.toString());

        //注解注入方式
//        BuyShoesDao buyShoesBean = context.getBean("buyShoesBean", BuyShoesDao.class);
//        System.out.println(buyShoesBean.toString());

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("beans.xml");
        //spring AOP
        StudyDao studyBean = context.getBean("studyBean", StudyDao.class);
        studyBean.doThing();


    }
}

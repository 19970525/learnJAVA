import org.apache.log4j.Logger;
import org.cloudcore.ddao.UserDaoMapper;
import org.cloudcore.pojo.Users;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Timestamp;
import java.util.Date;

/**
 * @author pengjun
 * @create 2021-08-25 15:59
 */
public class MyTest {

    @Test
    public void test() {
        Logger log = Logger.getLogger(MyTest.class);
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDaoMapper userDaoMapper = (UserDaoMapper) context.getBean("userDaoMapperImpl");
        userDaoMapper.addUser(new Users("张三", "男", new Timestamp(new Date().getTimezoneOffset()), "19171277869", null, 5));

        userDaoMapper.delUser(11);

        Users user = new Users();
        user.setId(11);
        user.setName("李四");
        userDaoMapper.updateUser(user);

        Users users = userDaoMapper.queryUser(8);
        log.info(users);

    }
}

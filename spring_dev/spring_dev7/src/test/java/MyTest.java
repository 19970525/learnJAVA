import org.cloudcore.dao.UserDaoMapper;
import org.cloudcore.pojo.Users;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author pengjun
 * @create 2021-08-24 7:25
 */
public class MyTest {

    @Test
    public void myTest() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDaoMapper userDao = (UserDaoMapper) context.getBean("userDao");
        List<Users> users = userDao.selectUserById(2);
        for (Users user : users) {
            System.out.println(user);
        }
    }
}

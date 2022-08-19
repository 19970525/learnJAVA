import org.apache.log4j.Logger;
import org.cloudcore.daodao.UserDaoMapper;
import org.cloudcore.pojo.Users;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author pengjun
 * @create 2021-08-24 9:55
 */
public class MyTest {

    @Test
    public void test() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDaoMapper bean = (UserDaoMapper) context.getBean("userDaoMapper");
        List<Users> users = bean.selectUserById(2);

        Logger log = Logger.getLogger(MyTest.class);
        for (Users user : users) {
            log.info(user);
        }
    }
}

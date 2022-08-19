package org.cloudcore.config;

import org.cloudcore.daodao.UserDao;
import org.cloudcore.daodao.UserDaoImpl;
import org.cloudcore.service.UserService;
import org.cloudcore.service.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author pengjun
 * @create 2021-08-12 16:16
 */
@Configuration
@ComponentScan("org.cloudcore")
//@Import(MysConfig2.class)
public class MysConfig {

    @Bean
    public UserDao userDao(){
        return new UserDaoImpl();
    }

    @Bean
    public UserService userService(){
        return new UserServiceImpl();
    }
}

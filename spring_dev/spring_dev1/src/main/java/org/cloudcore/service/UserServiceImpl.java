package org.cloudcore.service;

import org.cloudcore.daodao.OrderDao;
import org.cloudcore.daodao.UserDao;

import java.util.Arrays;

/**
 * @author pengjun
 * @create 2021-03-25 21:34
 */
public class UserServiceImpl implements UserService {

    private String name;
    private UserDao userDAO;
    private OrderDao orderDao;
    private String[] likes;

    public void setUserDAO(UserDao userDAO) {
        this.userDAO = userDAO;
    }

    public void setOrderDao(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    public void setLikes(String[] likes) {
        this.likes = likes;
    }

    @Override
    public void userLogin() {
        System.out.println(userDAO.selectById());
        System.out.println(orderDao.selectOrders());
        System.out.println(Arrays.toString(likes));
    }
}

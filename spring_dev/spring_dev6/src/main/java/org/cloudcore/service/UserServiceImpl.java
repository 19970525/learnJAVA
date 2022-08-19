package org.cloudcore.service;

/**
 * @author pengjun
 * @create 2021-08-16 21:43
 */
public class UserServiceImpl implements UserService {
    @Override
    public void add() {
        System.out.println("添加一个用户....................");
    }

    @Override
    public void delete() {
        System.out.println("删除一个用户....................");
    }

    @Override
    public void update() {
        System.out.println("修改一个用户...");
    }

    @Override
    public String select(Integer id) {
        System.out.println("查询一个用户...");
        return "成功";
    }

}

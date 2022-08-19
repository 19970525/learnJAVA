package org.cloudcore.service;

/**
 * @author pengjun
 * @create 2021-08-16 21:42
 */
public interface UserService {
    void add();
    void delete();
    void update();
    String select(Integer id);
}

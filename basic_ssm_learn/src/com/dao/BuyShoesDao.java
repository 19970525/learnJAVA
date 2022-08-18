package com.dao;

import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * @author diqiuqiu
 * @version v1.0
 * @Description TODO
 * @date 2022-07-17
 */
public class BuyShoesDao {

    @Value("19.9")
    private String buyPrices;
//    @Autowired
//    @Qualifier("shoesInfoBean")
    @Resource(name = "shoesInfoBean")
    private ShoesInfoDao shoesInfoDao;

    @PostConstruct
    public void init() {
        System.out.println("PostConstruct初始化方法。。。。");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("PreDestroy销毁方法。。。。");
    }

    @Override
    public String toString() {
        return "BuyShoesDao{" +
                "buyPrices='" + buyPrices + '\'' +
                ", shoesInfoDao=" + shoesInfoDao +
                '}';
    }
}

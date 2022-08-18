package com.dao;

/**
 * @author diqiuqiu
 * @version v1.0
 * @Description TODO
 * @date 2022-07-15
 */
public class BuyCatDao {

    private CarDao carDao;

    public BuyCatDao() {
        System.out.println("进入BuyCarDao....");
    }

    public CarDao getCarDao() {
        return carDao;
    }

    public void setCarDao(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public String toString() {
        return "BuyCatDao{" +
                "carDao=" + carDao +
                '}';
    }
}

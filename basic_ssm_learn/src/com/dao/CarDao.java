package com.dao;

/**
 * @author diqiuqiu
 * @version v1.0
 * @Description TODO
 * @date 2022-07-15
 */
public class CarDao {

    private String carName;
    private String carColor;

    public CarDao() {
        System.out.println("进入CarDao....");
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    @Override
    public String toString() {
        return "CarDao{" +
                "carName='" + carName + '\'' +
                ", carColor='" + carColor + '\'' +
                '}';
    }
}

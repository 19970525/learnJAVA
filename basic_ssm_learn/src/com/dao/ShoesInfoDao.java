package com.dao;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author diqiuqiu
 * @version v1.0
 * @Description TODO
 * @date 2022-07-17
 */
public class ShoesInfoDao {

    @Value("ST01")
    private String shoesType;
    @Value("red")
    private String shoesColor;

    public String getShoesType() {
        return shoesType;
    }

    public void setShoesType(String shoesType) {
        this.shoesType = shoesType;
    }

    public String getShoesColor() {
        return shoesColor;
    }

    public void setShoesColor(String shoesColor) {
        this.shoesColor = shoesColor;
    }

    @Override
    public String toString() {
        return "ShoesInfoDao{" +
                "shoesType='" + shoesType + '\'' +
                ", shoesColor='" + shoesColor + '\'' +
                '}';
    }
}

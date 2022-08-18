package com.dao;

/**
 * @author diqiuqiu
 * @version v1.0
 * @Description TODO
 * @date 2022-07-15
 */
public class IDCardDao {

    private String idNo;
    private String idType;

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    @Override
    public String toString() {
        return "IDCardDao{" +
                "idNo='" + idNo + '\'' +
                ", idType='" + idType + '\'' +
                '}';
    }
}

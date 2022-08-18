package com.dao;

/**
 * @author diqiuqiu
 * @version v1.0
 * @Description TODO
 * @date 2022-07-15
 */
public class PersonalInfoDao {

    private String userName;
    private IDCardDao idCardDao;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public IDCardDao getIdCardDao() {
        return idCardDao;
    }

    public void setIdCardDao(IDCardDao idCardDao) {
        this.idCardDao = idCardDao;
    }

    @Override
    public String toString() {
        return "PersonalInfoDao{" +
                "userName='" + userName + '\'' +
                ", idCardDao=" + idCardDao +
                '}';
    }
}

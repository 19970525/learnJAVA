package com.dao;

/**
 * @author diqiuqiu
 * @version v1.0
 * @Description TODO
 * @date 2022-07-14
 */
public class SonMessageDao extends MessageDao {

    private String messNum;
    private String messPerson;

    public String getMessNum() {
        return messNum;
    }

    public void setMessNum(String messNum) {
        this.messNum = messNum;
    }

    public String getMessPerson() {
        return messPerson;
    }

    public void setMessPerson(String messPerson) {
        this.messPerson = messPerson;
    }

    @Override
    public String toString() {
        return "SonMessageDao{" +
                "messNum='" + messNum + '\'' +
                ", messPerson='" + messPerson + '\'' +
                '}';
    }
}

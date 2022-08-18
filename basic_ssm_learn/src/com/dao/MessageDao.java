package com.dao;

/**
 * @author diqiuqiu
 * @version v1.0
 * @Description TODO
 * @date 2022-07-13
 */
public class MessageDao {

    private String message;
    private String messNum;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessNum() {
        return messNum;
    }

    public void setMessNum(String messNum) {
        this.messNum = messNum;
    }

    @Override
    public String toString() {
        return "MessageDao{" +
                "message='" + message + '\'' +
                ", messNum='" + messNum + '\'' +
                '}';
    }
}

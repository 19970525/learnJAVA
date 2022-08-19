package org.cloudcore.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @author pengjun
 * @create 2021-08-24 6:42
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Users implements Serializable {
    private int id;
    private String name;
    private String sex;
    private Timestamp borndate;
    private String phone;
    private String photo;
    private int boyfriend_id;

    public Users(String name, String sex, Timestamp borndate, String phone, String photo, int boyfriend_id) {
        this.name = name;
        this.sex = sex;
        this.borndate = borndate;
        this.phone = phone;
        this.photo = photo;
        this.boyfriend_id = boyfriend_id;
    }
}

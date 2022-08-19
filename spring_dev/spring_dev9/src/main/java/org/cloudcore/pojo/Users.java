package org.cloudcore.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @author pengjun
 * @create 2021-08-24 6:42
 */
@Data
@AllArgsConstructor
public class Users implements Serializable {
    private int id;
    private String name;
    private String sex;
    private Timestamp borndate;
    private String phone;
    private String photo;
    private int boyfriend_id;

}

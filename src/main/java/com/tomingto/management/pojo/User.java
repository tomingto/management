package com.tomingto.management.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private String username;
    private String password;
    private String name;
    private Integer age;
    private Integer sex;
    private String birthday;
    private Date created;
    private Date updateed;
    private String note;
 }

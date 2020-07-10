package com.zrf.manager.entity;

import lombok.Data;

import java.sql.Date;

@Data
public class Member {
    private Integer memberId;
    private String username;
    private String password;
    private String sex;
    private String address;
    private String nickname;
    private String phone;
    private String email;
    private Date createTime;
    private Date updateTime;
    private String icon;
    private Integer status;
}

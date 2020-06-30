package com.yzg.gsms.entity;

import lombok.Data;

import java.util.Date;

@Data
public class PrivilegeUser {
    private String id;
    private String name;
    private String password;
    private String phone;
    private Integer isEnabled;
    private String creator;
    private Date createTime;
    private String lastModifier;
    private Date lastModifierTime;
    private int sequence;
}

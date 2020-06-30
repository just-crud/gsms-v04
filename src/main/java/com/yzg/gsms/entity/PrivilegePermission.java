package com.yzg.gsms.entity;

import lombok.Data;

import java.util.Date;

@Data
public class PrivilegePermission {
    private String id;
    private String code;
    private String name;
    private Integer isEnabled;
    private String creator;
    private Date createTime;
    private String lastModifier;
    private Date lastModifierTime;
    private int sequence;
}

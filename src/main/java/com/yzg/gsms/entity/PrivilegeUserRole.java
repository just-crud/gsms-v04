package com.yzg.gsms.entity;

import lombok.Data;

import java.util.Date;

@Data
public class PrivilegeUserRole {
    private String id;
    private String userId;
    private String roleId;
    private Integer isEnabled;
    private String creator;
    private Date createTime;
    private String lastModifier;
    private Date lastModifierTime;
    private int sequence;
}

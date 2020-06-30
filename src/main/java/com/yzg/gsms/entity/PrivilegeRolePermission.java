package com.yzg.gsms.entity;

import lombok.Data;

import java.util.Date;

@Data
public class PrivilegeRolePermission {
    private String id;
    private String roleId;
    private String permissionId;
    private Integer isEnabled;
    private String creator;
    private Date createTime;
    private String lastModifier;
    private Date lastModifierTime;
    private int sequence;
}

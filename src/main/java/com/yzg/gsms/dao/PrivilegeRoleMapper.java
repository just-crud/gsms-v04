package com.yzg.gsms.dao;

import com.yzg.gsms.entity.PrivilegeRole;

public interface PrivilegeRoleMapper {
    void insert(PrivilegeRole privilegeRole);
    PrivilegeRole get(String id);
    void update(PrivilegeRole privilegeRole);
    void delete(String id);
    void logicalDelete(PrivilegeRole privilegeRole);
}

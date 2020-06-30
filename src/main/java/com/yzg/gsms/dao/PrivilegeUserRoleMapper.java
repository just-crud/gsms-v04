package com.yzg.gsms.dao;

import com.yzg.gsms.entity.PrivilegeUserRole;

public interface PrivilegeUserRoleMapper {
    void insert(PrivilegeUserRole privilegeUserRole);
    PrivilegeUserRole get(String id);
    void update(PrivilegeUserRole privilegeUserRole);
    void delete(String id);
    void logicalDelete(PrivilegeUserRole privilegeUserRole);
}

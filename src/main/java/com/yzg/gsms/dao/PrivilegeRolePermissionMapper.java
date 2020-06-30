package com.yzg.gsms.dao;

import com.yzg.gsms.entity.PrivilegeRolePermission;

public interface PrivilegeRolePermissionMapper {
    void insert(PrivilegeRolePermission privilegeRolePermission);
    PrivilegeRolePermission get(String id);
    void update(PrivilegeRolePermission privilegeRolePermission);
    void delete(String id);
    void logicalDelete(PrivilegeRolePermission privilegeRolePermission);
}

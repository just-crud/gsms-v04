package com.yzg.gsms.dao;

import com.yzg.gsms.entity.PrivilegePermission;

public interface PrivilegePermissionMapper {
    void insert(PrivilegePermission privilegePermission);
    PrivilegePermission get(String id);
    void update(PrivilegePermission privilegePermission);
    void delete(String id);
    void logicalDelete(PrivilegePermission privilegePermission);
}

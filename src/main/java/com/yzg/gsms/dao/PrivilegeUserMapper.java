package com.yzg.gsms.dao;

import com.yzg.gsms.entity.PrivilegeUser;

public interface PrivilegeUserMapper {
    void insert(PrivilegeUser privilegeUser);
    PrivilegeUser get(String id);
    void update(PrivilegeUser privilegeUser);
    void delete(String id);
    void logicalDelete(PrivilegeUser privilegeUser);
}

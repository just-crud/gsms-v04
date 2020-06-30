package com.yzg.gsms.service;

import com.yzg.gsms.entity.PrivilegeUser;

public interface PrivilegeUserService {

    PrivilegeUser get(String id);

    void add(PrivilegeUser privilegeUser);
}

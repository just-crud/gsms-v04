package com.yzg.gsms.service.impl;

import com.yzg.gsms.dao.PrivilegeUserMapper;
import com.yzg.gsms.entity.PrivilegeUser;
import com.yzg.gsms.service.PrivilegeUserService;
import org.springframework.stereotype.Service;
import org.springframework.util.IdGenerator;

import javax.annotation.Resource;

@Service
public class PrivilegeUserServiceImpl implements PrivilegeUserService {
    @Resource
    private IdGenerator idGenerator;
    @Resource
    private PrivilegeUserMapper privilegeUserMapper;

    @Override
    public PrivilegeUser get(String id) {
        String s = idGenerator.generateId().toString();
        return privilegeUserMapper.get(id);
    }

    @Override
    public void add(PrivilegeUser privilegeUser) {
        privilegeUserMapper.insert(privilegeUser);
    }
}

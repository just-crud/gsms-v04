package com.yzg.gsms.controller;

import com.github.pagehelper.util.StringUtil;
import com.yzg.gsms.common.ResultMessage;
import com.yzg.gsms.entity.PrivilegeUser;
import com.yzg.gsms.service.PrivilegeUserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@ResponseBody
@RequestMapping("/user")
@RestController
public class PrivilegeUserController {
    @Resource
    private PrivilegeUserService privilegeUserService;

    @PostMapping("/add")
    public ResultMessage add(@RequestBody PrivilegeUser user){
        if(user == null){
            return new ResultMessage(0,"数据不能为空",null);
        }

        privilegeUserService.add(user);

        return new ResultMessage(1,"添加成功",user);
    }

    @GetMapping("/get")
    public ResultMessage get(@RequestParam(value = "id") String id){
        if(StringUtil.isEmpty(id)){
            return new ResultMessage(0,"数据不能为空",null);
        }

        PrivilegeUser privilegeUser = privilegeUserService.get(id);

        return new ResultMessage(1,"添加成功",privilegeUser);
    }

    @PostMapping("/login")
    public ResultMessage login(@RequestBody PrivilegeUser user){

        if(user == null){
            return new ResultMessage(0,"数据不能为空",null);
        }

        PrivilegeUser privilegeUser = privilegeUserService.get(user.getId());
        if(privilegeUser == null){
            return new ResultMessage(0,"用户名或密码错误",user);
        }

        if(!privilegeUser.getPassword().equals(user.getPassword())){
            return new ResultMessage(0,"用户名或密码错误",user);
        }

        return new ResultMessage(1,"合法用户",privilegeUser);
    }
}

package com.yanfei.scaffolding.privilege.controller;

import com.yanfei.scaffolding.privilege.dao.TbPrivilegeRoleMapper;
import com.yanfei.scaffolding.privilege.entity.TbPrivilegeRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by : yanfei
 * Created time : 18/6/20 下午4:37
 */
@RestController
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private TbPrivilegeRoleMapper tbPrivilegeRoleMapper;

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public String test(){
        TbPrivilegeRole tbPrisvilegeRole = tbPrivilegeRoleMapper.selectByPrimaryKey(4);
        System.out.println(tbPrisvilegeRole);
        return "aaa";
    }

}

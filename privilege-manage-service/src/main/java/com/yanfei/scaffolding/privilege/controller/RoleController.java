package com.yanfei.scaffolding.privilege.controller;

import com.yanfei.scaffolding.privilege.request.RoleRequest;
import com.yanfei.scaffolding.privilege.response.Page;
import com.yanfei.scaffolding.privilege.response.ResponseData;
import com.yanfei.scaffolding.privilege.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
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
    private RoleService roleService;

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public ResponseData<Page> roleList(@RequestBody RoleRequest roleRequest){
        Page page = roleService.getRoleList(roleRequest.getRoleName(), roleRequest.getPage());
        return ResponseData.OK(page);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResponseData addRole(@RequestBody RoleRequest roleRequest){
        ResponseData responseData = roleService.addRole(roleRequest.getRoleName(), roleRequest.getRemark());
        return responseData;
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public ResponseData editRole(@RequestBody RoleRequest roleRequest){
        ResponseData responseData = roleService.editRole(roleRequest.getId(), roleRequest.getRoleName(), roleRequest.getRemark());
        return responseData;
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public ResponseData deleteRole(@RequestBody RoleRequest roleRequest){
        ResponseData responseData = roleService.deleteRole(roleRequest.getId());
        return responseData;
    }

}

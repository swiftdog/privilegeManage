package com.yanfei.scaffolding.privilege.controller;

import com.yanfei.scaffolding.privilege.response.PermissionListResp;
import com.yanfei.scaffolding.privilege.response.ResponseData;
import com.yanfei.scaffolding.privilege.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by : yanfei
 * Created time : 18/7/5 下午3:03
 */
@RestController
@RequestMapping("/permission")
public class PermissionController {

    @Autowired
    private PermissionService permissionService;

    @RequestMapping("/list")
    public ResponseData getPermissionList(){
        List<PermissionListResp> permissions = permissionService.getPermissionList();
        return ResponseData.OK(permissions);
    }

}

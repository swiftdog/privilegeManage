package com.yanfei.scaffolding.privilege.service;

import com.yanfei.scaffolding.privilege.response.PermissionListResp;

import java.util.List;

/**
 * Created by : yanfei
 * Created time : 18/7/5 下午3:45
 */
public interface PermissionService {

    List<PermissionListResp> getPermissionList();

}

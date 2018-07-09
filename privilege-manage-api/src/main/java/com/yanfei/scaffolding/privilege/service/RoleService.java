package com.yanfei.scaffolding.privilege.service;

import com.yanfei.scaffolding.privilege.entity.TbPrivilegeRole;
import com.yanfei.scaffolding.privilege.response.Page;
import com.yanfei.scaffolding.privilege.response.ResponseData;
import com.yanfei.scaffolding.privilege.response.RoleListResp;

import java.util.List;

/**
 * Created by : yanfei
 * Created time : 18/6/21 上午11:23
 */
public interface RoleService {


    Page<List<TbPrivilegeRole>> getRoleList(String roleName, Page page);

    ResponseData addRole(String roleName, String remark);

    ResponseData editRole(Integer id, String roleName, String remark);

    ResponseData deleteRole(Integer id);

    RoleListResp getRoleById(Integer id);

    List<Integer> getRolePermissions(Integer roleId);

    ResponseData allocatePermission(Integer roleId, List<Integer> permissions);

}

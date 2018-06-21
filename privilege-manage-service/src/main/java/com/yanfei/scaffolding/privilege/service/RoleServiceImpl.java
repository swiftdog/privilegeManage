package com.yanfei.scaffolding.privilege.service;

import com.alibaba.druid.util.StringUtils;
import com.yanfei.scaffolding.privilege.dao.TbPrivilegeRoleMapper;
import com.yanfei.scaffolding.privilege.dao.TbPrivilegeRolePermissionMapper;
import com.yanfei.scaffolding.privilege.dao.TbPrivilegeUserRoleMapper;
import com.yanfei.scaffolding.privilege.entity.TbPrivilegeRole;
import com.yanfei.scaffolding.privilege.response.Page;
import com.yanfei.scaffolding.privilege.response.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by : yanfei
 * Created time : 18/6/21 上午11:23
 */
@Service
public class RoleServiceImpl implements RoleService{

    @Autowired
    private TbPrivilegeRoleMapper roleDao;

    @Autowired
    private TbPrivilegeUserRoleMapper userRoleDao;

    @Autowired
    private TbPrivilegeRolePermissionMapper rolePermissionDao;

    @Override
    public Page<List<TbPrivilegeRole>> getRoleList(String roleName, Page page) {
        int count = roleDao.countRoleList(roleName);
        page.setCount(count);
        if(count > 0){
            List<TbPrivilegeRole> roleList = roleDao.getRoleList(roleName, page);
            page.setResult(roleList);
        }
        return page;
    }

    @Override
    public ResponseData addRole(String roleName, String remark) {
        int count = roleDao.countRoleByName(roleName);
        if(count > 0)
            return ResponseData.ERROR("角色名称已存在");
        TbPrivilegeRole role = new TbPrivilegeRole();
        role.setRoleName(roleName);
        role.setRemark(remark);
        roleDao.insert(role);
        return ResponseData.OK();
    }

    @Override
    public ResponseData editRole(int id, String roleName, String remark) {
        if(StringUtils.isEmpty(roleName))
            return ResponseData.ERROR("角色名称不能为空");
        TbPrivilegeRole role = roleDao.selectByPrimaryKey(id);
        if(role == null)
            return ResponseData.ERROR("角色不存在");

        int count = roleDao.countRoleByNameExcludeId(roleName, id);
        if(count > 0)
            return ResponseData.ERROR("角色名称已经存在");
        role.setRoleName(roleName);
        role.setRemark(remark);
        roleDao.updateByPrimaryKey(role);
        return ResponseData.OK();
    }

    @Override
    public ResponseData deleteRole(int id) {
        int userCount = userRoleDao.countUserByRole(id);
        if(userCount > 0)
            return ResponseData.ERROR("该角色存在相关用户，不能删除");
        rolePermissionDao.deleteByRoleId(id);
        return ResponseData.OK();
    }
}

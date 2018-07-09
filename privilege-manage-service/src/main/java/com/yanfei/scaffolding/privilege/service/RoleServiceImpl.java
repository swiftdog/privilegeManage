package com.yanfei.scaffolding.privilege.service;

import com.alibaba.druid.util.StringUtils;
import com.yanfei.scaffolding.privilege.dao.TbPrivilegePermissionMapper;
import com.yanfei.scaffolding.privilege.dao.TbPrivilegeRoleMapper;
import com.yanfei.scaffolding.privilege.dao.TbPrivilegeRolePermissionMapper;
import com.yanfei.scaffolding.privilege.dao.TbPrivilegeUserRoleMapper;
import com.yanfei.scaffolding.privilege.entity.TbPrivilegePermission;
import com.yanfei.scaffolding.privilege.entity.TbPrivilegeRole;
import com.yanfei.scaffolding.privilege.entity.TbPrivilegeRolePermission;
import com.yanfei.scaffolding.privilege.response.Page;
import com.yanfei.scaffolding.privilege.response.ResponseData;
import com.yanfei.scaffolding.privilege.response.RoleListResp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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

    @Autowired
    private TbPrivilegePermissionMapper permissionDao;

    @Override
    public Page<List<TbPrivilegeRole>> getRoleList(String roleName, Page page) {
        page = Optional.ofNullable(page).orElse(new Page());
        int count = roleDao.countRoleList(roleName);
        page.setCount(count);
        if(count > 0){
            List<RoleListResp> roleList = roleDao.getRoleList(roleName, page);
            page.setResult(roleList);
        }
        return page;
    }

    @Override
    public ResponseData addRole(String roleName, String remark) {
        if(StringUtils.isEmpty(roleName))
            return ResponseData.ERROR("角色名称不能为空");
        int count = roleDao.countRoleByName(roleName);
        if(count > 0)
            return ResponseData.ERROR("角色名称已存在");
        TbPrivilegeRole role = new TbPrivilegeRole();
        role.setRoleName(roleName);
        role.setRemark(remark);
        role.setCreateTime(new Date());
        role.setUpdateTime(new Date());
        roleDao.insert(role);
        return ResponseData.OK();
    }

    @Override
    public ResponseData editRole(Integer id, String roleName, String remark) {
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
    @Transactional
    public ResponseData deleteRole(Integer id) {
        int userCount = userRoleDao.countUserByRole(id);
        if(userCount > 0)
            return ResponseData.ERROR("该角色存在相关用户，不能删除");
        roleDao.deleteByPrimaryKey(id);
        rolePermissionDao.deleteByRoleId(id);
        return ResponseData.OK();
    }

    @Override
    public RoleListResp getRoleById(Integer id) {
        TbPrivilegeRole role = roleDao.selectByPrimaryKey(id);
        RoleListResp roleListResp = new RoleListResp();
        roleListResp.setId(role.getId());
        roleListResp.setRoleName(role.getRoleName());
        roleListResp.setRemark(role.getRemark());
        return roleListResp;
    }

    @Override
    public List<Integer> getRolePermissions(Integer roleId) {
        return rolePermissionDao.getRolePermissions(roleId);
    }

    @Override
    @Transactional
    public ResponseData allocatePermission(Integer roleId, List<Integer> permissions) {
        rolePermissionDao.deleteByRoleId(roleId);
        TbPrivilegeRole role = roleDao.selectByPrimaryKey(roleId);
        if(role == null)
            return ResponseData.ERROR("角色不存在");
        List<Integer> filterPermissions = permissions.stream().filter(permission -> {
            TbPrivilegePermission tbPrivilegePermission = permissionDao.selectByPrimaryKey(permission);
            if(tbPrivilegePermission != null && tbPrivilegePermission.getIsLeaf() == true)
                return true;
            return false;
        }).collect(Collectors.toList());
        filterPermissions.forEach(permission -> {
            TbPrivilegeRolePermission tbPrivilegeRolePermission = new TbPrivilegeRolePermission();
            tbPrivilegeRolePermission.setRoleId(roleId);
            tbPrivilegeRolePermission.setPermissionId(permission);
            rolePermissionDao.insert(tbPrivilegeRolePermission);
        });
        return ResponseData.OK();
    }
}

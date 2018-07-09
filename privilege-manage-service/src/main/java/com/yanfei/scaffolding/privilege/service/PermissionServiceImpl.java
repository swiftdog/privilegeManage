package com.yanfei.scaffolding.privilege.service;

import com.yanfei.scaffolding.privilege.dao.TbPrivilegePermissionMapper;
import com.yanfei.scaffolding.privilege.entity.TbPrivilegePermission;
import com.yanfei.scaffolding.privilege.response.PermissionListResp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by : yanfei
 * Created time : 18/7/5 下午3:05
 */
@Service
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    private TbPrivilegePermissionMapper permissionDao;

    public List<PermissionListResp> getPermissionList(){
        List<PermissionListResp> permissionListResps = getSubPermissionByPid(0);
        return permissionListResps;
    }

    private List<PermissionListResp> getSubPermissionByPid(int pid){
        List<PermissionListResp> permissionListResps = new ArrayList<>();
        List<TbPrivilegePermission> permissions = permissionDao.getPermissionByPid(pid);
        for(int i=0;permissions != null && i<permissions.size();i++){
            TbPrivilegePermission permission = permissions.get(i);
            PermissionListResp permissionListResp = new PermissionListResp();
            permissionListResp.setId(permission.getId());
            permissionListResp.setName(permission.getName());
            permissionListResp.setPermissionKey(permission.getPermission());
            if(permission.getIsLeaf() == false){
                List<PermissionListResp> subPermissions = getSubPermissionByPid(permission.getId());
                permissionListResp.setSubPermissions(subPermissions);
            }
            permissionListResps.add(permissionListResp);
        }
        return permissionListResps;
    }

}

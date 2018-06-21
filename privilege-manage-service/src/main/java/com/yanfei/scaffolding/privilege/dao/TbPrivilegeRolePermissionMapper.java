package com.yanfei.scaffolding.privilege.dao;

import com.yanfei.scaffolding.privilege.entity.TbPrivilegeRolePermission;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;

public interface TbPrivilegeRolePermissionMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(TbPrivilegeRolePermission record);

    int insertSelective(TbPrivilegeRolePermission record);

    TbPrivilegeRolePermission selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbPrivilegeRolePermission record);

    int updateByPrimaryKey(TbPrivilegeRolePermission record);

    @Delete("delete from tb_privilege_role_permission where role_id = #{roleId}")
    void deleteByRoleId(@Param("roleId") int roleId);
}
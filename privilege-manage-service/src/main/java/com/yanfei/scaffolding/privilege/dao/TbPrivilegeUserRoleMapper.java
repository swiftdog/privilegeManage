package com.yanfei.scaffolding.privilege.dao;

import com.yanfei.scaffolding.privilege.entity.TbPrivilegeUserRole;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface TbPrivilegeUserRoleMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(TbPrivilegeUserRole record);

    int insertSelective(TbPrivilegeUserRole record);

    TbPrivilegeUserRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbPrivilegeUserRole record);

    int updateByPrimaryKey(TbPrivilegeUserRole record);

    @Select("select count(*) from tb_privilege_user_role where role_id = #{roleId}")
    int countUserByRole(@Param("roleId") int roleId);
}
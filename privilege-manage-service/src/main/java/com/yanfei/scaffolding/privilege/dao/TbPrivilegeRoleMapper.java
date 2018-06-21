package com.yanfei.scaffolding.privilege.dao;

import com.yanfei.scaffolding.privilege.entity.TbPrivilegeRole;
import com.yanfei.scaffolding.privilege.response.Page;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TbPrivilegeRoleMapper {

    int deleteByPrimaryKey(Integer id);


    int insert(TbPrivilegeRole record);


    int insertSelective(TbPrivilegeRole record);


    TbPrivilegeRole selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(TbPrivilegeRole record);


    int updateByPrimaryKey(TbPrivilegeRole record);

    int countRoleList(@Param("roleName") String roleName);

    List<TbPrivilegeRole> getRoleList(@Param("roleName") String roleName, @Param("page") Page page);

    @Select("select count(*) from tb_privilege_role where role_name = #{roleName}")
    int countRoleByName(@Param("roleName") String roleName);

    @Select("select count(*) from tb_privilege_role where role_name = #{roleName} and id != #{id}")
    int countRoleByNameExcludeId(@Param("roleName") String roleName, @Param("id") int id);
}
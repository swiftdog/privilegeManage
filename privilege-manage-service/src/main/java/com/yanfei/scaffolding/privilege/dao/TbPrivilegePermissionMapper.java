package com.yanfei.scaffolding.privilege.dao;

import com.yanfei.scaffolding.privilege.entity.TbPrivilegePermission;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TbPrivilegePermissionMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(TbPrivilegePermission record);

    int insertSelective(TbPrivilegePermission record);

    TbPrivilegePermission selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbPrivilegePermission record);

    int updateByPrimaryKey(TbPrivilegePermission record);

    @Select("select P.id,P.name,P.permission,P.pid,P.is_leaf isLeaf " +
            "from tb_privilege_permission P where P.pid = #{pid} order by priority asc")
    List<TbPrivilegePermission> getPermissionByPid(@Param("pid") Integer pid);
}
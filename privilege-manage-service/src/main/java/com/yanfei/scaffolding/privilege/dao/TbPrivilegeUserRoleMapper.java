package com.yanfei.scaffolding.privilege.dao;

import com.yanfei.scaffolding.privilege.entity.TbPrivilegeUserRole;

public interface TbPrivilegeUserRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_privilege_user_role
     *
     * @mbggenerated Wed Jun 20 16:32:29 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_privilege_user_role
     *
     * @mbggenerated Wed Jun 20 16:32:29 CST 2018
     */
    int insert(TbPrivilegeUserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_privilege_user_role
     *
     * @mbggenerated Wed Jun 20 16:32:29 CST 2018
     */
    int insertSelective(TbPrivilegeUserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_privilege_user_role
     *
     * @mbggenerated Wed Jun 20 16:32:29 CST 2018
     */
    TbPrivilegeUserRole selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_privilege_user_role
     *
     * @mbggenerated Wed Jun 20 16:32:29 CST 2018
     */
    int updateByPrimaryKeySelective(TbPrivilegeUserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_privilege_user_role
     *
     * @mbggenerated Wed Jun 20 16:32:29 CST 2018
     */
    int updateByPrimaryKey(TbPrivilegeUserRole record);
}
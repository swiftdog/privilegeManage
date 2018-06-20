package com.yanfei.scaffolding.privilege.entity;

import java.util.Date;

public class TbPrivilegeRole {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_privilege_role.id
     *
     * @mbggenerated Wed Jun 20 16:32:29 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_privilege_role.role_name
     *
     * @mbggenerated Wed Jun 20 16:32:29 CST 2018
     */
    private String roleName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_privilege_role.remark
     *
     * @mbggenerated Wed Jun 20 16:32:29 CST 2018
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_privilege_role.create_time
     *
     * @mbggenerated Wed Jun 20 16:32:29 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_privilege_role.update_time
     *
     * @mbggenerated Wed Jun 20 16:32:29 CST 2018
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_privilege_role.id
     *
     * @return the value of tb_privilege_role.id
     *
     * @mbggenerated Wed Jun 20 16:32:29 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_privilege_role.id
     *
     * @param id the value for tb_privilege_role.id
     *
     * @mbggenerated Wed Jun 20 16:32:29 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_privilege_role.role_name
     *
     * @return the value of tb_privilege_role.role_name
     *
     * @mbggenerated Wed Jun 20 16:32:29 CST 2018
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_privilege_role.role_name
     *
     * @param roleName the value for tb_privilege_role.role_name
     *
     * @mbggenerated Wed Jun 20 16:32:29 CST 2018
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_privilege_role.remark
     *
     * @return the value of tb_privilege_role.remark
     *
     * @mbggenerated Wed Jun 20 16:32:29 CST 2018
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_privilege_role.remark
     *
     * @param remark the value for tb_privilege_role.remark
     *
     * @mbggenerated Wed Jun 20 16:32:29 CST 2018
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_privilege_role.create_time
     *
     * @return the value of tb_privilege_role.create_time
     *
     * @mbggenerated Wed Jun 20 16:32:29 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_privilege_role.create_time
     *
     * @param createTime the value for tb_privilege_role.create_time
     *
     * @mbggenerated Wed Jun 20 16:32:29 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_privilege_role.update_time
     *
     * @return the value of tb_privilege_role.update_time
     *
     * @mbggenerated Wed Jun 20 16:32:29 CST 2018
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_privilege_role.update_time
     *
     * @param updateTime the value for tb_privilege_role.update_time
     *
     * @mbggenerated Wed Jun 20 16:32:29 CST 2018
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
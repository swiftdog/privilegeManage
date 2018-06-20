package com.yanfei.scaffolding.privilege.entity;

import java.util.Date;

public class TbPrivilegeUser {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_privilege_user.id
     *
     * @mbggenerated Wed Jun 20 16:32:29 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_privilege_user.name
     *
     * @mbggenerated Wed Jun 20 16:32:29 CST 2018
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_privilege_user.pwd
     *
     * @mbggenerated Wed Jun 20 16:32:29 CST 2018
     */
    private String pwd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_privilege_user.salt
     *
     * @mbggenerated Wed Jun 20 16:32:29 CST 2018
     */
    private String salt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_privilege_user.phone
     *
     * @mbggenerated Wed Jun 20 16:32:29 CST 2018
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_privilege_user.email
     *
     * @mbggenerated Wed Jun 20 16:32:29 CST 2018
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_privilege_user.remark
     *
     * @mbggenerated Wed Jun 20 16:32:29 CST 2018
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_privilege_user.is_superadmin
     *
     * @mbggenerated Wed Jun 20 16:32:29 CST 2018
     */
    private Boolean isSuperadmin;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_privilege_user.status
     *
     * @mbggenerated Wed Jun 20 16:32:29 CST 2018
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_privilege_user.create_time
     *
     * @mbggenerated Wed Jun 20 16:32:29 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_privilege_user.update_time
     *
     * @mbggenerated Wed Jun 20 16:32:29 CST 2018
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_privilege_user.id
     *
     * @return the value of tb_privilege_user.id
     *
     * @mbggenerated Wed Jun 20 16:32:29 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_privilege_user.id
     *
     * @param id the value for tb_privilege_user.id
     *
     * @mbggenerated Wed Jun 20 16:32:29 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_privilege_user.name
     *
     * @return the value of tb_privilege_user.name
     *
     * @mbggenerated Wed Jun 20 16:32:29 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_privilege_user.name
     *
     * @param name the value for tb_privilege_user.name
     *
     * @mbggenerated Wed Jun 20 16:32:29 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_privilege_user.pwd
     *
     * @return the value of tb_privilege_user.pwd
     *
     * @mbggenerated Wed Jun 20 16:32:29 CST 2018
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_privilege_user.pwd
     *
     * @param pwd the value for tb_privilege_user.pwd
     *
     * @mbggenerated Wed Jun 20 16:32:29 CST 2018
     */
    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_privilege_user.salt
     *
     * @return the value of tb_privilege_user.salt
     *
     * @mbggenerated Wed Jun 20 16:32:29 CST 2018
     */
    public String getSalt() {
        return salt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_privilege_user.salt
     *
     * @param salt the value for tb_privilege_user.salt
     *
     * @mbggenerated Wed Jun 20 16:32:29 CST 2018
     */
    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_privilege_user.phone
     *
     * @return the value of tb_privilege_user.phone
     *
     * @mbggenerated Wed Jun 20 16:32:29 CST 2018
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_privilege_user.phone
     *
     * @param phone the value for tb_privilege_user.phone
     *
     * @mbggenerated Wed Jun 20 16:32:29 CST 2018
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_privilege_user.email
     *
     * @return the value of tb_privilege_user.email
     *
     * @mbggenerated Wed Jun 20 16:32:29 CST 2018
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_privilege_user.email
     *
     * @param email the value for tb_privilege_user.email
     *
     * @mbggenerated Wed Jun 20 16:32:29 CST 2018
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_privilege_user.remark
     *
     * @return the value of tb_privilege_user.remark
     *
     * @mbggenerated Wed Jun 20 16:32:29 CST 2018
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_privilege_user.remark
     *
     * @param remark the value for tb_privilege_user.remark
     *
     * @mbggenerated Wed Jun 20 16:32:29 CST 2018
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_privilege_user.is_superadmin
     *
     * @return the value of tb_privilege_user.is_superadmin
     *
     * @mbggenerated Wed Jun 20 16:32:29 CST 2018
     */
    public Boolean getIsSuperadmin() {
        return isSuperadmin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_privilege_user.is_superadmin
     *
     * @param isSuperadmin the value for tb_privilege_user.is_superadmin
     *
     * @mbggenerated Wed Jun 20 16:32:29 CST 2018
     */
    public void setIsSuperadmin(Boolean isSuperadmin) {
        this.isSuperadmin = isSuperadmin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_privilege_user.status
     *
     * @return the value of tb_privilege_user.status
     *
     * @mbggenerated Wed Jun 20 16:32:29 CST 2018
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_privilege_user.status
     *
     * @param status the value for tb_privilege_user.status
     *
     * @mbggenerated Wed Jun 20 16:32:29 CST 2018
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_privilege_user.create_time
     *
     * @return the value of tb_privilege_user.create_time
     *
     * @mbggenerated Wed Jun 20 16:32:29 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_privilege_user.create_time
     *
     * @param createTime the value for tb_privilege_user.create_time
     *
     * @mbggenerated Wed Jun 20 16:32:29 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_privilege_user.update_time
     *
     * @return the value of tb_privilege_user.update_time
     *
     * @mbggenerated Wed Jun 20 16:32:29 CST 2018
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_privilege_user.update_time
     *
     * @param updateTime the value for tb_privilege_user.update_time
     *
     * @mbggenerated Wed Jun 20 16:32:29 CST 2018
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
package com.yanfei.scaffolding.privilege.entity;

import lombok.Data;

@Data
public class TbPrivilegePermission {

    private Integer id;

    private String name;

    private String permission;

    private Integer pid;

    private Boolean isLeaf;

    private Integer priority;

}
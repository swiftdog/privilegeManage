package com.yanfei.scaffolding.privilege.response;

import lombok.Data;

import java.util.List;

/**
 * Created by : yanfei
 * Created time : 18/7/5 下午3:06
 */
@Data
public class PermissionListResp {

    private int id;

    private String name;

    private String permissionKey;

    private List<PermissionListResp> subPermissions;

}

package com.yanfei.scaffolding.privilege.response;

import lombok.Data;

/**
 * Created by : yanfei
 * Created time : 18/6/28 下午5:00
 */
@Data
public class RoleListResp {

    private int id;

    private String roleName;

    private String remark;

    private int userCount;

}

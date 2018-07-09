package com.yanfei.scaffolding.privilege.request;

import com.yanfei.scaffolding.privilege.response.Page;
import lombok.Data;

import java.util.List;

/**
 * Created by : yanfei
 * Created time : 18/6/21 下午2:09
 */
@Data
public class RoleRequest {

    private int id;

    private String roleName;

    private String remark;

    private Page page;

    private List<Integer> permissions;
}

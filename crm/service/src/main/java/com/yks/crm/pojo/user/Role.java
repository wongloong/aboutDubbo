package com.yks.crm.pojo.user;

import java.io.Serializable;

/**
 * Created by wanglong on 16-2-6.
 */
public class Role implements Serializable{
    private Long id;
    private String roleName;
    private Long userRoleId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}

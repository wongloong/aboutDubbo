package com.yks.crm.pojo.user;

import java.io.Serializable;

/**
 * Created by wanglong on 16-2-6.
 */
public class RoleResource implements Serializable {
    private Long id;
    private Long resourceId;
    private Long roleId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getResourceId() {
        return resourceId;
    }

    public void setResourceId(Long resourceId) {
        this.resourceId = resourceId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}

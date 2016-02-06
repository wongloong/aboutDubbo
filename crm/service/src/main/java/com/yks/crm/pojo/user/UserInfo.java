package com.yks.crm.pojo.user;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by wanglong on 16-2-6.
 */
public class UserInfo implements Serializable {
    private Long id;
    private String loginName;
    private String password;
    private Date createTime;
    /**
     * 是否启用 0 禁用 1启用
     */
    private int enable;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public int getEnable() {
        return enable;
    }

    public void setEnable(int enable) {
        this.enable = enable;
    }
}

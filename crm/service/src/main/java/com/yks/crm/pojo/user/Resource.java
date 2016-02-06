package com.yks.crm.pojo.user;

import java.io.Serializable;

/**
 * Created by wanglong on 16-2-6.
 */
public class Resource implements Serializable{
    private Long id;
    private String url;
    private String name;
    private int orderFlag;
    private int levelFlag;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOrderFlag() {
        return orderFlag;
    }

    public void setOrderFlag(int orderFlag) {
        this.orderFlag = orderFlag;
    }

    public int getLevelFlag() {
        return levelFlag;
    }

    public void setLevelFlag(int levelFlag) {
        this.levelFlag = levelFlag;
    }
}

package com.william.index.pojo;

import org.apache.ibatis.type.Alias;

import java.io.Serializable;

@Alias("User")
public class User implements Serializable{
    private Integer id;
    private String userId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}

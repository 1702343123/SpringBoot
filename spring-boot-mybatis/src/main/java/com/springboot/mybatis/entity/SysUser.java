package com.springboot.mybatis.entity;

import lombok.Data;

/**
 * Created by Administrator on 2019/3/18.
 */
@Data
public class SysUser {
    private Long userId;
    private String mobile;
    private String password;
    private String userName;
    private String avatar;

    public SysUser(){

    }
    public SysUser(Long userId, String mobile, String password, String userName, String avatar) {
        this.userId = userId;
        this.mobile = mobile;
        this.password = password;
        this.userName = userName;
        this.avatar = avatar;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}

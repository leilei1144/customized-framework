package com.customized.register.pojo;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/9/20.
 */
public class UserRegisterBean implements Serializable {
    /**
     * cguid  主键
     *userID  用户ID唯一标识
     * username 用户名
     * upwd密码
     * */
    private static final long serialVersionUID = 1L;
    private String cguid;
    private String userID;
    private String username;
    private String upwd;

    public String getCguid() {
        return cguid;
    }

    public void setCguid(String cguid) {
        this.cguid = cguid;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    public UserRegisterBean(String cguid,String userID, String username, String upwd) {
        this.cguid=cguid;
        this.userID = userID;
        this.username = username;
        this.upwd = upwd;
    }

    public UserRegisterBean() {
    }
}

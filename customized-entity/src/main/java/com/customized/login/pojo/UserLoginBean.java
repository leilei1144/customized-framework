package com.customized.login.pojo;

import com.customized.basic.BasicPojo;

import java.io.Serializable;
import java.util.Map;

/**
 * Created by Administrator on 2016/9/12.
 */
public class UserLoginBean extends BasicPojo implements Serializable {
    /**
     * phoneNum
     * QQNum
     * weChat
     * cpwd  密码
     */
    private static final long serialVersionUID = 1L;
    private String phoneNum;
    private String QQNum;
    private String weChat;
    private Map<String,String> cpwd;
    private String upwd;
    public String getPhoneNum() {
        return phoneNum;
    }
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
    public String getQQNum() {
        return QQNum;
    }
    public void setQQNum(String QQNum) {
        this.QQNum = QQNum;
    }
    public String getWeChat() {
        return weChat;
    }
    public void setWeChat(String weChat) {
        this.weChat = weChat;
    }
    public Map<String, String> getCpwd() {
        return cpwd;
    }
    public String getUpwd() {
        return upwd;
    }
    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }
    public void setCpwd(Map<String, String> cpwd) {
        this.cpwd = cpwd;
    }
    public UserLoginBean() {

    }
    public UserLoginBean(String phoneNum, String QQNum, String weChat, Map<String, String> cpwd, String upwd) {
        this.phoneNum = phoneNum;
        this.QQNum = QQNum;
        this.weChat = weChat;
        this.cpwd = cpwd;
        this.upwd=upwd;
    }
}

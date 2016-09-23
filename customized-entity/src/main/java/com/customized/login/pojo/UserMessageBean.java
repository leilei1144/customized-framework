package com.customized.login.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

public class UserMessageBean implements Serializable {
	/**
	 * userID ": 用户唯一标示
	 " accessToken ": 用户Token
	 “headUrl”:”xxx”用户头像
	 “userNickName”:”xxx”用户昵称
	 “balance”:12””余额
	  flag : 0-成功 1-用户名或密码错误 2-登录超时
	 */
	private static final long serialVersionUID = 1L;
	private String userID;
	private String accessToken;
	private String headUrl;
	private String userNickName;
	private BigDecimal balance;
	private Integer flag;

	public Integer getFlag() {
		return flag;
	}

	public void setFlag(Integer flag) {
		this.flag = flag;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public String getHeadUrl() {
		return headUrl;
	}

	public void setHeadUrl(String headUrl) {
		this.headUrl = headUrl;
	}

	public String getUserNickName() {
		return userNickName;
	}

	public void setUserNickName(String userNickName) {
		this.userNickName = userNickName;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public UserMessageBean(String userID, String accessToken, String headUrl, String userNickName, BigDecimal balance, Integer flag) {
		this.userID = userID;
		this.accessToken = accessToken;
		this.headUrl = headUrl;
		this.userNickName = userNickName;
		this.balance = balance;
		this.flag=flag;
	}

	public UserMessageBean() {

	}
}

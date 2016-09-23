package com.customized.Horn.pojo;

import java.io.Serializable;

public class HornBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String v_good_name;                //商品名称
	private String v_url;			       //详情url
	private String v_good_id;              //商品ID
	private Integer i_issue;			   //商品期数
	private String v_nickname;             //中奖人昵称
	public String getV_good_name() {
		return v_good_name;
	}
	public void setV_good_name(String v_good_name) {
		this.v_good_name = v_good_name;
	}
	public String getV_url() {
		return v_url;
	}
	public void setV_url(String v_url) {
		this.v_url = v_url;
	}
	public String getV_good_id() {
		return v_good_id;
	}
	public void setV_good_id(String v_good_id) {
		this.v_good_id = v_good_id;
	}
	public Integer getI_issue() {
		return i_issue;
	}
	public void setI_issue(Integer i_issue) {
		this.i_issue = i_issue;
	}
	public String getV_nickname() {
		return v_nickname;
	}
	public void setV_nickname(String v_nickname) {
		this.v_nickname = v_nickname;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public HornBean(String v_good_name, String v_url, String v_good_id,
			Integer i_issue, String v_nickname) {
		this.v_good_name = v_good_name;
		this.v_url = v_url;
		this.v_good_id = v_good_id;
		this.i_issue = i_issue;
		this.v_nickname = v_nickname;
	}
	public HornBean() {

	}
	
	
}

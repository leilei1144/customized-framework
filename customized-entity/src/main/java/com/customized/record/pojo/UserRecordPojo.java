package com.customized.record.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 功能:用户购买信息POJO
 * @author yangmengfan
 * @since
 * @version 1.0
 * */
public class UserRecordPojo implements Serializable {

    private static final long serialVersionUID = 1L;
    
    /*商品id*/
    private String goodsID;
    /*期数*/
    private String goodsPID;
    /*中奖用户昵称 	(goodsStatus为3返回)*/
    private String winerNick;
    /*中奖用户ID 		(goodsStatus为3返回)*/
    private String winerID;
    /*中奖号码		(goodsStatus为3返回)*/
    private String winNum;
    /*头像地址		(goodsStatus为3返回)*/ 
    private String headurl;
    /*中奖者参与次数	(goodsStatus为3返回)*/ 
    private String winJoinTime;
    /*IP地址			(goodsStatus为3返回)*/
    private String cityIP;
    /*IP地址			(goodsStatus为3返回)*/ 
    private String city;
    /*开奖时间*/ 
    private Date openTime;
    
	public String getGoodsID() {
		return goodsID;
	}
	public void setGoodsID(String goodsID) {
		this.goodsID = goodsID;
	}
	public String getGoodsPID() {
		return goodsPID;
	}
	public void setGoodsPID(String goodsPID) {
		this.goodsPID = goodsPID;
	}
	public String getWinerNick() {
		return winerNick;
	}
	public void setWinerNick(String winerNick) {
		this.winerNick = winerNick;
	}
	public String getWinerID() {
		return winerID;
	}
	public void setWinerID(String winerID) {
		this.winerID = winerID;
	}
	public String getWinNum() {
		return winNum;
	}
	public void setWinNum(String winNum) {
		this.winNum = winNum;
	}
	public String getHeadurl() {
		return headurl;
	}
	public void setHeadurl(String headurl) {
		this.headurl = headurl;
	}
	public String getWinJoinTime() {
		return winJoinTime;
	}
	public void setWinJoinTime(String winJoinTime) {
		this.winJoinTime = winJoinTime;
	}
	public String getCityIP() {
		return cityIP;
	}
	public void setCityIP(String cityIP) {
		this.cityIP = cityIP;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Date getOpenTime() {
		return openTime;
	}
	public void setOpenTime(Date openTime) {
		this.openTime = openTime;
	}
     
}

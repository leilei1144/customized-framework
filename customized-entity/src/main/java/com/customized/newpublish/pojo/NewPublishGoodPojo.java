package com.customized.newpublish.pojo;

import com.sun.org.apache.xalan.internal.xsltc.dom.SimpleResultTreeImpl;
import io.swagger.models.auth.In;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 功能:最新揭晓接口POJO
 * @author yangmengfan
 * @since
 * @version 1.0
 * */
public class NewPublishGoodPojo implements Serializable {

    private static final long serialVersionUID = 1L;
    
    /*商品状态*/
    private String goodsStatus;
    /*商品类型*/
    private String goodsType;
    /*缩略图*/
    private String goodsThumbnail;
    /*等待开奖时间 时间戳*/
    private String goodsLotteryTime;
    /*商品ID*/
    private String goodsID;
    /*期数*/ 
    private String goodsPID;
    /*名称*/ 
    private String goodsName;
    /*商品副标题*/
    private String goodsTitle;
    /*参与次数*/ 
    private String attendCount;
    /*揭晓时间*/ 
    private Date openTime;
    /*用户头像*/
    private String userHeadUrl;
    /*用户昵称*/ 
    private String userName;
    /*总价*/ 
    private BigDecimal goodsPrice;
    
    public NewPublishGoodPojo(){
    	
    }
    
	public String getGoodsStatus() {
		return goodsStatus;
	}
	public void setGoodsStatus(String goodsStatus) {
		this.goodsStatus = goodsStatus;
	}
	public String getGoodsType() {
		return goodsType;
	}
	public void setGoodsType(String goodsType) {
		this.goodsType = goodsType;
	}
	public String getGoodsThumbnail() {
		return goodsThumbnail;
	}
	public void setGoodsThumbnail(String goodsThumbnail) {
		this.goodsThumbnail = goodsThumbnail;
	}
	public String getGoodsLotteryTime() {
		return goodsLotteryTime;
	}
	public void setGoodsLotteryTime(String goodsLotteryTime) {
		this.goodsLotteryTime = goodsLotteryTime;
	}
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
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public String getGoodsTitle() {
		return goodsTitle;
	}
	public void setGoodsTitle(String goodsTitle) {
		this.goodsTitle = goodsTitle;
	}
	public String getAttendCount() {
		return attendCount;
	}
	public void setAttendCount(String attendCount) {
		this.attendCount = attendCount;
	}
	public Date getOpenTime() {
		return openTime;
	}
	public void setOpenTime(Date openTime) {
		this.openTime = openTime;
	}
	public String getUserHeadUrl() {
		return userHeadUrl;
	}
	public void setUserHeadUrl(String userHeadUrl) {
		this.userHeadUrl = userHeadUrl;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public BigDecimal getGoodsPrice() {
		return goodsPrice;
	}
	public void setGoodsPrice(BigDecimal goodsPrice) {
		this.goodsPrice = goodsPrice;
	}
    
}

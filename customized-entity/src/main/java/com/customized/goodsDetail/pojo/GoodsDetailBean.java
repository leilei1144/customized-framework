package com.customized.goodsDetail.pojo;

import com.sun.org.apache.xalan.internal.xsltc.dom.SimpleResultTreeImpl;
import io.swagger.models.auth.In;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2016/9/7.
 */
public class GoodsDetailBean implements Serializable {

    /**
     "goodsMultiPeriod": "1"//可购买期数
     *
     */
    private static final long serialVersionUID = 1L;
    //商品详情图，多个img地址
    private List goodsBannerImage;
    //商品详情链接
    private String goodsDetail;
    //商品状态
    private String  goodsStatus;
    //商品名称
    private String goodsName;
    //商品价格
    private Integer goodsTotalPrice;
    //已售
    private Integer goodsSell;
    //等待开奖时间
    private String goodsLotteryTime;
    //中奖人昵称
    private String userName;
    //中奖号码
    private String winNum;
    //头像地址
    private String headUrl;
    //中奖人参与次数
    private Integer winJoinTime;
    //IP地址
    private String cityIP;
    //已揭晓的时间
    private Date openTime;
    //我参与的次数
    private Integer myJoinTime;
    //是否速开
    private String isNowOpen;
    //是否限购
    private String isLimited;
    //可购买期数
    private Integer goodsMultiPeriod;
    public List getGoodsBannerImage() {
        return goodsBannerImage;
    }
    public void setGoodsBannerImage(List goodsBannerImage) {
        this.goodsBannerImage = goodsBannerImage;
    }
    public String getGoodsDetail() {
        return goodsDetail;
    }
    public void setGoodsDetail(String goodsDetail) {
        this.goodsDetail = goodsDetail;
    }
    public String getGoodsStatus() {
        return goodsStatus;
    }
    public void setGoodsStatus(String goodsStatus) {
        this.goodsStatus = goodsStatus;
    }
    public String getGoodsName() {
        return goodsName;
    }
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }
    public Integer getGoodsTotalPrice() {
        return goodsTotalPrice;
    }
    public void setGoodsTotalPrice(Integer goodsTotalPrice) {
        this.goodsTotalPrice = goodsTotalPrice;
    }
    public Integer getGoodsSell() {
        return goodsSell;
    }
    public void setGoodsSell(Integer goodsSell) {
        this.goodsSell = goodsSell;
    }
    public String getGoodsLotteryTime() {
        return goodsLotteryTime;
    }
    public void setGoodsLotteryTime(String goodsLotteryTime) {
        this.goodsLotteryTime = goodsLotteryTime;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getWinNum() {
        return winNum;
    }
    public void setWinNum(String winNum) {
        this.winNum = winNum;
    }
    public String getHeadUrl() {
        return headUrl;
    }
    public void setHeadUrl(String headUrl) {
        this.headUrl = headUrl;
    }
    public Integer getWinJoinTime() {
        return winJoinTime;
    }
    public void setWinJoinTime(Integer winJoinTime) {
        this.winJoinTime = winJoinTime;
    }
    public String getCityIP() {
        return cityIP;
    }
    public void setCityIP(String cityIP) {
        this.cityIP = cityIP;
    }
    public Date getOpenTime() {
        return openTime;
    }
    public void setOpenTime(Date openTime) {
        this.openTime = openTime;
    }
    public Integer getMyJoinTime() {
        return myJoinTime;
    }
    public void setMyJoinTime(Integer myJoinTime) {
        this.myJoinTime = myJoinTime;
    }
    public String getIsNowOpen() {
        return isNowOpen;
    }
    public void setIsNowOpen(String isNowOpen) {
        this.isNowOpen = isNowOpen;
    }
    public String getIsLimited() {
        return isLimited;
    }
    public void setIsLimited(String isLimited) {
        this.isLimited = isLimited;
    }
    public Integer getGoodsMultiPeriod() {
        return goodsMultiPeriod;
    }
    public void setGoodsMultiPeriod(Integer goodsMultiPeriod) {
        this.goodsMultiPeriod = goodsMultiPeriod;
    }
    public GoodsDetailBean(List<String> goodsBannerImage, String goodsDetail, String goodsStatus, String goodsName, Integer goodsTotalPrice, Integer goodsSell, String goodsLotteryTime, String userName, String winNum, String headUrl, Integer winJoinTime, String cityIP, Date openTime, Integer myJoinTime, String isNowOpen, String isLimited, Integer goodsMultiPeriod) {
        this.goodsBannerImage = goodsBannerImage;
        this.goodsDetail = goodsDetail;
        this.goodsStatus = goodsStatus;
        this.goodsName = goodsName;
        this.goodsTotalPrice = goodsTotalPrice;
        this.goodsSell = goodsSell;
        this.goodsLotteryTime = goodsLotteryTime;
        this.userName = userName;
        this.winNum = winNum;
        this.headUrl = headUrl;
        this.winJoinTime = winJoinTime;
        this.cityIP = cityIP;
        this.openTime = openTime;
        this.myJoinTime = myJoinTime;
        this.isNowOpen = isNowOpen;
        this.isLimited = isLimited;
        this.goodsMultiPeriod = goodsMultiPeriod;
    }
    public GoodsDetailBean() {
    }
}

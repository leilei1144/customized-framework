package com.customized.announced.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * Created by grant on 16/9/1.
 */
public class AnnouncedBean implements Serializable {
    private String goodsID;    //商品id
    private String goodsPID;   //期别
    private String winerNick;  //用户昵称
    private String winerID;    //用户id
    private String winNum;     //中奖号码
    private String headurl;    //用户头像
    private String winJoinTime;//用户参与次数
    private String cityIP;     //用户id
    private String city;       //用户地址
    private String openTime;   //开奖地址

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

    public String getOpenTime() {
        return openTime;
    }

    public void setOpenTime(String openTime) {
        this.openTime = openTime;
    }
}

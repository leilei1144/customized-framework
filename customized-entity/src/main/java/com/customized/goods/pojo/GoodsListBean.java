package com.customized.goods.pojo;

import com.customized.basic.BasicPojo;

import java.io.Serializable;

/**
 * Created by grant on 16/9/9.
 */
public class GoodsListBean extends BasicPojo implements Serializable{

    private String classification; //商品类别
    private String sort; //排序  排序方式(1:热门2:剩余3:最新4:人次最多5:人次最少)


    private String goodsID;            //商品idA
    private String goodsPID;           //期数
    private String goodsName;          //商品名称
    private String goodsTitle;         //商品副标题
    private String goodsTotalPrice;    //商品总价
    private String goodsSell;          //已售出
    private String goodsRemainl;       //剩余
    private String goodsType;          //商品类型
    private String isNowOpen;          //是否速开
    private String isLimited;          //是否限购
    private String goodsThumbnail;     //商品缩略图
    private String goodsMultiPeriod;   //可购期数





    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
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

    public String getGoodsTotalPrice() {
        return goodsTotalPrice;
    }

    public void setGoodsTotalPrice(String goodsTotalPrice) {
        this.goodsTotalPrice = goodsTotalPrice;
    }

    public String getGoodsSell() {
        return goodsSell;
    }

    public void setGoodsSell(String goodsSell) {
        this.goodsSell = goodsSell;
    }

    public String getGoodsRemainl() {
        return goodsRemainl;
    }

    public void setGoodsRemainl(String goodsRemainl) {
        this.goodsRemainl = goodsRemainl;
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
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

    public String getGoodsThumbnail() {
        return goodsThumbnail;
    }

    public void setGoodsThumbnail(String goodsThumbnail) {
        this.goodsThumbnail = goodsThumbnail;
    }

    public String getGoodsMultiPeriod() {
        return goodsMultiPeriod;
    }

    public void setGoodsMultiPeriod(String goodsMultiPeriod) {
        this.goodsMultiPeriod = goodsMultiPeriod;
    }
}

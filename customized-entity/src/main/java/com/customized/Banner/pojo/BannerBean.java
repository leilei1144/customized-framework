package com.customized.Banner.pojo;

import com.customized.basic.BasicPojo;

/**
 * Created by grant on 16/8/31.
 * banner实体类
 */
public class BannerBean extends BasicPojo{

    private String bannerType;
    private String imageUrl;
    private String goodsID;
    private String goodsPID;
    private String contentUrl;


    public String getBannerType() {
        return bannerType;
    }

    public void setBannerType(String bannerType) {
        this.bannerType = bannerType;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
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

    public String getContentUrl() {
        return contentUrl;
    }

    public void setContentUrl(String contentUrl) {
        this.contentUrl = contentUrl;
    }
}

package com.customized.announced.pojo;

import com.customized.basic.BasicPojo;

import java.io.Serializable;

/**
 * Created by grant on 16/9/18.
 */
public class AnnouncedParamBean extends BasicPojo implements Serializable{
    private String goodsId;
    private String goodsPId;

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsPId() {
        return goodsPId;
    }

    public void setGoodsPId(String goodsPId) {
        this.goodsPId = goodsPId;
    }
}

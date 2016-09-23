package com.customized.goodsDetail.pojo;

import com.customized.basic.BasicPojo;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/9/7.
 * 接收前台传递来的参数对象
 */
public class GoodsDetailParamPojo extends BasicPojo implements Serializable {

    private static final long serialVersionUID = 1L;
    //商品id
    private String goodsID;
    //商品期数
    private String goodsPID;
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

    public GoodsDetailParamPojo(String goodsID, String goodsPID) {
        this.goodsID = goodsID;
        this.goodsPID = goodsPID;
    }

    public GoodsDetailParamPojo() {

    }
}

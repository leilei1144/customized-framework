package com.customized.basic;

import java.io.Serializable;

import com.customized.basic.BasicPojo;

/**
 * 功能:对于公共接口入参实体类的扩展
 * @author yangmengfan
 * @since 
 * @version 1.0
 * */
public class BasicExtendPojo extends BasicPojo implements Serializable {

    private static final long serialVersionUID = 1L;
    
    /*商品ID*/
    private String goodsId;
    /*商品期数*/
    private String goodsPId;
    /*如需其他字段，自行扩展*/
    
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

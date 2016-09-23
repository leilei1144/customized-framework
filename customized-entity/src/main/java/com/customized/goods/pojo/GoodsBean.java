package com.customized.goods.pojo;

import java.io.Serializable;

public class GoodsBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//商品id
	private String gid;
	//已售期数
	private String ykqs;
	//剩余期数
	private String syqs;
	//商品价格
	private String price;
	//人气值
	private String rqzhi;
	//权重
	private String qz;
	//商品类型
	private String goodstype;
	//主标题
	private String zhtitle;
	//副标题
	private String ftitle;
	//商品详情
	private String goodsdetail;
	//缩略图
	private String suolt;
	//图片
	private String picture;
	//购买渠道
	private String buytype;
	//类别名称
	private String typename;
	//状态
	private String cstatus;
	//地址类型
	private String addresstype;
	//多期购买
	private String cisdq;
	
	public String getCisdq() {
		return cisdq;
	}
	public void setCisdq(String cisdq) {
		this.cisdq = cisdq;
	}
	public String getGid() {
		return gid;
	}
	public void setGid(String gid) {
		this.gid = gid;
	}
	public String getYkqs() {
		return ykqs;
	}
	public void setYkqs(String ykqs) {
		this.ykqs = ykqs;
	}
	public String getSyqs() {
		return syqs;
	}
	public void setSyqs(String syqs) {
		this.syqs = syqs;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getRqzhi() {
		return rqzhi;
	}
	public void setRqzhi(String rqzhi) {
		this.rqzhi = rqzhi;
	}
	public String getQz() {
		return qz;
	}
	public void setQz(String qz) {
		this.qz = qz;
	}
	public String getGoodstype() {
		return goodstype;
	}
	public void setGoodstype(String goodstype) {
		this.goodstype = goodstype;
	}
	public String getZhtitle() {
		return zhtitle;
	}
	public void setZhtitle(String zhtitle) {
		this.zhtitle = zhtitle;
	}
	public String getFtitle() {
		return ftitle;
	}
	public void setFtitle(String ftitle) {
		this.ftitle = ftitle;
	}
	public String getGoodsdetail() {
		return goodsdetail;
	}
	public void setGoodsdetail(String goodsdetail) {
		this.goodsdetail = goodsdetail;
	}
	public String getSuolt() {
		return suolt;
	}
	public void setSuolt(String suolt) {
		this.suolt = suolt;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getBuytype() {
		return buytype;
	}
	public void setBuytype(String buytype) {
		this.buytype = buytype;
	}
	public String getTypename() {
		return typename;
	}
	public void setTypename(String typename) {
		this.typename = typename;
	}
	public String getCstatus() {
		return cstatus;
	}
	public void setCstatus(String status) {
		this.cstatus = status;
	}
	public String getAddresstype() {
		return addresstype;
	}
	public void setAddresstype(String addresstype) {
		this.addresstype = addresstype;
	}
	public GoodsBean(String gid, String ykqs, String syqs, String price,
			String rqzhi, String qz, String goodstype, String zhtitle,
			String ftitle, String goodsdetail, String suolt, String picture,
			String buytype, String typename, String cstatus,
			String addresstype, String cisdq) {
		this.gid = gid;
		this.ykqs = ykqs;
		this.syqs = syqs;
		this.price = price;
		this.rqzhi = rqzhi;
		this.qz = qz;
		this.goodstype = goodstype;
		this.zhtitle = zhtitle;
		this.ftitle = ftitle;
		this.goodsdetail = goodsdetail;
		this.suolt = suolt;
		this.picture = picture;
		this.buytype = buytype;
		this.typename = typename;
		this.cstatus = cstatus;
		this.addresstype = addresstype;
		this.cisdq = cisdq;
	}
	public GoodsBean() {
		
	}
	
	
}

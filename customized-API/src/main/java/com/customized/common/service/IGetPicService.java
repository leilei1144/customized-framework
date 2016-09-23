package com.customized.common.service;

import java.util.List;

/**
 * 功能：根据不同图片类型获取图片地址的公用方法，对于需要返回多个图片如商品详情则 返回list 否则返回一个图片的地址,
 * @author yangmengfan
 * @since
 * @version 1.0
 * 入参：图片ID，图片类型等
 * 出参：图片地址
 * */
public interface IGetPicService{
	/*
	 * 功能:返回图片地址  对于7牛图片，在参数表查询网址后拼接 
	 * 入参:otherid:关联ID   appversion:app版本信息（关联app版本信息表）  pictype:图片类型（关联系统参数表）
	 * 出参:图片地址 
	 * */ 
	public String getPicUrl(String otherid,String appversion,int pictype);
	/*
	 * 功能:返回图片地址 如商品详情会需要返回多个图片地址, 返回list
	 * 入参:otherid:关联ID   appversion:app版本信息（关联app版本信息表）  pictype:图片类型（关联系统参数表）
	 * 出参:图片地址list
	 * */ 
    public List<String> getPicsUrl(String otherid,String appversion,int pictype);
}

package com.customized.common.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 功能:根据不同图片类型获取图片地址的公用方法，对于需要返回多个图片如商品详情则 返回list 否则返回一个图片的地址,
 *@author yangmengfan
 *@since
 *@version 1.0
 */
@Repository
public interface IGetPicDao {
    
	/*
	 * 功能:返回图片地址 如商品详情会需要返回多个图片地址, 返回list
	 * 入参:otherid:关联ID   appversion:app版本信息（关联app版本信息表）  pictype:图片类型（关联系统参数表）
	 * 出参:图片地址list
	 * */  
    List<String> getPicUrl(@Param("otherid") String otherid,@Param("appversion") String appversion,@Param("type") int type);
    
}

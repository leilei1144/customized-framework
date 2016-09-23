package com.customized.newpublish.dao;

import com.customized.basic.BasicPojo;
import com.customized.newpublish.pojo.NewPublishGoodPojo;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 功能:最新揭晓接口DAO
 *@author yangmengfan
 *@since
 *@version 1.0
 */
@Repository
public interface INewPublishDao {
    
	/*
	 * 功能：获取最新揭晓商品列表
	 * param: 1,BasicPojo 公用参数类  2,取出最新揭晓商品的条数 -- Constants.NEW_PUBLISH_NUM 3,3条最新商品 或者 首页多页最新商品
	 * 描述:根据参数类中 page,pagesize是否传值大于0判断  大于0:首页显示最新揭晓分页多个商品  等于0:最新揭晓模块显示默认3个商品  
	 * return: 最新揭晓商品列表 
	 * */ 
    List<NewPublishGoodPojo> getNewPublish(@Param("basicpojo") BasicPojo basicpojo,@Param("defaultnum") int defaultnum,@Param("type") int type);
    
}

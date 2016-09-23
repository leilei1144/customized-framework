package com.customized.newpublish.service.impl;

import com.customized.basic.BasicPojo;
import com.customized.common.service.IGetPicService;
import com.customized.config.Constants;
import com.customized.config.DBConstants;
import com.customized.newpublish.dao.INewPublishDao;
import com.customized.newpublish.pojo.NewPublishGoodPojo;
import com.customized.newpublish.service.INewPublishService;
import com.customized.support.dubbo.spring.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 功能：最新揭晓商品实现类
 * @author yangmengfan
 * @since
 * @version 1.0
 */
@DubboService(version = "0.0.1" , interfaceClass = INewPublishService.class)
public class NewPublishServiceImpl implements INewPublishService {
	
	// 用户头像图片类型，默认为小图
	private int usertxtype = DBConstants.PIC_SMALL;
	// 商品缩略图图片类型 默认为缩略图
	private int goodpictype = DBConstants.PIC_NAIL;
    @Autowired
    private INewPublishDao inewPublishDao;
    @Autowired
    private IGetPicService picservice;
    @Override
	public List<NewPublishGoodPojo> getNewPublish(BasicPojo basicpojo) {
    	// 当前页数
    	int page = basicpojo.getPageNum();
    	// 当前每页条数
    	int pagesize = basicpojo.getPageSize();
    	// 默认3个商品 或者 显示多页商品  0:默认3个商品 1:显示多页商品  默认0
    	int type = 0;  // 默认3个商品
    	if(page > 0 && pagesize >0){
    		type = 1; // 显示多页商品
    		int newpage = (page-1)*pagesize;
    		basicpojo.setPageNum(newpage);
    	}
    	/*
    	 * param: 1,BasicPojo 公用参数类  2,取出最新揭晓商品的条数 -- Constants.NEW_PUBLISH_NUM 3,3条最新商品 或者 首页多页最新商品
    	 * 描述:根据参数类中 page,pagesize是否传值大于0判断  大于0:首页显示最新揭晓分页多个商品  等于0:最新揭晓模块显示默认3个商品  
    	 * return: 最新揭晓商品列表 
    	 * */ 
    	List<NewPublishGoodPojo> newpublishlist = inewPublishDao.getNewPublish(basicpojo,Constants.NEW_PUBLISH_NUM,type);
    	
    	/*
    	 * 根据不同版本，对图片进行处理
    	 * */ 
    	if(newpublishlist != null && newpublishlist.size()>0){
    		for(NewPublishGoodPojo ngpojo : newpublishlist){
    			// 用户头像
    			String headurl = ngpojo.getUserHeadUrl();
    			String allheadurl = picservice.getPicUrl(headurl, basicpojo.getClientVersion(), usertxtype);
    			ngpojo.setUserHeadUrl(allheadurl);
    			// 商品缩略图
    			String goodsnail = ngpojo.getGoodsThumbnail();
    			String allgoodsnail = picservice.getPicUrl(goodsnail, basicpojo.getClientVersion(), goodpictype);
    			ngpojo.setGoodsThumbnail(allgoodsnail);
    		}
    	}
    	return newpublishlist;
    }

}

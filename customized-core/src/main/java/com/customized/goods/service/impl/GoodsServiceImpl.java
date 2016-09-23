package com.customized.goods.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.customized.goods.dao.IGoodsDao;
import com.customized.goods.pojo.GoodsBean;
import com.customized.goods.servive.IGoodsService;
import com.customized.support.dubbo.spring.annotation.DubboService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@DubboService(version="0.0.1",interfaceClass=IGoodsService.class)
public class GoodsServiceImpl implements IGoodsService {
	private static Logger logger=LoggerFactory.getLogger(GoodsServiceImpl.class);
	
	@Autowired
	private IGoodsDao gDao;
	
	@Override
	public PageInfo<GoodsBean> findGoods(GoodsBean goodsBean, int pageNum,
			int pageSize) {
		List<GoodsBean> list=null;
		PageHelper.startPage(pageNum,pageSize,true);
		list=gDao.findGoods(goodsBean);
		PageInfo<GoodsBean> pageinfo = new PageInfo<>(list);
		return pageinfo;
	}

}

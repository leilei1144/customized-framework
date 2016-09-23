package com.customized.horn.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.customized.Horn.pojo.HornBean;
import com.customized.basic.OutPutPojo;
import com.customized.horn.dao.IHornDao;
import com.customized.horn.servive.IHornService;
import com.customized.support.dubbo.spring.annotation.DubboService;
import com.google.common.collect.Maps;

@DubboService(version = "0.0.1" , interfaceClass = IHornService.class)
public class HornServiceImpl implements IHornService {
	private static Logger logger = LoggerFactory.getLogger(HornServiceImpl.class);
	@Autowired
	private IHornDao hDao;
	
	@Override
	public OutPutPojo getHorns(String token,int pageSize) {
		OutPutPojo op;
		List lis=new ArrayList();
		List<HornBean> list=hDao.getHorns(pageSize);
		if(list.size()>0){
			Map mes=Maps.newHashMap();
			for(HornBean hBean : list){
				String message="恭喜"+hBean.getV_nickname()+"获得了"+hBean.getV_good_name();
				String goodsID=hBean.getV_good_id();
				String goodsPID=hBean.getI_issue().toString();
				mes.put("message", message);
				mes.put("goodsID", goodsID);
				mes.put("goodsPID", goodsPID);
				lis.add(mes);
			}
		    op =new OutPutPojo("0","加载成功",lis);
		}else{
			op =new OutPutPojo("1","加载失败",null);
		}
		return op;
	}
	
	
}

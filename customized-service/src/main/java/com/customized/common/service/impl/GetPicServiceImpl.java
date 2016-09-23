package com.customized.common.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customized.common.dao.IGetPicDao;
import com.customized.common.service.IGetParamService;
import com.customized.common.service.IGetPicService;
import com.customized.config.DBConstants;
import com.customized.util.LcStringUtil;

/**
 * 功能：根据不同图片类型获取图片地址的公用方法，对于需要返回多个图片如商品详情则 返回list 否则返回一个图片的地址,
 * @author yangmengfan
 * @since
 * @version 1.0
 * 入参：图片ID，图片类型等
 * 出参：图片地址
 * */
@Service
public class GetPicServiceImpl implements IGetPicService{
	
	@Autowired
	private IGetPicDao picdao;
	@Autowired
	private IGetParamService paramservice;
	// 7牛地址在数据库中的key
	private String qiniuurlstr = DBConstants.QINIU_URL;
	
	/*
	 * 功能:返回图片地址  对于7牛图片，在参数表查询网址后拼接 
	 * 入参:otherid:关联ID   appversion:app版本信息（关联app版本信息表）  pictype:图片类型（关联系统参数表）
	 * 出参:图片地址 
	 * */ 
	public String getPicUrl(String otherid,String appversion,int pictype){
		String picurl = "";
		if(LcStringUtil.isNull(otherid) && LcStringUtil.isNull(appversion) && pictype<0){
			return picurl;
		}
		List<String> piclist = picdao.getPicUrl(otherid, appversion, pictype);
		if(piclist!= null && piclist.size()>0)
		{
			String qiniuurl = paramservice.getParamValue(qiniuurlstr);
			picurl = piclist.get(0);
			if(!LcStringUtil.isNull(qiniuurl))
			{
				picurl = qiniuurl + picurl; // 拼接上7牛公用地址
			}
		}
		return picurl;
	}
	/*
	 * 功能:返回图片地址 如商品详情会需要返回多个图片地址, 返回list
	 * 入参:otherid:关联ID   appversion:app版本信息（关联app版本信息表）  pictype:图片类型（关联系统参数表）
	 * 出参:图片地址list
	 * */ 
    public List<String> getPicsUrl(String otherid,String appversion,int pictype){
    	if(LcStringUtil.isNull(otherid) && LcStringUtil.isNull(appversion) && pictype<0){
			return (new ArrayList<String>());
		}
    	List<String> piclist = picdao.getPicUrl(otherid, appversion, pictype);
    	if(piclist!= null && piclist.size()>0)
		{
    		String picstr = "";
    		for(int i = 0; i < piclist.size(); i++){
    			String qiniuurl = paramservice.getParamValue(qiniuurlstr);
    			picstr = piclist.get(i);
    			if(!LcStringUtil.isNull(qiniuurl))
    			{
    				picstr = qiniuurl + picstr; // 拼接上7牛公用地址
    			}
    			piclist.set(i, picstr);
    		} 
		}
    	return piclist;
    }
}

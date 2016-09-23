package com.customized.record.service.impl;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.customized.basic.BasicExtendPojo;
import com.customized.config.Constants;
import com.customized.config.DBConstants;
import com.customized.record.dao.IPartInRecordDao;
import com.customized.record.service.IPartInRecordService;
import com.customized.support.dubbo.spring.annotation.DubboService;
import com.customized.util.LcStringUtil;

/**
 * 功能：本期我的参与记录接口实现类
 * @author yangmengfan
 * @since
 * @version 1.0
 * 入参：公用扩展入参实体类
 * 出参：购买号码列表
 * */
@DubboService(version = "0.0.1" , interfaceClass = IPartInRecordService.class)
public class PartInRecordServiceImpl implements IPartInRecordService{
	
	@Autowired
	private IPartInRecordDao partRecordDao;
	// 众筹状态 为正在进行中
	private String crowdState = DBConstants.ZCZT_JXZ;  // 默认为1
	/*
	 * param:  basicepojo 公用参数类   
	 * 描述:根据参数类中 商品期数判断 大于0 表示查询往期 等于0 表示查询当期
	 * return: 购买号码列表
	 * */ 
    public List<String> getPartInRecordInfo(BasicExtendPojo basicepojo){
    	
    	int page = basicepojo.getPageNum();
    	// 当前每页条数
    	int pagesize = basicepojo.getPageSize();
    	// 商品期数如果为0 则查询正在开奖的那期，默认不为0
    	String qishu = basicepojo.getGoodsPId();  // 默认商品期数不为0
    	// 
    	int qishuint = 0;
    	if(!LcStringUtil.isNull(qishu) && !"0".equals(qishu)){
    		qishuint = Integer.valueOf(qishu).intValue();
    	}
    	if(page > 0 && pagesize >0){
    		int newpage = (page-1)*pagesize;
    		basicepojo.setPageNum(newpage);
    	}else{
    		// 默认取前10条数据
    		basicepojo.setPageNum(Constants.PAGE_DEFAULT_NUM - 1);
    		basicepojo.setPageSize(Constants.PAGE_PER_SIZE);
    	}
    	List<String> codelist = partRecordDao.getPartInRecord(basicepojo, qishuint, crowdState);
    	return codelist;
    }
}

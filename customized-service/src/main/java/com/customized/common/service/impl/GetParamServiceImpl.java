package com.customized.common.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customized.common.dao.IGetParamDao;
import com.customized.common.service.IGetParamService;

/**
 * 功能：获取参数表参数 (暂时用到一种参数获取方式，如果需要其他可以自行添加)
 * @author yangmengfan
 * @since
 * @version 1.0
 * 入参：参数Key
 * 出参：参数Value
 * */
@Service
public class GetParamServiceImpl implements IGetParamService{
	
	@Autowired
	private IGetParamDao paramdao;
	/*
	 * 功能:获取参数表参数  本次针对 mm_sys_param 系统参数表 相关值，其他参数表与系统参数表结构有差别，需要另外处理
	 * 入参：参数Key
	 * 出参：参数Value
	 * */ 
	public String getParamValue(String key){
		return paramdao.getParamValue(key);
	}
}

package com.customized.common.service;

import java.util.List;

/**
 * 功能：获取参数表参数 (暂时用到一种参数获取方式，如果需要其他可以自行添加)
 * @author yangmengfan
 * @since
 * @version 1.0
 * 入参：参数Key
 * 出参：参数Value
 * */
public interface IGetParamService{
	/*
	 * 功能:获取参数表参数  本次针对 mm_sys_param 系统参数表 相关值，其他参数表与系统参数表结构有差别，需要另外处理
	 * 入参：参数Key
	 * 出参：参数Value
	 * */ 
	public String getParamValue(String key);
 
}

package com.customized.account.service.impl;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.customized.account.dao.IUserRemainderDao;
import com.customized.account.service.IUserRemainderService;
import com.customized.basic.BasicPojo;
import com.customized.support.dubbo.spring.annotation.DubboService;
import com.customized.util.LcStringUtil;

/**
 * 功能：查询余额接口service接口
 * @author yangmengfan
 * @since
 * @version 1.0
 * 入参：公共入参实体类		BasicPojo
 * 出参：账户余额 	        
 * */

@DubboService(version = "0.0.1" , interfaceClass = IUserRemainderService.class)
public class UserRemainderServiceImpl implements IUserRemainderService{
	
	@Autowired
	private IUserRemainderDao uremainderdao;
	
	 public List<String> getPartInRecordInfo(BasicPojo basicpojo){
		 
		 String userid = basicpojo.getUserID();
		 // 通过userid获取账户余额
		 List<BigDecimal> remainlist = uremainderdao.getUserRemainder(userid);
 		 List<String> uremainderlist = new ArrayList<String>();
 		 for(BigDecimal bd : remainlist){
 			 // BigDecimal 转 String 
 			 String str = LcStringUtil.bigDecimalToString(bd);
 			 uremainderlist.add(str);
 		 }
		 return uremainderlist;
 
		 
	 }
	 
}

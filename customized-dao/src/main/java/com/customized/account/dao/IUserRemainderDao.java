package com.customized.account.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

/**
 * 功能：查询余额接口service接口
 * @author yangmengfan
 * @since
 * @version 1.0
 * 入参：用户ID
 * 出参：账户余额 	        
 * */	
@Repository
public interface IUserRemainderDao {
    
	/*
	 * param:  用户ID
	 * 描述:查询余额接口service接口
	 * return: 账户余额
	 * */ 
    List<BigDecimal> getUserRemainder(@Param("userID") String userid);
    
}

package com.customized.account.service;

import java.util.List;

import com.customized.basic.BasicPojo;


/**
 * 功能：查询余额接口service接口
 * @author yangmengfan
 * @since
 * @version 1.0
 * 入参：公共入参实体类		BasicPojo
 * 出参：账户余额 	        
 * */

public interface IUserRemainderService {
    public List<String> getPartInRecordInfo(BasicPojo basicpojo);
}

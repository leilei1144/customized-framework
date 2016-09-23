package com.customized.record.dao;

import com.customized.basic.BasicExtendPojo;
import com.customized.basic.BasicPojo;
import com.customized.newpublish.pojo.NewPublishGoodPojo;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 功能：本期我的参与记录接口DAO
 * @author yangmengfan
 * @since
 * @version 1.0
 * 入参：公用扩展入参实体类
 * 出参：购买号码列表
 * */
@Repository
public interface IPartInRecordDao {
    
	/*
	 * param:  basicepojo 公用参数类    
	 * 描述:根据参数类中 商品期数判断 大于0 表示查询往期 等于0 表示查询当期
	 * return: 购买号码列表
	 * */ 
    List<String> getPartInRecord(@Param("bpojo") BasicExtendPojo basicepojo,@Param("issue") int qishuint,@Param("zcztstate") String state);
    
}

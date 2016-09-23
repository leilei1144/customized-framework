package com.customized.record.service;

import java.util.List;

import com.customized.basic.BasicExtendPojo;

/**
 * 功能：本期我的参与记录接口
 * @author yangmengfan
 * @since
 * @version 1.0
 * 入参：公用扩展入参实体类
 * 出参：购买号码列表
 * */
public interface IPartInRecordService {
    public List<String> getPartInRecordInfo(BasicExtendPojo basicepojo);
}

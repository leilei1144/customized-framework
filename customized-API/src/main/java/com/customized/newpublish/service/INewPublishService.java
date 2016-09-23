package com.customized.newpublish.service;

import java.util.List;

import com.customized.basic.BasicPojo;
import com.customized.newpublish.pojo.NewPublishGoodPojo;

/**
 * 功能：获取最新揭晓商品接口
 * @author yangmengfan
 * @since
 * @version 1.0
 * 入参：暂无
 * 出参：最新揭晓实体类列表
 * */
public interface INewPublishService {
    public List<NewPublishGoodPojo> getNewPublish(BasicPojo basicpojo);
}

package com.customized.goodsDetail.dao;

import com.customized.goodsDetail.pojo.GoodsDetailBean;
import com.customized.goodsDetail.pojo.GoodsDetailParamPojo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2016/9/8.
 */
@Repository
public interface IGdetailDao {
    //查询相关信息
    GoodsDetailBean getDetail(GoodsDetailParamPojo gp);
    //查询图片地址对应的多张详细图片地址
    List<GoodsDetailBean> getImgsUrl(String goodsID);
    //状态为已开奖的时候，查询相关中奖信息
    GoodsDetailBean getWinMessage(GoodsDetailParamPojo goodsDetailParamPojo);

    GoodsDetailBean getJoinTimes(GoodsDetailParamPojo goodsDetailParamPojo);
}

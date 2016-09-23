package com.customized.goodsDetail.service.impl;

import com.customized.basic.OutPutPojo;
import com.customized.goodsDetail.dao.IGdetailDao;
import com.customized.goodsDetail.pojo.GoodsDetailParamPojo;
import com.customized.goodsDetail.pojo.GoodsDetailBean;
import com.customized.goodsDetail.service.IGdetailService;
import com.customized.support.dubbo.spring.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/9/8.
 */
@DubboService(version = "0.0.1" , interfaceClass = IGdetailService.class)
public class GdetailServiceImpl implements IGdetailService {
    @Autowired
    private IGdetailDao iGdetailDao;
    @Override
    public List getDetail(GoodsDetailParamPojo goodsDetailParamPojo) {
        GoodsDetailBean gdBean=iGdetailDao.getDetail(goodsDetailParamPojo);
        List<GoodsDetailBean> imgs=iGdetailDao.getImgsUrl(goodsDetailParamPojo.getGoodsID());
        if(imgs.size()>0){
            gdBean.setGoodsBannerImage(imgs);
        }
        //如果商品已开奖
        if(gdBean.getGoodsStatus().equals("3")){
            //获取中奖人相关信息
            GoodsDetailBean gBean=iGdetailDao.getWinMessage(goodsDetailParamPojo);
            //获取当前用户参与次数
            GoodsDetailBean uBean=iGdetailDao.getJoinTimes(goodsDetailParamPojo);
            if(gBean!=null){
                gdBean.setUserName(gBean.getUserName());
                gdBean.setWinNum(gBean.getWinNum());
                gdBean.setHeadUrl(gBean.getHeadUrl());
                gdBean.setWinJoinTime(gBean.getWinJoinTime());
                gdBean.setCityIP(gBean.getCityIP());
                gdBean.setOpenTime(gBean.getOpenTime());
                gdBean.setMyJoinTime(gBean.getMyJoinTime());
            }
            if(uBean!=null){
                gdBean.setMyJoinTime(uBean.getMyJoinTime());
            }
        }
        List list=new ArrayList();
        list.add(gdBean);
        return list;
    }
}

package com.customized.goods.service.impl;

import com.customized.goods.dao.IGoodsListDao;
import com.customized.goods.pojo.GoodsListBean;
import com.customized.goods.servive.IGoodsListService;
import com.customized.support.dubbo.spring.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by grant on 16/9/9.
 */
@DubboService(version = "0.0.1" , interfaceClass = IGoodsListService.class)
public class GoodsListServiceImpl implements IGoodsListService {

    @Autowired
    public IGoodsListDao goodsListDao;

    @Override
    public List<GoodsListBean> queryGoodsList(GoodsListBean goodsListBean) {


        List<GoodsListBean> goodsList = goodsListDao.queryGoodsList(goodsListBean);

        return goodsList;
    }
}

package com.customized.goods.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.customized.basic.OutPutPojo;
import com.customized.config.Constants;
import com.customized.goods.pojo.GoodsListBean;
import com.customized.goods.servive.IGoodsListService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by grant on 16/9/9.
 */
@Api(value = "商品列表伤口")
@Controller
public class GoodsListController {



    @Reference(version = "0.0.1")
    public IGoodsListService goodsListService;
    @ApiOperation(value = "商品列表接口")
    @RequestMapping(value = "/app/v1/quarryGoodsList" , method = RequestMethod.POST)
    @ResponseBody public OutPutPojo queryGoodsList(GoodsListBean goodsListBean){
        List<GoodsListBean> goodsList = goodsListService.queryGoodsList(goodsListBean);
        OutPutPojo outPutPojo = null;
        if(null != goodsList &&goodsList.size() > 0){
            outPutPojo  = new OutPutPojo(Constants.IS_OK_STATE , Constants.IS_OK,goodsList);
        }else{
            outPutPojo = new OutPutPojo(Constants.IS_ERROR_STATE , Constants.IS_ERROR,null);
        }
        return outPutPojo;
    }
}

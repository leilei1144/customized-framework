package com.customized.goodsDetail.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.customized.basic.OutPutPojo;
import com.customized.config.Constants;
import com.customized.goodsDetail.pojo.GoodsDetailParamPojo;
import com.customized.goodsDetail.service.IGdetailService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


/**
 * Created by grant on 16/8/31.
 */
@Api(value = "商品详情接口类")
@Controller
public class GoodsDetailController {
	private static Logger logger = LoggerFactory.getLogger(GoodsDetailController.class);
	
	@Reference(version="0.0.1")
	private IGdetailService gdService;
		
    @ApiOperation(value = "获取商品详情")
    @RequestMapping(value = "/app/v1/queryGoodsDetails" , method = RequestMethod.POST)
    @ResponseBody
    public OutPutPojo getGoodsDetail(GoodsDetailParamPojo goodsDetailParamPojo){
        OutPutPojo outPutPojo;
        List list=gdService.getDetail(goodsDetailParamPojo);
        if(list.size()>0){
            outPutPojo=new OutPutPojo(Constants.IS_OK_STATE, Constants.IS_OK,list);
        }else{
            outPutPojo=new OutPutPojo(Constants.IS_ERROR_STATE , Constants.IS_ERROR ,null);
        }
        return outPutPojo;
    }

}

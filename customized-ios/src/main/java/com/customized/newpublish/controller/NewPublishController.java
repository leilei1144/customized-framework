package com.customized.newpublish.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.customized.basic.BasicPojo;
import com.customized.basic.OutPutPojo;
import com.customized.config.Constants;
import com.customized.newpublish.pojo.NewPublishGoodPojo;
import com.customized.newpublish.service.INewPublishService;

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
 * 功能：最新揭晓商品控制类
 * @author yangmengfan
 * @since
 * @version 1.0
 * 入参：公共参数实体类
 * 出参：返回客户端实体类
 * */

@Api(value = "最新揭晓控制类")
@Controller
public class NewPublishController {
	private static Logger logger = LoggerFactory.getLogger(NewPublishController.class);
	
	@Reference(version="0.0.1")
	private INewPublishService npublishService;
		
    @ApiOperation(value = "获取最新揭晓商品(1,page信息为0时,显示前3位;2,page信息不为0时,显示指定分页最新商品)")
    @RequestMapping(value = "/app/v1/queryNewGoods" , method = RequestMethod.POST)
    @ResponseBody  
    public OutPutPojo getGoodsDetail(BasicPojo bpojo){
        OutPutPojo outPutPojo;
        //  暂时自己初始化入参对象,以后线上如果传值为空则直接返回加载异常
        	// outPutPojo=new OutPutPojo("-1","加载失败",null);
        	// return outPutPojo;
        	// 默认3个最新测试
        	// bpojo.setPageNum(1);
        	// bpojo.setPageSize(10);
        	// bpojo.setClientVersion("0.0.0.1");  
        	
        List<NewPublishGoodPojo> list=npublishService.getNewPublish(bpojo);
        if(list!=null && list.size()>0){
            outPutPojo=new OutPutPojo(Constants.IS_OK_STATE, Constants.IS_OK,list);
        }else{
            outPutPojo=new OutPutPojo("-1","加载失败",null);
        }
        return outPutPojo;
    }

}

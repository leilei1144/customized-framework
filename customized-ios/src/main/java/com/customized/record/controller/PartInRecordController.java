package com.customized.record.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.customized.basic.BasicExtendPojo;
import com.customized.basic.OutPutPojo;
import com.customized.config.Constants;
import com.customized.record.service.IPartInRecordService;

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
 * 功能：本期我的参与记录控制类
 * @author yangmengfan
 * @since
 * @version 1.0
 * 入参：继承公共参数的往期入参实体类		BasicExtendPojo
 * 出参：返回购买号码list 	 	        
 * */

@Api(value = "本期我的参与记录控制类")
@Controller
public class PartInRecordController {
	private static Logger logger = LoggerFactory.getLogger(PartInRecordController.class);
	
 	@Reference(version="0.0.1")
 	private IPartInRecordService partRecordService;
		
    @ApiOperation(value = "本期我的参与记录控制类,(如果商品期数为0 返回最新期(状态为正在进行的那期))")
    @RequestMapping(value = "/app/v1/queryMyRecord" , method = RequestMethod.POST)
    @ResponseBody  
    public OutPutPojo getPartInRecordInfo(BasicExtendPojo basicepojo){
        OutPutPojo outPutPojo;
//        basicepojo.setPageNum(1);
//        basicepojo.setPageSize(10);
//        basicepojo.setGoodsId("g1001");
//        basicepojo.setGoodsPId("0");
//        basicepojo.setUserID("u123");
        
        //  暂时自己初始化入参对象,以后线上如果传值为空则直接返回加载异常
        	// outPutPojo=new OutPutPojo("-1","加载失败",null);
        	// return outPutPojo;
        	// 默认3个最新测试
        	// bpojo.setPageNum(1);
        	// bpojo.setPageSize(10);
        	// bpojo.setClientVersion("0.0.0.1");  
         List<String> list=partRecordService.getPartInRecordInfo(basicepojo);
         if(list!=null && list.size()>0){
            outPutPojo=new OutPutPojo(Constants.IS_OK_STATE, Constants.IS_OK,list);
         }else{
            outPutPojo=new OutPutPojo("-1","加载失败",null);
         }
        return outPutPojo;
    }

}

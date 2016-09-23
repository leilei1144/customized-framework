package com.customized.account.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.customized.account.service.IUserRemainderService;
import com.customized.basic.BasicExtendPojo;
import com.customized.basic.BasicPojo;
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
 * 功能：查询余额接口
 * @author yangmengfan
 * @since
 * @version 1.0
 * 入参：公共入参实体类		BasicPojo
 * 出参：账户余额 	        
 * */

@Api(value = "查询账户余额控制类")
@Controller
public class UserRemainderController {
	private static Logger logger = LoggerFactory.getLogger(UserRemainderController.class);
	
 	@Reference(version="0.0.1")
 	private IUserRemainderService userRemainderService;
		
    @ApiOperation(value = "账户余额查询")
    @RequestMapping(value = "/app/v1/queryRemaining" , method = RequestMethod.POST)
    @ResponseBody  
    public OutPutPojo getUserRemainderInfo(BasicPojo basicpojo){
        OutPutPojo outPutPojo;
        
        // 测试
        // basicpojo.setUserID("u1001");
   
         List<String> list=userRemainderService.getPartInRecordInfo(basicpojo);
         if(list!=null && list.size()>0){
            outPutPojo=new OutPutPojo(Constants.IS_OK_STATE, Constants.IS_OK,list);
         }else{
            outPutPojo=new OutPutPojo("-1","加载失败",null);
         }
        return outPutPojo;
    }

}

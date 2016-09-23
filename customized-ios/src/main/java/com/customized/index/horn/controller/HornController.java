package com.customized.index.horn.controller;

import com.customized.basic.BasicPojo;
import com.customized.basic.OutPutPojo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.config.annotation.Reference;
import com.customized.horn.servive.IHornService;


/**
 * Created by grant on 16/8/31.
 */
@Api(value = "首页小喇叭接口类")
@Controller
public class HornController {
	private static Logger logger = LoggerFactory.getLogger(HornController.class);
	
	@Reference(version="0.0.1")
	private IHornService hService;
		
    @ApiOperation(value = "获取小喇叭方法")
    @RequestMapping(value = "/app/v1/queryRollMessage" , method = RequestMethod.POST)
    @ResponseBody
    public OutPutPojo getHorns(BasicPojo basicPojo){
        OutPutPojo outPutPojo = hService.getHorns(basicPojo.getAccessToken(),10);
        return outPutPojo;
    }

}

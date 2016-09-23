package com.customized.register.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.customized.appregister.service.IAppRegisterService;
import com.customized.basic.OutPutPojo;
import com.customized.login.pojo.UserLoginBean;
import com.customized.login.pojo.UserMessageBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.web.header.Header;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chenmf
 * @date   2016-08-24
 * @version 1.0
 * @description 用户注册接口
 *
 */
@Api(value = "注册接口")
@Controller
public class AppRegisterController {
    private static Logger logger = LoggerFactory.getLogger(AppRegisterController.class);

    @Reference(version="0.0.1")
    private IAppRegisterService iAppRegisterService;
    /**
     *
     *@version 1.0
     *@description app用户注册验证
     */
    @ApiOperation(value = "注册验证")
    @RequestMapping(value="/app/v1/queryRegister" ,method=RequestMethod.POST)
    @ResponseBody
    public OutPutPojo appRegister(UserLoginBean userBean, @RequestHeader Header header) {
        OutPutPojo outPutPojo=null;
        List list=new ArrayList();
        UserMessageBean userMessageBean=iAppRegisterService.insertUser(userBean);
        list.add(userMessageBean);
        //0,注册成功
        if(userMessageBean.getFlag()==0){
            outPutPojo=new OutPutPojo("0","注册成功",list);
        }
        if(userMessageBean.getFlag()==1){
            outPutPojo=new OutPutPojo("4","程序异常",list);
        }
        if(userMessageBean.getFlag()==2){
            outPutPojo=new OutPutPojo("4","用户名已存在",list);
        }
        if(userMessageBean.getFlag()==3){
            outPutPojo=new OutPutPojo("4","链接异常",list);
        }
        return outPutPojo;
    }
}

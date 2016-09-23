package com.customized.login.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.customized.appLogin.service.IAppLoginService;
import com.customized.basic.OutPutPojo;
import com.customized.login.pojo.UserLoginBean;
import com.customized.login.pojo.UserMessageBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.web.header.Header;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
 * @description 用户登录校验相关接口
 *
 */
@Api(value = "登录接口")
@Controller
public class AppLoginController {
	private static Logger logger = LoggerFactory.getLogger(AppLoginController.class);

	@Reference(version="0.0.1")
	private IAppLoginService iLoginService;
	/**
	 * 
	 *@version 1.0
	 *@description app用户登录验证
	 */
	@ApiOperation(value = "登录验证")
    @RequestMapping(value="/app/v1/queryLogin" ,method=RequestMethod.POST)
    @ResponseBody
    public OutPutPojo appLogin(UserLoginBean userBean, Model model , @RequestHeader Header header) {
		OutPutPojo outPutPojo=null;
		List list=new ArrayList();
		UserMessageBean userMessageBean=iLoginService.findUser(userBean);
		if(userMessageBean.getFlag()==1){
			outPutPojo=new OutPutPojo("4","用户名密码错误",null);
		}
		if(userMessageBean.getFlag()==2){
			list.add(userMessageBean);
			outPutPojo=new OutPutPojo("4","登录超时",list);
		}
		if(userMessageBean.getFlag()==3){
			list.add(userMessageBean);
			outPutPojo=new OutPutPojo("4","链接异常",null);
		}
		if(userMessageBean.getFlag()==4){
			list.add(userMessageBean);
			outPutPojo=new OutPutPojo("4","程序异常",null);
		}
		if(userMessageBean.getFlag()==0){
			list.add(userMessageBean);
			outPutPojo=new OutPutPojo("0","登录成功",list);
		}

    	return outPutPojo;
	}

}

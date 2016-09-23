package com.customized.login.controller;
import com.customized.login.pojo.UserMessageBean;
import com.customized.login.servive.IWebLoginService;

import io.swagger.annotations.Api;


import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.config.annotation.Reference;

/**
 * 
 * @author chenmf
 * @date   2016-08-24
 * @version 1.0
 * @description 用户登录校验相关接口
 *
 */
@Api
@Controller
public class WebLoginController {
	private static Logger logger = LoggerFactory.getLogger(WebLoginController.class);
	//返回验证成功失败标志
	public static final String FLAG="flag";
	@Reference(version = "0.0.1")
	private IWebLoginService webLoginService;
	/**
	 *@version 1.0
	 *@description web用户登录页面显示
	 */
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String home(Model model){
		logger.info("--------管理员登录首页");
		return "index/login";
	}
	public String login(String cname,String cpwd,Model model){
		if (cname.equals(cpwd)) {
			model.addAttribute("cname",cname);
			return "loginHome.jsp";
		} else {
			return "back_enabled.jsp";
		}
	}
	
	/**
	 * 
	 *@version 1.0
	 *@description web用户登录验证
	 */
    @RequestMapping(value="/login" ,method=RequestMethod.POST)
    @ResponseBody
    public String weblogin(UserMessageBean userBean,Model model, HttpSession sess){
    	
    	//Map<String, Object> map = new HashMap<String, Object>();
    	
    	//查询数据库是否存在用户输入的用户名密码
    	UserMessageBean user=webLoginService.findUser(userBean);
		if(user==null){
    		//用户名密码错误返回信息
			 return "redirct:jsp/login/login.jsp";
    	}
		// 用户被禁用返回验证信息
    	else
    	{	
			sess.setAttribute("user", userBean.getCname());
			//角色判断
			if(user.getCusertype().equals("0")){
				return "redirct:jsp/login/home.jsp";
			}
    	}	
		return null;
    }
    /**
     * 
     * @param req
     * @param model
     * @return string
     */
    @RequestMapping(value="/exit", method = RequestMethod.GET)
	public String exit(HttpSession sess,Model model){	
    	sess.removeAttribute("user");
		return "index/login";
	}
}

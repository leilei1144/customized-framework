package com.customized.login.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.customized.login.dao.IWebLoginDao;
import com.customized.login.pojo.UserMessageBean;
import com.customized.login.servive.IWebLoginService;
import com.customized.support.dubbo.spring.annotation.DubboService;
import com.customized.util.MD5Utils;

@DubboService(version = "0.0.1" , interfaceClass = IWebLoginService.class)
public class WebLoginServiceImpl implements IWebLoginService {
	private static Logger logger = LoggerFactory.getLogger(WebLoginServiceImpl.class);
	@Autowired
	private IWebLoginDao webLoginDao;
	
	@Override
	public UserMessageBean findUser(UserMessageBean userBean) {
		//获取输入用户的相关信息，为了md5加密密码对比
	/*	UserMessageBean user = webLoginDao.getCguid(userBean.getCname());
		if(user!=null){
			String newPwd=MD5Utils.encode(userBean.getCpwd(), user.getCguid());
			if(newPwd.equals(user.getCpwd())){
				return user;
			}
		}*/
		return null;
	}
	
	
}

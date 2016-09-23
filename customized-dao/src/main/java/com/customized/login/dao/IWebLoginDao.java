package com.customized.login.dao;

import com.customized.login.pojo.UserMessageBean;

import org.springframework.stereotype.Repository;

@Repository
public interface IWebLoginDao {

	public UserMessageBean getCguid(String cname) ;
	
}

package com.customized.appregister.service;

import com.customized.login.pojo.UserLoginBean;
import com.customized.login.pojo.UserMessageBean;

import java.util.List;

/**
 * Created by Administrator on 2016/9/20.
 */
public interface IAppRegisterService {
    public UserMessageBean insertUser(UserLoginBean userLoginBean);
}

package com.customized.appLogin.service;

import com.customized.login.pojo.UserLoginBean;
import com.customized.login.pojo.UserMessageBean;

/**
 * Created by Administrator on 2016/9/12.
 */
public interface IAppLoginService {
    public UserMessageBean findUser(UserLoginBean userLoginBean);
}

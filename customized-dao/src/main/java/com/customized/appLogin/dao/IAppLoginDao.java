package com.customized.appLogin.dao;

import com.customized.login.pojo.UserLoginBean;
import com.customized.login.pojo.UserMessageBean;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2016/9/13.
 */
@Repository
public interface IAppLoginDao {
    UserMessageBean findUser(UserLoginBean userLoginBean);
}

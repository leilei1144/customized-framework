package com.customized.appregister.dao;

import com.customized.login.pojo.UserMessageBean;
import com.customized.register.pojo.UserRegisterBean;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2016/9/20.
 */
@Repository
public interface IAppRegisterDao {
    UserMessageBean findUserExist(String userName);
    int insertUser(UserRegisterBean userRegisterBean);
}

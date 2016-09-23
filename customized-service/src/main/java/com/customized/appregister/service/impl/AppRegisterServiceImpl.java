package com.customized.appregister.service.impl;

import com.customized.appLogin.dao.IAppLoginDao;
import com.customized.appLogin.service.IAppLoginService;
import com.customized.appregister.dao.IAppRegisterDao;
import com.customized.appregister.service.IAppRegisterService;
import com.customized.login.pojo.UserLoginBean;
import com.customized.login.pojo.UserMessageBean;
import com.customized.register.pojo.UserRegisterBean;
import com.customized.support.dubbo.spring.annotation.DubboService;
import com.customized.support.security.coder.RSACoder;
import com.customized.util.AccessToken;
import com.customized.util.Guid;
import com.customized.util.MD5Utils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/9/12.
 */
@DubboService(version = "0.0.1",interfaceClass =IAppRegisterService.class )
public class AppRegisterServiceImpl implements IAppRegisterService {
    private static Logger logger= LoggerFactory.getLogger(AppRegisterServiceImpl.class);
    @Autowired
    private IAppRegisterDao iAppRegisterDao;
    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public UserMessageBean insertUser(UserLoginBean userLoginBean) {
        UserMessageBean uBean=new UserMessageBean();
        String username=null;
        //验证链接有效性
        Map<String,String> map=userLoginBean.getCpwd();
        try {
            boolean flag = RSACoder.verify(map.get("mi"), RSACoder.decryptBASE64(map.get("pubKey")), map.get("sign"));
            if (flag) {
                //验证通过，判断用户名是否已经注册
                if(userLoginBean.getPhoneNum()!=null){
                    username=userLoginBean.getPhoneNum();
                }else if(userLoginBean.getQQNum()!=null){
                    username=userLoginBean.getQQNum();
                }else{
                    username=userLoginBean.getWeChat();
                }
                //要去查找用户名是否注册
                uBean=iAppRegisterDao.findUserExist(username);
                //没有注册过
                if(uBean==null){
                    //获取密码
                    String upwd = RSACoder.decryptByPublicKey(map.get("mi"), RSACoder.decryptBASE64(map.get("pubKey")));
                    upwd = MD5Utils.encode(upwd, userLoginBean.getUserID());
                    //生成guid，userID
                    String cguid= Guid.g();
                    String userID=Guid.g();
                    UserRegisterBean urBean=new UserRegisterBean(cguid,userID,username,upwd);
                    //将数据插入数据库完成注册
                    int result=iAppRegisterDao.insertUser(urBean);
                    //插入成功
                    if(result==1){
                        //生成token
                        String token=AccessToken.getToken(userID);
                        uBean.setAccessToken(token);
                        uBean.setUserID(userID);
                        uBean.setFlag(0);
                        return  uBean;
                    }else {
                        uBean.setFlag(1);
                    }
                }else {
                    uBean.setFlag(2);
                }
            }else{
                uBean.setFlag(3);
            }
        }catch (Exception e){
            logger.error(e.toString());
            uBean.setFlag(1);
        }
        return uBean;
    }
}

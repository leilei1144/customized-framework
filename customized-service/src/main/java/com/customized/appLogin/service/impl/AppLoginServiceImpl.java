package com.customized.appLogin.service.impl;

import com.customized.appLogin.dao.IAppLoginDao;
import com.customized.appLogin.service.IAppLoginService;
import com.customized.login.pojo.UserLoginBean;
import com.customized.login.pojo.UserMessageBean;
import com.customized.support.dubbo.spring.annotation.DubboService;
import com.customized.support.security.coder.RSACoder;
import com.customized.util.AccessToken;
import com.customized.util.MD5Utils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.AccessType;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.Map;

/**
 * Created by Administrator on 2016/9/12.
 */
@DubboService(version = "0.0.1",interfaceClass =IAppLoginService.class )
public class AppLoginServiceImpl implements IAppLoginService {
    private static Logger logger= LoggerFactory.getLogger(AppLoginServiceImpl.class);
    @Autowired
    private IAppLoginDao iAppLoginDao;
    @Autowired
    private RedisTemplate redisTemplate;
    @Override
    public UserMessageBean findUser(UserLoginBean userLoginBean) {
        UserMessageBean uBean=new UserMessageBean();
        Map<String,String> map=userLoginBean.getCpwd();
        //验证链接有效性和解密用户密码
        try {
            boolean flag= RSACoder.verify(map.get("mi"),RSACoder.decryptBASE64(map.get("pubKey")),map.get("sign"));
            if(flag){
                //验证通过，解密获取密码
                String upwd=RSACoder.decryptByPublicKey(map.get("mi"),RSACoder.decryptBASE64(map.get("pubKey")));
                upwd= MD5Utils.encode(upwd,userLoginBean.getUserID());
                userLoginBean.setUpwd(upwd);
                //判断用户是否存在
                uBean=iAppLoginDao.findUser(userLoginBean);
                if(uBean!=null){
                    //验证token是否超时
                    String token=redisTemplate.opsForValue().get(userLoginBean.getUserID()).toString();
                    //token未失效，即登录成功
                    if(token.equals(userLoginBean.getAccessToken())){
                        uBean.setFlag(0);
                    }else {
                        //登录超时生成新token返回
                        String newToken =AccessToken.getToken(userLoginBean.getUserID());
                        uBean.setAccessToken(newToken);
                        uBean.setFlag(2);
                    }
                }else{
                    //用户名密码错误
                    uBean.setFlag(1);
                }
            }else{
                //链接异常
                uBean.setFlag(3);
            }
        } catch (Exception e) {
            logger.error(e.toString());
            uBean.setFlag(4);
        }
        return uBean;
    }
}

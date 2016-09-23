package com.customized.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

/**
 * Created by grant on 16/8/25.
 */
@Component
public class AccessToken {

    public static String getToken(String uid){
        String token = SecurityUtil.encryptMd5toKen(uid);
        return token;
    }
    public static void main(String[] args){
        for (int i = 0 ; i < 100 ; i ++){
            System.out.println(getToken("123"));
        }
    }
}

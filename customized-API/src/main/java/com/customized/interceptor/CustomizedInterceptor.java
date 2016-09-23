package com.customized.interceptor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;

/**
 * Created by grant on 16/9/19.
 */
public class CustomizedInterceptor implements HandlerInterceptor {

    @Autowired
    public RedisTemplate redisTemplate;

    @Override
    public boolean preHandle(HttpServletRequest req, HttpServletResponse resp, Object o) throws Exception {
        String userID = req.getHeader("userID");
        Object ruserID = redisTemplate.opsForValue().get("token:" + userID);
        if (userID.equals(String.valueOf(ruserID))){
            return true;
        }else{
            Map map = Maps.newHashMap();
            map.put("returnCode" , "-1");
            map.put("returnMessage","请重新登录");
            ObjectMapper objectMapper = new ObjectMapper();
            resp.getWriter().write(objectMapper.writeValueAsString(map));

            return false;
        }
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}

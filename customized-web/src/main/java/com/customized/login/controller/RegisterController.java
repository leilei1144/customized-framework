package com.customized.login.controller;

import com.google.common.collect.Maps;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * Created by grant on 16/8/25.
 */
@Controller
public class RegisterController {

    //@RequestMapping()
    //@ResponseBody
    public Map register(HttpServletRequest req){
        Map map = Maps.newHashMap();
        //注册代码......................
        //验证代码......................

        if(true){
            map.put("returnCode","200");
            map.put("returnMessage","success");
        }else{
            map.put("returnCode","500");
            map.put("returnMessage","error");
        }
        return map;
    }
}

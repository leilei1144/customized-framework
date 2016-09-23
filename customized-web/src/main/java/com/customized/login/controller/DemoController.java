package com.customized.login.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.customized.demo.IDemoService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by grant on 16/8/19.
 */
@Controller
public class DemoController {
    @Reference(version = "0.0.1")
    private IDemoService demoService;
    @RequestMapping(value = "/dubbo" , method = RequestMethod.GET)
    @ResponseBody
    public String index(){
        return demoService.sayHello("world");
    }
}

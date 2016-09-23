package com.customized.demo;

import com.customized.support.dubbo.spring.annotation.DubboService;

/**
 * Created by grant on 16/8/19.
 */
@DubboService(version = "0.0.1" , interfaceClass = IDemoService.class)
public class DemoServiceImpl implements IDemoService{
    @Override
    public String sayHello(String name) {
        return "hello" + name + "!";
    }
}

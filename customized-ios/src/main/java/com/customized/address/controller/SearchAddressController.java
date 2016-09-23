package com.customized.address.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.customized.address.pojo.AddressListBean;
import com.customized.address.service.IAddressService;
import com.customized.basic.BasicPojo;
import com.customized.basic.OutPutPojo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Administrator on 2016/9/20.
 */
@Api(value = "查询收货地址接口")
@Controller
public class SearchAddressController {
    private static Logger logger= LoggerFactory.getLogger(SearchAddressController.class);

    @Reference(version="0.0.1")
    private IAddressService iAddressService;


    @ApiOperation(value = "获取收货地址")
    @RequestMapping(value = "/app/v1/queryAddress" , method = RequestMethod.GET)
    @ResponseBody
    public OutPutPojo searchAddress(BasicPojo basicPojo){
        basicPojo.setUserID("u1002");
        OutPutPojo outPutPojo=null;
        List<AddressListBean> list=iAddressService.searchAddress(basicPojo);
        if(list!=null){
            outPutPojo=new OutPutPojo("0","申请成功",list);
        }else {
            outPutPojo=new OutPutPojo("4","该用户尚未录入地址",null);
        }
        return outPutPojo;
    }
}

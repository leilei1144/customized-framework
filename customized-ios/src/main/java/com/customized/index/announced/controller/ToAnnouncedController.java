package com.customized.index.announced.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.customized.announced.pojo.AnnouncedBean;
import com.customized.announced.pojo.AnnouncedParamBean;
import com.customized.announced.service.IAnnouncedService;
import com.customized.basic.OutPutPojo;
import com.customized.config.Constants;
import com.customized.goods.pojo.GoodsListBean;
import com.customized.goods.servive.IGoodsListService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by grant on 16/9/12.
 */
@Api(value = "往期揭晓")
@Controller
public class ToAnnouncedController {

    @Reference(version = "0.0.1")
    public IAnnouncedService announcedService;

    @ApiOperation(value = "往期揭晓")
    @RequestMapping(value = "/app/v1/queryAnnounced" , method = RequestMethod.POST)
    @ResponseBody
    public OutPutPojo queryAnnounced(AnnouncedParamBean announcedParamBean){
        OutPutPojo outPutPojo = null;
        List<AnnouncedBean> announcedList = announcedService.queryAnnounced(announcedParamBean);
        if (announcedList != null && announcedList.size() > 0){
            outPutPojo = new OutPutPojo(Constants.IS_OK_STATE , Constants.IS_OK , announcedList);
        }else {
            outPutPojo = new OutPutPojo(Constants.IS_ERROR_STATE , Constants.IS_ERROR , announcedList);
        }
        return outPutPojo;
    }
}
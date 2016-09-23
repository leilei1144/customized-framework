package com.customized.index.banner.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.customized.Banner.pojo.BannerBean;
import com.customized.banner.service.IBannerSerice;
import com.customized.basic.OutPutPojo;
import com.customized.config.Constants;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by grant on 16/9/8.
 */
@Api(value = "获取banner方法")
@Controller
public class BannerController {

    @Reference(version = "0.0.1")
    public IBannerSerice bannerSerice;

    @ApiOperation(value = "获取banner的最终链接")
    @ResponseBody
    @RequestMapping(value = "/app/v1/queryBanner" , method = RequestMethod.POST)
    public OutPutPojo queryBanner(BannerBean bannerBean){
        List<BannerBean> bannerList = bannerSerice.queryBanner(bannerBean.getPageSize());
        OutPutPojo outPutPojo = null;
        if (null != bannerList && bannerList.size() > 0){
            outPutPojo = new OutPutPojo(Constants.IS_OK_STATE, Constants.IS_OK,bannerList);
        }else {
            outPutPojo = new OutPutPojo(Constants.IS_ERROR_STATE, Constants.IS_ERROR,null);
        }
        return outPutPojo;
    }


}

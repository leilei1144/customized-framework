package com.customized.banner.service.impl;

import com.customized.Banner.pojo.BannerBean;
import com.customized.banner.dao.IBannerDao;
import com.customized.banner.service.IBannerSerice;
import com.customized.support.dubbo.spring.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by grant on 16/9/8.
 */
@DubboService(version = "0.0.1" , interfaceClass = IBannerSerice.class)
public class BannerServiceImpl implements IBannerSerice {

    @Autowired
    public IBannerDao bannerDao;

    @Override
    public List<BannerBean> queryBanner(int pageSize) {
        List<BannerBean> lb = bannerDao.queryBanner(pageSize);
        return lb;
    }


}

package com.customized.banner.service;

import com.customized.Banner.pojo.BannerBean;

import java.util.List;

/**
 * Created by grant on 16/9/8.
 */
public interface IBannerSerice {
    public List<BannerBean> queryBanner(int pageSize);
}

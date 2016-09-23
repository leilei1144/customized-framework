package com.customized.banner.dao;

import java.util.List;

import com.customized.Banner.pojo.BannerBean;
import org.springframework.stereotype.Repository;

import com.customized.Horn.pojo.HornBean;

@Repository
public interface IBannerDao {
	List<BannerBean> queryBanner(int pageSize);
}

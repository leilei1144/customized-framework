package com.customized.announced.dao;

import java.util.List;

import com.customized.Banner.pojo.BannerBean;
import com.customized.announced.pojo.AnnouncedBean;
import com.customized.announced.pojo.AnnouncedParamBean;
import org.springframework.stereotype.Repository;

import com.customized.Horn.pojo.HornBean;

@Repository
public interface IAnnouncedDao {
	List<AnnouncedBean> queryAnnounced(AnnouncedParamBean announcedParamBean);
}

package com.customized.announced.service;

import com.customized.announced.pojo.AnnouncedBean;
import com.customized.announced.pojo.AnnouncedParamBean;

import java.util.List;

/**
 * Created by grant on 16/9/18.
 */
public interface IAnnouncedService {

    public List<AnnouncedBean> queryAnnounced(AnnouncedParamBean announcedParamBean);
}

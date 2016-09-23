package com.customized.announced.service.impl;

import com.customized.announced.dao.IAnnouncedDao;
import com.customized.announced.pojo.AnnouncedBean;
import com.customized.announced.pojo.AnnouncedParamBean;
import com.customized.announced.service.IAnnouncedService;
import com.customized.support.dubbo.spring.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by grant on 16/9/18.
 */
@DubboService(version = "0.0.1" , interfaceClass = IAnnouncedService.class)
public class AnnouncedServiceImpl implements IAnnouncedService {

    @Autowired
    public IAnnouncedDao announcedDao;

    @Override
    public List<AnnouncedBean> queryAnnounced(AnnouncedParamBean announcedParamBean) {
        return announcedDao.queryAnnounced(announcedParamBean);
    }
}

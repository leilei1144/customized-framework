package com.customized.address.service.impl;

import com.customized.address.dao.IAddressDao;
import com.customized.address.pojo.AddressListBean;
import com.customized.address.service.IAddressService;
import com.customized.basic.BasicPojo;
import com.customized.support.dubbo.spring.annotation.DubboService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Administrator on 2016/9/20.
 */
@DubboService(version = "0.0.1", interfaceClass = IAddressService.class)
public class AddressServiceImpl implements IAddressService {
    private static Logger logger = LoggerFactory.getLogger(AddressServiceImpl.class);

    @Autowired
    private IAddressDao iAddressDao;

    @Override
    public List<AddressListBean> searchAddress(BasicPojo basicPojo) {
        List<AddressListBean> list=iAddressDao.searchAddress(basicPojo.getUserID());
        if(list!=null&&list.size()>0){
            return list;
        }
        return null;
    }
}

package com.customized.address.service;

import com.customized.address.pojo.AddressListBean;
import com.customized.basic.BasicPojo;

import java.util.List;

/**
 * Created by Administrator on 2016/9/20.
 */
public interface IAddressService {
    public List<AddressListBean> searchAddress(BasicPojo basicPojo);
}

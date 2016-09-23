package com.customized.address.dao;

import com.customized.address.pojo.AddressListBean;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2016/9/20.
 */
@Repository
public interface IAddressDao {
    List<AddressListBean> searchAddress(String userID);
}

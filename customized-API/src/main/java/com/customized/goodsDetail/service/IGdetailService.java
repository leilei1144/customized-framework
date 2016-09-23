package com.customized.goodsDetail.service;


import com.customized.basic.OutPutPojo;
import com.customized.goodsDetail.pojo.GoodsDetailParamPojo;

import java.util.List;

public interface IGdetailService {
    public List getDetail(GoodsDetailParamPojo goodsDetailParamPojo);
}

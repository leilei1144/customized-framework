package com.customized.goods.servive;

import com.customized.goods.pojo.GoodsListBean;

import java.util.List;

/**
 * Created by grant on 16/9/9.
 */
public interface IGoodsListService {
    public List<GoodsListBean> queryGoodsList(GoodsListBean goodsListBean);
}

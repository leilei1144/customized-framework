package com.customized.goods.dao;

import com.customized.goods.pojo.GoodsListBean;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by grant on 16/9/9.
 */
@Repository
public interface IGoodsListDao {
    public List<GoodsListBean> queryGoodsList(GoodsListBean goodsListBean);
}

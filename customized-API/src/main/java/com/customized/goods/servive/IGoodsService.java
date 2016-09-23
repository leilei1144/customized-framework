package com.customized.goods.servive;

import com.customized.goods.pojo.GoodsBean;
import com.github.pagehelper.PageInfo;

public interface IGoodsService {

	public PageInfo<GoodsBean> findGoods(GoodsBean goodsBean, int pageNum, int pageSize) ;
	
}

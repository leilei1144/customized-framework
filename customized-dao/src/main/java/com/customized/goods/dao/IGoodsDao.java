package com.customized.goods.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.customized.goods.pojo.GoodsBean;

@Repository
public interface IGoodsDao {
	List<GoodsBean> findGoods(GoodsBean gBean);
}

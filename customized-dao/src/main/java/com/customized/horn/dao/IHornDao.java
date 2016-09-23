package com.customized.horn.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.customized.Horn.pojo.HornBean;

@Repository
public interface IHornDao {
	List<HornBean> getHorns(int pageSize);
}

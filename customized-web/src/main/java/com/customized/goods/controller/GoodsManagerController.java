package com.customized.goods.controller;

import io.swagger.annotations.Api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.alibaba.dubbo.config.annotation.Reference;
import com.customized.goods.pojo.GoodsBean;
import com.customized.goods.servive.IGoodsService;
import com.github.pagehelper.PageInfo;


/**
 * 
 * @author chenmf
 * @date   2016-08-29
 * @version 1.0
 * @description 商品管理
 *
 */
@Api
@Controller
public class GoodsManagerController {
	private static Logger logger = LoggerFactory.getLogger(GoodsManagerController.class);
	
	@Reference(version="0.0.1")
	private IGoodsService gService;
	/**
	 * 商品管理列表模块 更改返回参数 
	 */
	@RequestMapping(value="/goodsList", method=RequestMethod.POST)
	public String searchGoods(GoodsBean gBean,@RequestParam(required = false, defaultValue = "1") int pageNum,@RequestParam(required = false, defaultValue = "20") int pageSize,Model model){
		PageInfo<GoodsBean> pageinfo =gService.findGoods(gBean,pageNum,pageSize);
		model.addAttribute("goods",pageinfo.getList());
		model.addAttribute("pageinfo",pageinfo);
		return "goods/index";
	}
}

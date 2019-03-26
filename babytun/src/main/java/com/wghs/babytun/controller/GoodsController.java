package com.wghs.babytun.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wghs.babytun.config.GoodsConfig;
import com.wghs.babytun.entity.Goods;
import com.wghs.babytun.service.GoodsCoverService;
import com.wghs.babytun.service.GoodsDetailService;
import com.wghs.babytun.service.GoodsParamService;
import com.wghs.babytun.service.GoodsService;

@Controller
@PropertySource(value="classpath:/config/aaa.properties",encoding="utf-8",ignoreResourceNotFound=true)
public class GoodsController {
	Logger logger = LoggerFactory.getLogger(GoodsController.class);
	@Resource
	private GoodsService goodsService;
	@Resource
	private GoodsCoverService goodsCoverService;
	@Resource
	private GoodsDetailService goodsDetailService;
	@Resource
	private GoodsParamService goodsParamService;
	
	@Resource
	private Goods goods;
	@Resource
	private GoodsConfig goodsConfig;
	
	@Value("${name}")
	private String name;
	
	@Value("${age}")
	private Integer age;
	
	@GetMapping("/goods")
	public ModelAndView findGoodsById(Long gid) {
		//logger.info("gid:" + gid);
		logger.info("新建对象Goods:"+goods);
		logger.info("新建对象Goods1:"+goodsConfig.newGoods());
		logger.info("判断相等性:"+(goodsConfig.newGoods() == goods));
		logger.info("name:"+name+"   age:"+age);
		ModelAndView mav = new ModelAndView("goods");
		Goods goods = goodsService.findGoodsById(gid);
		mav.addObject("goods", goods);
		mav.addObject("covers", goodsCoverService.findGoodsCoverById(gid));
		mav.addObject("details", goodsDetailService.findGoodsDetailById(gid));
		mav.addObject("params", goodsParamService.findGoodsParamById(gid));

		return mav;
	}
}

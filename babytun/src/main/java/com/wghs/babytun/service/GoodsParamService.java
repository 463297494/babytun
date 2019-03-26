package com.wghs.babytun.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wghs.babytun.dao.GoodsParamDao;
import com.wghs.babytun.entity.GoodsParam;

@Service
public class GoodsParamService {

	@Resource
	private GoodsParamDao goodsParamDao;

	public List<GoodsParam> findGoodsParamById(Long goodsId) {
		return goodsParamDao.findGoodsParamById(goodsId);
	}

}

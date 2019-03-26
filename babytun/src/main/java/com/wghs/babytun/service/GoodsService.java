package com.wghs.babytun.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wghs.babytun.dao.GoodsDao;
import com.wghs.babytun.entity.Goods;

@Service
public class GoodsService {

	@Resource
	private GoodsDao goodsDao;

	public Goods findGoodsById(Long goodsId) {
		return goodsDao.findGoodsById(goodsId);
	}
}

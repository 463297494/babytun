package com.wghs.babytun.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wghs.babytun.dao.GoodsDetailDao;
import com.wghs.babytun.entity.GoodsDetail;

@Service
public class GoodsDetailService {
	
	@Resource
	private GoodsDetailDao goodsDetailDao;
	
	public List<GoodsDetail> findGoodsDetailById(Long goodsId){
		return  goodsDetailDao.findGoodsDetailById(goodsId);
	}
}

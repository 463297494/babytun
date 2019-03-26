package com.wghs.babytun.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wghs.babytun.dao.GoodsCoverDao;
import com.wghs.babytun.entity.GoodsCover;

@Service
public class GoodsCoverService {
	
	@Resource
	private GoodsCoverDao goodsCoverDao;
	
	public List<GoodsCover> findGoodsCoverById(Long goodsId){
		return goodsCoverDao.findGoodsCoverById(goodsId);
	}
}

package com.wghs.babytun.dao;

import java.util.List;

import com.wghs.babytun.entity.GoodsParam;

public interface GoodsParamDao {
	public List<GoodsParam> findGoodsParamById(Long goodsId);
}

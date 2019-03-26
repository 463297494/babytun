package com.wghs.babytun.dao;

import java.util.List;

import com.wghs.babytun.entity.GoodsDetail;

public interface GoodsDetailDao {
	public List<GoodsDetail> findGoodsDetailById(Long goodsId);
}

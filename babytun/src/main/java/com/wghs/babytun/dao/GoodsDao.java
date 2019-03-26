package com.wghs.babytun.dao;

import com.wghs.babytun.entity.Goods;

public interface GoodsDao {
	
	public Goods findGoodsById(Long goodsId);
}

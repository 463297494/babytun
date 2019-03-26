package com.wghs.babytun.dao;

import java.util.List;

import com.wghs.babytun.entity.GoodsCover;

public interface GoodsCoverDao {
	public List<GoodsCover> findGoodsCoverById(Long goodsId);
}

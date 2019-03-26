package com.wghs.babytun.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.wghs.babytun.entity.Goods;
import com.wghs.babytun.entity.Test;

@Component
public class GoodsConfig {
	
	
	@Bean
	public Test getTest(Goods goods){
		Test t = new Test();
		System.out.println("初始化Test11:"+goods);
		t.setG(goods);
		return t;
	}
	
	@Bean
	public Goods newGoods(){
		Goods goods = new Goods();
		goods.setGoodsId(250l);
		goods.setTitle("王国华");
		goods.setCurrentPrice(250f);
		return goods;
	}
}

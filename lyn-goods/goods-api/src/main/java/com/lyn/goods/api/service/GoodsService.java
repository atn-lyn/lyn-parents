package com.lyn.goods.api.service;

import com.lyn.goods.api.entity.GoodsInfo;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;

public interface GoodsService {

    String test(String name);

    GoodsInfo findGoodsInfoByPrimary(int goodsId) throws Exception;
}

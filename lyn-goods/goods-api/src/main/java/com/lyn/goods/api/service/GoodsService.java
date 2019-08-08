package com.lyn.goods.api.service;

import com.lyn.goods.api.entity.GoodsInfo;
import com.lyn.goods.api.entity.GoodsSpecs;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

public interface GoodsService {

    String test(String name);

    GoodsInfo findGoodsInfoByPrimary(long goodsId) throws Exception;

    GoodsSpecs findGoodsSpecsByPrimary(int specsId) throws Exception;

    int addGoodsInfo(GoodsInfo goodsInfo) throws Exception;

    List<GoodsInfo> findList(GoodsInfo goodsInfo) throws Exception;
}

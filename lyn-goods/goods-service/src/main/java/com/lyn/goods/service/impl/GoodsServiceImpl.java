package com.lyn.goods.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSONObject;
import com.lyn.common.cache.CacheService;
import com.lyn.goods.api.constants.GoodsConstant;
import com.lyn.goods.api.entity.GoodsInfo;
import com.lyn.goods.api.service.GoodsService;
import com.lyn.goods.service.mapper.GoodsInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@Service(version = "1.0.0",timeout = 10000,interfaceClass = GoodsService.class)
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsInfoMapper goodsInfoMapper;

    @Autowired
    private CacheService cacheService;

    @Override
    public String test(String name) {
        return "Hello,"+name+",this is a messgae from the goods module";
    }

    @Override
    public GoodsInfo findGoodsInfoByPrimary(int goodsId) throws Exception {
        return goodsInfoMapper.selectByPrimaryKey(goodsId);
    }

    @KafkaListener(topics = {GoodsConstant.KAFKA_STATISTICS_GOODS_BYID})
    public void statisticsGoodsById(String goodsId) throws Exception {
        Integer total = (Integer) cacheService.getCacheByKey(GoodsConstant.KAFKA_STATISTICS_GOODS_BYID+":"+goodsId);
        if(null != total){
            total = total+1;
            cacheService.removeKey(GoodsConstant.KAFKA_STATISTICS_GOODS_BYID+":"+goodsId);
        }else {
            total = 1;
        }
        cacheService.setCacheToRedis(GoodsConstant.KAFKA_STATISTICS_GOODS_BYID+":"+goodsId,total);
    }
}


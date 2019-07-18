package com.lyn.goods.service.mapper;

import com.lyn.goods.api.entity.GoodsAttributeKey;
import com.lyn.goods.api.entity.GoodsAttributeKeyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsAttributeKeyMapper {
    long countByExample(GoodsAttributeKeyExample example);

    int deleteByExample(GoodsAttributeKeyExample example);

    int deleteByPrimaryKey(Integer attributeId);

    int insert(GoodsAttributeKey record);

    int insertSelective(GoodsAttributeKey record);

    List<GoodsAttributeKey> selectByExample(GoodsAttributeKeyExample example);

    GoodsAttributeKey selectByPrimaryKey(Integer attributeId);

    int updateByExampleSelective(@Param("record") GoodsAttributeKey record, @Param("example") GoodsAttributeKeyExample example);

    int updateByExample(@Param("record") GoodsAttributeKey record, @Param("example") GoodsAttributeKeyExample example);

    int updateByPrimaryKeySelective(GoodsAttributeKey record);

    int updateByPrimaryKey(GoodsAttributeKey record);
}
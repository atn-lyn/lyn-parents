package com.lyn.goods.service.mapper;

import com.lyn.goods.api.entity.GoodsAttributeValue;
import com.lyn.goods.api.entity.GoodsAttributeValueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsAttributeValueMapper {
    long countByExample(GoodsAttributeValueExample example);

    int deleteByExample(GoodsAttributeValueExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GoodsAttributeValue record);

    int insertSelective(GoodsAttributeValue record);

    List<GoodsAttributeValue> selectByExample(GoodsAttributeValueExample example);

    GoodsAttributeValue selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GoodsAttributeValue record, @Param("example") GoodsAttributeValueExample example);

    int updateByExample(@Param("record") GoodsAttributeValue record, @Param("example") GoodsAttributeValueExample example);

    int updateByPrimaryKeySelective(GoodsAttributeValue record);

    int updateByPrimaryKey(GoodsAttributeValue record);
}
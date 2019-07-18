package com.lyn.goods.service.mapper;

import com.lyn.goods.api.entity.GoodsBrand;
import com.lyn.goods.api.entity.GoodsBrandExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsBrandMapper {
    long countByExample(GoodsBrandExample example);

    int deleteByExample(GoodsBrandExample example);

    int deleteByPrimaryKey(Integer brandId);

    int insert(GoodsBrand record);

    int insertSelective(GoodsBrand record);

    List<GoodsBrand> selectByExample(GoodsBrandExample example);

    GoodsBrand selectByPrimaryKey(Integer brandId);

    int updateByExampleSelective(@Param("record") GoodsBrand record, @Param("example") GoodsBrandExample example);

    int updateByExample(@Param("record") GoodsBrand record, @Param("example") GoodsBrandExample example);

    int updateByPrimaryKeySelective(GoodsBrand record);

    int updateByPrimaryKey(GoodsBrand record);
}
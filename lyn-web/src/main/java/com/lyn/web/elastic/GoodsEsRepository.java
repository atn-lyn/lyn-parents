package com.lyn.web.elastic;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

@Component
public interface GoodsEsRepository extends ElasticsearchRepository<GoodsVo,Long> {
}
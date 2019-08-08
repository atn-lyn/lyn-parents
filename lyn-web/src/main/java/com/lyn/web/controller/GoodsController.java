package com.lyn.web.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Lists;
import com.lyn.common.cache.CacheService;
import com.lyn.common.exception.DescribeException;
import com.lyn.common.exception.ExceptionEnum;
import com.lyn.common.utils.FileUtils;
import com.lyn.common.utils.RequestStr;
import com.lyn.common.utils.ResultUtils;
import com.lyn.goods.api.constants.GoodsConstant;
import com.lyn.goods.api.entity.GoodsInfo;
import com.lyn.goods.api.service.GoodsService;
import com.lyn.sys.api.entity.UserInfo;
import com.lyn.web.constants.WebConstant;
import com.lyn.web.elastic.GoodsEsRepository;
import com.lyn.web.elastic.GoodsVo;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.sort.SortBuilders;
import org.elasticsearch.search.sort.SortOrder;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.web.PageableDefault;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Random;

import static com.sun.tools.doclets.formats.html.markup.HtmlStyle.title;

/**
 * <p>请添加描述信息</p>
 *
 * @author lft
 * @version 1.0
 * @date 2019/6/14 0014
 * @since jdk1.8
 */
@Controller
@RestController
@RequestMapping("/api/goods/")
public class GoodsController {

    @Reference(version = "1.0.0")
    private GoodsService goodsService;

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    private CacheService cacheService;

    @Autowired
    private GoodsEsRepository goodsEsRepository;

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public Object addGoodsIfo(HttpServletRequest request) throws Exception {
        UserInfo loginUser = (UserInfo) request.getAttribute(WebConstant.LOGIN_SESSION);
        String requestStr = RequestStr.getRequestStr(request);
        JSONObject jsonObj = JSONObject.parseObject(requestStr);
        if(StringUtils.isEmpty(jsonObj.getString("goodsName"))
                || StringUtils.isEmpty(jsonObj.getString("goodsCover"))
                || StringUtils.isEmpty(jsonObj.getString("goodsDetail"))){
            throw new DescribeException(ExceptionEnum.PARAM_ERROR);
        }
        GoodsInfo goodsInfo = new GoodsInfo();
        goodsInfo.setGoodsName(jsonObj.getString("goodsName"));
        goodsInfo.setGoodsImg(FileUtils.toShortUrl(jsonObj.getString("goodsCover")));
        goodsInfo.setGoodsDetail(FileUtils.toShortUrl(jsonObj.getString("goodsDetail")));
        goodsService.addGoodsInfo(goodsInfo);
        return ResultUtils.success("ok");
    }

    @RequestMapping(value = "detail", method = RequestMethod.POST)
    public Object detail(HttpServletRequest request) throws Exception {
        String requestStr = RequestStr.getRequestStr(request);
        JSONObject jsonObj = JSONObject.parseObject(requestStr);
        if(StringUtils.isEmpty(jsonObj.getString("goodsId"))){
            throw new DescribeException(ExceptionEnum.PARAM_ERROR);
        }
        int goodsId = jsonObj.getInteger("goodsId");
        if(goodsId <= 0){
            //当id小于等于0时,我们认为是异常操作
            throw new DescribeException(ExceptionEnum.OPERATE_ERROR);
        }
        GoodsInfo goods = (GoodsInfo) cacheService.getCacheByKey("lyn_goods:"+goodsId);
        if(null == goods){
            String key = "lyn_goods_detail_lock";
            if(cacheService.lock(key,"0")) {
                goods = this.getGoodsInfo(goodsId);
                cacheService.unLock(key);
            } else {
                goods = this.getGoodsInfo(goodsId);
            }
        }
        kafkaTemplate.send(GoodsConstant.KAFKA_STATISTICS_GOODS_BYID,String.valueOf(goodsId));
        return ResultUtils.success(goods);
    }

    /**
     * 获取商品信息
     * @param goodsId
     * @return
     * @throws Exception
     */
    private GoodsInfo getGoodsInfo(int goodsId) throws Exception{
        GoodsInfo goods = goodsService.findGoodsInfoByPrimary(goodsId);
        if (goods != null) {
            goods.setGoodsImg(StringUtils.isEmpty(goods.getGoodsImg())?null: FileUtils.toFullUrl(goods.getGoodsImg()));
            Random random = new Random();
            if (goods.getIsHotSell()) {
                //热门商品
                long expire = 3600 + random.nextInt(3600);
                cacheService.setCacheToRedis("lyn_goods:" + goodsId, goods, expire);
            } else {
                //冷门商品
                long expire = 600 + random.nextInt(600);
                cacheService.setCacheToRedis("lyn_goods:" + goodsId, goods, expire);
            }
        } else {
            cacheService.setCacheToRedis("lyn_goods:" + goodsId, goods, 60);
        }
        return goods;
    }

    @RequestMapping(value = "save", method = RequestMethod.GET)
    public Object save(HttpServletRequest request) throws Exception {
        GoodsInfo goodsInfo = new GoodsInfo();
        List<GoodsInfo> list = goodsService.findList(goodsInfo);
        if(list != null && list.size() > 0){
            for (GoodsInfo goodsInfo1:list){
                GoodsVo goodsVo = new GoodsVo();
                BeanUtils.copyProperties(goodsInfo1,goodsVo);
                goodsEsRepository.save(goodsVo);
                //System.out.println("同步数据到es:"+goodsInfo1.toString());
            }
        }
        return ResultUtils.success("ok");
    }

    @RequestMapping(value = "search", method = RequestMethod.GET)
    public Object search(String title ,@PageableDefault() Pageable pag) throws Exception {
        NativeSearchQueryBuilder baseBuilder = new NativeSearchQueryBuilder();
        //创建布尔查询器实现多条件搜索
        BoolQueryBuilder boolBuilder = QueryBuilders.boolQuery();
        //状态为1的所有信息
        boolBuilder.filter(QueryBuilders.termQuery("status", 1));
        //添加排序
        baseBuilder.withSort(SortBuilders.fieldSort("createTime").order(SortOrder.DESC));
        //添加到基础查询器
        baseBuilder.withFilter(boolBuilder);
        //分页查询
        Page<GoodsVo> listIt =  goodsEsRepository.search(baseBuilder.build());
        return ResultUtils.success(listIt);
    }
}

package com.lyn.common.cache;

import java.util.List;
import java.util.Set;

/**
 * <p>请添加描述信息</p>
 *
 * @author lft
 * @version 1.0
 * @date 2019/6/13 0013
 * @since jdk1.8
 */
public interface CacheService {

    /**
     * <p>通过Key获取对象</p>
     *
     * @param key
     * @return
     */
    Object getCacheByKey(String key);

    /**
     * <p>缓存对象到Redis</p>
     *
     * @param key
     * @param value
     */
    void setCacheToRedis(String key, Object value);

    /**
     * <p>缓存对象到Redis,并带有有效期</p>
     *
     * @param key
     * @param value
     * @param time
     */
    void setCacheToRedis(String key, Object value, long time);

    /**
     * <p>缓存List到Redis</p>
     *
     * @param key
     * @param os
     */
    <T> void setList(String key, List<T> os);

    /**
     * <p>缓存List到Redis，带有效期</p>
     *
     * @param key
     * @param os
     * @param time
     */
    <T> void setList(String key, List<T> os, long time);

    /**
     * <p>获取Redis中的List</p>
     *
     * @param key
     * @return
     */
    <T> List<T> getList(String key);

    /**
     * <p>Key是否存在</p>
     *
     * @param key
     * @return
     */
    boolean isExistKey(String key);

    /**
     * <p>从Redis中移除Key</p>
     *
     * @param key
     */
    void removeKey(String key);

    /**
     * <p>锁是否存在</p>
     *
     * @param key
     * @return
     */
    boolean isExistLock(String key);

    /**
     * <p>添加锁</p>
     *
     * @param key
     * @param value
     * @return
     */
    boolean lock(String key, String value);

    /**
     * <p>解锁</p>
     *
     * @param key
     * @param key
     */
    void unLock(String key);

    /**
     * 获取匹配前缀的redis key值,以set返回
     *
     * @param prefix
     * @return
     */
    Set<String> getMatchPrefixKey(String prefix);

    /**
     * 获取redis某个key的有效值
     *
     * @param key
     * @return
     */
    Long getExpire(String key);
}

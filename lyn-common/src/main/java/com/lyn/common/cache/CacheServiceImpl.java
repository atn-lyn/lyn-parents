package com.lyn.common.cache;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.*;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * <p>请添加描述信息</p>
 *
 * @author lft
 * @version 1.0
 * @date 2019/6/13 0013
 * @since jdk1.8
 */
@Service("cacheService")
public class CacheServiceImpl implements CacheService {

    private static Logger logger = LoggerFactory.getLogger(CacheServiceImpl.class);
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Override
    public Object getCacheByKey(String key) {
        ValueOperations<String, Object> valueOperations = redisTemplate.opsForValue();
        return valueOperations.get(key);
    }

    @Override
    public void setCacheToRedis(String key, Object value) {
        ValueOperations<String, Object> valueOperations = redisTemplate.opsForValue();
        valueOperations.set(key, value);
    }

    @Override
    public void setCacheToRedis(String key, Object value, long time) {
        ValueOperations<String, Object> valueOperations = redisTemplate.opsForValue();
        if (time > 0) {
            valueOperations.set(key, value, time, TimeUnit.SECONDS);
        } else {
            valueOperations.set(key, value);
        }
    }

    @Override
    public <T> void setList(String key, List<T> os) {
        ListOperations<String, Object> listOperations = redisTemplate.opsForList();
        for (Object o : os) {
            listOperations.rightPush(key, o);
        }
    }

    @Override
    public <T> void setList(String key, List<T> os, long time) {
        if (time > 0) {
            ListOperations<String, Object> listOperations = redisTemplate.opsForList();
            for (Object o : os) {
                listOperations.rightPush(key, o);
                redisTemplate.expire(key, time, TimeUnit.SECONDS);
            }
        }
    }

    @Override
    public <T> List<T> getList(String key) {
        ListOperations<String, Object> listOperations = redisTemplate.opsForList();
        List<T> o = null;
        if (listOperations.size(key) > 0) {
            o = (List<T>) listOperations.range(key, 0, -1);
        }
        return o;
    }

    @Override
    public boolean isExistKey(String key) {
        if (!StringUtils.isEmpty(key)) {
            return redisTemplate.hasKey(key);
        }
        return false;
    }

    @Override
    public void removeKey(String key) {
        redisTemplate.delete(key);
    }

    @Override
    public boolean isExistLock(String key) {
        boolean result = false;
        if (key != null && !"".equals(key)) {
            try {
                result = stringRedisTemplate.hasKey(key);
            } catch (Exception e) {
                result = true;
            }
        }
        return result;
    }

    @Override
    public boolean lock(String key, String value) {
        boolean result = false;
        try {
            boolean bool = stringRedisTemplate.opsForValue().setIfAbsent(key, value);
            if (bool) {
                //锁有效期60秒
                stringRedisTemplate.expire(key, 60, TimeUnit.SECONDS);
            }
            return bool;
        } catch (Exception e) {
            logger.error("Redis加锁异常！");
        }
        return result;
    }

    @Override
    public void unLock(String key) {
        try {
            stringRedisTemplate.delete(key);
        } catch (Exception e) {
            logger.error("Redis解锁异常！");
        }
    }

    @Override
    public Set<String> getMatchPrefixKey(String prefix) {
        if (!StringUtils.isEmpty(prefix)) {
            Set<String> keys = stringRedisTemplate.keys(prefix + "*");
            if (keys == null || keys.size() == 0) {
                return null;
            }
            return keys;
        }
        return null;
    }

    @Override
    public Long getExpire(String key) {
        return redisTemplate.getExpire(key);
    }
}

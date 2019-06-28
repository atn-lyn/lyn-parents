package com.lyn.common.lock;

import org.redisson.Redisson;
import org.redisson.api.RLock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

/**
 * <p>Redisson的使用</p>
 *
 * @author lft
 * @version 1.0
 * @date 2019/6/28 0028
 * @since jdk1.8
 */
public class DistributedRedisLock {

    private static Logger logger = LoggerFactory.getLogger(DistributedRedisLock.class);
    private static Redisson redisson = RedissonManager.getInstance();
    private static final String LOCK_TITLE = "redis_lock_";
    //加锁
    public static boolean lockup(String lockName){
        //声明key对象
        String key = LOCK_TITLE + lockName;
        //获取锁对象
        RLock mylock = redisson.getLock(key);
        //设置过期时间，防止死锁
        mylock.lock(60, TimeUnit.SECONDS);
        logger.info("======lock======"+Thread.currentThread().getName());
        return true;
    }
    //锁的释放
    public static void release(String lockName){
        String key = LOCK_TITLE + lockName;
        RLock mylock = redisson.getLock(key);
        //释放锁（解锁）
        mylock.unlock();
        logger.info("======unlock======"+Thread.currentThread().getName());
    }
}

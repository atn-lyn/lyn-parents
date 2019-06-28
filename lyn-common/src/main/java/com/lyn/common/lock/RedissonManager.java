package com.lyn.common.lock;

import org.redisson.Redisson;
import org.redisson.config.Config;
import org.redisson.config.SingleServerConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ResourceBundle;

/**
 * <p>实例Redisson类</p>
 *
 * @author lft
 * @version 1.0
 * @date 2019/6/28 0028
 * @since jdk1.8
 */
@Component
public class RedissonManager {

    private static Logger logger = LoggerFactory.getLogger(RedissonManager.class);
    private static String REDIS_IP;
    private static String REDIS_PORT;
    private static String REDIS_PASSWD;
    private static String PROJECT_ENV;

    @Value("${spring.profiles.active}")
    public void setProjectEnv(String projectEnv) {
        PROJECT_ENV = projectEnv;
    }
    private static Config config = new Config();
    private static Redisson redisson = null;

    private static void init() {
        ResourceBundle properties = ResourceBundle.getBundle("application-"+PROJECT_ENV);
        REDIS_IP = properties.getString("spring.redis.host").trim();
        REDIS_PORT = properties.getString("spring.redis.port").trim();
        if(properties.containsKey("spring.redis.password")){
            REDIS_PASSWD = properties.getString("spring.redis.password");
        }
        SingleServerConfig singleServerConfig = config.useSingleServer();
        singleServerConfig.setAddress("redis://"+REDIS_IP+":"+REDIS_PORT);
        if(null != REDIS_PASSWD && !"".equals(REDIS_PASSWD)){
            singleServerConfig.setPassword(REDIS_PASSWD);
        }
        //得到redisson对象
        redisson = (Redisson) Redisson.create(config);
    }
    //实例化redisson
    public static Redisson getInstance(){
        init();
        return redisson;
    }
}

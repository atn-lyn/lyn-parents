package com.lyn.common.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.InetAddress;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * <p>雪花算法</p>
 *
 * @author lft
 * @version 1.0
 * @date 2019/6/21 0021
 * @since jdk1.8
 */
public class SnowFlakeUtils {

    private static Logger LOGGER = LoggerFactory.getLogger(SnowFlakeUtils.class);
    // 最近的时间戳
    private long lastTimestamp = 0L;
    // 0，并发控制
    private int sequence = 1;
    //本机IP
    private static String localIp;

    private static SnowFlakeUtils instance  = new SnowFlakeUtils();
    //实现单例模式
    public static SnowFlakeUtils getInstance(){
        localIp = getLocalIp();
        return instance;
    }

    /*
     * <p>生成编号，格式:时间（毫秒级）+本机IP+自增序列+两位随机码</p>
     * <p>时间 -- 从年份的后两位开始取值到毫秒</p>
     * <p>本机IP -- 取后两位IP的后两位，总共四位</p>
     * <p>自增序列 -- 当每毫秒有多次并发请求时，序列自增，最大999</p>
     */
    @SuppressWarnings("static-access")
    public synchronized String nextNo() {
        Date now = new Date();
        String time=  new SimpleDateFormat("yyMMddHHmmssSSS").format(now);
        long timestamp = now.getTime();
        if (this.lastTimestamp == timestamp) {
            this.sequence = this.sequence + 1;
            if (this.sequence == 0) {
                // 重新生成timestamp
                timestamp = this.tilNextMillis(this.lastTimestamp);
            }
        } else {
            this.sequence = 0;
        }
        this.lastTimestamp = timestamp;
        StringBuilder sb = new StringBuilder(time)
                .append("-"+getFourDigitLocalIp(localIp))
                .append("-"+(100+sequence));
        return sb.toString();
    }

    /**
     * <p>等待下一个毫秒的到来, 保证返回的毫秒数在参数lastTimestamp之后</p>
     *
     * @param lastTimestamp
     * @return
     */
    private static long tilNextMillis(long lastTimestamp) {
        long timestamp = System.currentTimeMillis();
        while (timestamp <= lastTimestamp) {
            timestamp = System.currentTimeMillis();
        }
        return timestamp;
    }

    /**
     * <p>获取四位Ip</p>
     *
     * @param localIp
     * @return
     */
    private static String getFourDigitLocalIp(String localIp){
        int firstNum = 0;
        int secondNum = 0;
        StringBuilder result = new StringBuilder();
        Random ra =new Random();
        if(localIp.indexOf(".") != -1){
            String[] arr = localIp.replace(".", ",").split(",");
            if(arr.length == 4){
                firstNum = Integer.parseInt(arr[2]);
                secondNum = Integer.parseInt(arr[3]);
            }
        }
        firstNum = 100+ (firstNum==0?10+ra.nextInt(89):firstNum);
        secondNum = 100+ (secondNum==0?10+ra.nextInt(89):secondNum);
        String str1 = (firstNum%100)<10?"0"+ String.valueOf(firstNum%100) : String.valueOf(firstNum%100);
        String str2 = (secondNum%100)<10?"0"+ String.valueOf(secondNum%100) : String.valueOf(secondNum%100);
        result.append(str1).append(str2);
        return result.toString();
    }
    /**
     * <p>获取IP地址</p>
     *
     * @return
     */
    @SuppressWarnings("static-access")
    private static String getLocalIp(){
        InetAddress ia=null;
        String localip = null;
        try {
            ia=ia.getLocalHost();
            localip=ia.getHostAddress();
        } catch (Exception e) {
            LOGGER.info("获取本地IP地址发生异常:"+e.getMessage());
            localip = "127.0.0.1";
        }
        LOGGER.info("【获取本地IP地址】 ip:"+localip);
        return localip;
    }

    public static void main(String[] args) {
        SnowFlakeUtils uu = SnowFlakeUtils.getInstance();
        for(int i = 0;i<30;i++){
            String sss = uu.nextNo();
            System.out.println("no : "+sss);
        }
    }
}

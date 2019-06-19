package com.lyn.common.message;

import java.io.InputStreamReader;
import java.util.Properties;

/**
 * <p>ClassName: MessageProperty.java </p>
 * <p>信息提示配置类</p>
 *
 * @author lft
 * @version 1.0
 * @date 2019年1月26日
 * @since jdk1.8
 */
public class MessageProperty {
    /**
     * 0000=操作成功
     * 1001=签名异常
     * 1002=参数异常
     * 1003=数据不存在
     * 1004=登录异常
     * 1005=无此权限
     * 1006=业务异常
     * 1007=操作异常
     * 1008=token异常
     * 1009=服务异常
     */
    public static final String SUCCESS_CODE = "0000";//操作成功
    public static final String ERROR_SIGN_CODE = "1001";//签名异常
    public static final String ERROR_PARAM_CODE = "1002";//参数异常
    public static final String ERROR_DATA_CODE = "1003";//数据异常
    public static final String ERROR_LOGIN_CODE = "1004";//登录异常
    public static final String ERROR_NO_ROLE_CODE = "1005";//无此权限
    public static final String ERROR_BUSINESS_CODE = "1006";//业务异常
    public static final String ERROR_OPERATE_CODE = "1007";//操作异常
    public static final String ERROR_TOKEN_CODE = "1008";//token异常
    public static final String ERROR_SERVICE_CODE = "1009";//服务异常

    public static final String FAILD_OPERATE_CODE = "5000";//操作失败
    public static final String ERROR_TIME_OUT_CODE = "5001";//请求超时
    public static final String ERROR_INCORRECT_REQ_CODE = "5002";//非法请求

    private static MessageProperty messageProperty = new MessageProperty();
    private static Properties properties = new Properties();

    static {
        try {
            properties.load(new InputStreamReader(
                    MessageProperty.class.getResourceAsStream("/config/message.properties"), "UTF-8"));
        } catch (Exception e) {
        }
    }

    /**
     * getInstance:创建单例模式的Configs文件读取类. <br/>
     *
     * @return
     * @since JDK 1.8
     */
    public static MessageProperty getInstance() {
        if (null == messageProperty) {
            messageProperty = new MessageProperty();
        }
        return messageProperty;
    }

    /**
     * getProperty:读取配置文件中的值，如果读取不到就返回"". <br/>
     *
     * @param key
     * @return
     * @since JDK 1.8
     */
    public static String getProperty(String key) {
        String result = null;
        if (properties.containsKey(key)) {
            result = properties.getProperty(key, "");
        }
        return result;
    }
}

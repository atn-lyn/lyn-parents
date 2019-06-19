package com.lyn.common.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * <p>特殊字符检测工具（防止传入非法字符和sql注入攻击）</p>
 *
 * @author lft
 * @version 1.0
 * @date 2019/6/15 0015
 * @since jdk1.8
 */
public class IllegalStrFilterUtils {

    private static final Logger Logger = LoggerFactory.getLogger(IllegalStrFilterUtils.class);
    private static final String REGX_STR = "!|！|@|◎|#|＃|(\\$)|￥|%|％|(\\^)|……|(\\&)|※|(\\*)|×|(\\()|（|(\\))|）|_|——|(\\+)|＋|(\\|)|§ ";

    /**
     * 对常见的sql注入攻击进行拦截
     *
     * @param sInput
     * @return
     */
    public static Boolean sqlStrFilter(String sInput) {
        if (sInput == null || sInput.trim().length() == 0) {
            return false;
        }
        sInput = sInput.toUpperCase();

        if (sInput.indexOf("DELETE") >= 0 || sInput.indexOf("ASCII") >= 0 || sInput.indexOf("UPDATE") >= 0 || sInput.indexOf("SELECT") >= 0
                || sInput.indexOf("'") >= 0 || sInput.indexOf("SUBSTR(") >= 0 || sInput.indexOf("COUNT(") >= 0 || sInput.indexOf(" OR ") >= 0
                || sInput.indexOf(" AND ") >= 0 || sInput.indexOf("DROP") >= 0 || sInput.indexOf("EXECUTE") >= 0 || sInput.indexOf("EXEC") >= 0
                || sInput.indexOf("TRUNCATE") >= 0 || sInput.indexOf("INTO") >= 0 || sInput.indexOf("DECLARE") >= 0 || sInput.indexOf("MASTER") >= 0) {
            Logger.error("该参数存在SQL注入风险：sInput=" + sInput);
            return false;
        }
        Logger.info("通过sql检测");
        return true;
    }

    /**
     * 对非法字符进行检测
     *
     * @param sInput
     * @return
     */
    public static Boolean isIllegalStr(String sInput) {
        if (sInput == null || sInput.trim().length() == 0) {
            return false;
        }
        sInput = sInput.trim();
        Pattern compile = Pattern.compile(REGX_STR, Pattern.CASE_INSENSITIVE);
        Matcher matcher = compile.matcher(sInput);
        Logger.info("通过字符串检测");
        return matcher.find();
    }

}

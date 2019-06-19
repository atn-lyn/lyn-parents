package com.lyn.common.utils;

import com.alibaba.fastjson.JSONObject;
import org.springframework.util.StringUtils;

import java.util.*;

/**
 * <p>签名工具类</p>
 *
 * @author lft
 * @version 1.0
 * @date 2019/6/12 0019
 * @since jdk1.8
 */
public class SignUtils {


    /**
     * 生成一个撒盐的签名
     *
     * @param params
     * @return
     */
    public static String generateSign(String params) {
        Random r = new Random();
        StringBuilder sb = new StringBuilder(16);
        sb.append(r.nextInt(99999999)).append(r.nextInt(99999999));
        int len = sb.length();
        if (len < 16) {
            for (int i = 0; i < 16 - len; i++) {
                sb.append("0");
            }
        }
        String salt = sb.toString();
        String paramsStr = getSignParamsStr(params,"sign");
        params = MD5Utils.string2MD5(paramsStr);
        char[] cs = new char[48];
        for (int i = 0; i < 48; i += 3) {
            cs[i] = params.charAt(i / 3 * 2);
            char c = salt.charAt(i / 3);
            cs[i + 1] = c;
            cs[i + 2] = params.charAt(i / 3 * 2 + 1);
        }
        return new String(cs);
    }

    /**
     * 验证签名
     *
     * @param params
     * @return
     */
    public static boolean checkSign(String params) {
        JSONObject jsonObj = JSONObject.parseObject(params);
        String sign = jsonObj.getString("sign");
        if(StringUtils.isEmpty(sign)){
            return false;
        }
        String strNoSign = getSignParamsStr(params,"sign");
        char[] cs1 = new char[32];
        char[] cs2 = new char[16];
        for (int i = 0; i < 48; i += 3) {
            cs1[i / 3 * 2] = sign.charAt(i);
            cs1[i / 3 * 2 + 1] = sign.charAt(i + 2);
            cs2[i / 3] = sign.charAt(i + 1);
        }
        String salt = new String(cs2);
        return MD5Utils.string2MD5(strNoSign).equals(new String(cs1));
    }

    /**
     * <p>获取签名字符串</p>
     *
     * @param
     * @param signField
     * @return
     * @throws Exception
     */
    public static String getSignParamsStr(String jsonStr, String signField) {
        JSONObject jsonObj = JSONObject.parseObject(jsonStr);
        try {
            jsonObj.remove(signField);
            List<String> lstr = new ArrayList<String>();
            Iterator<String> iterator = jsonObj.keySet().iterator();
            while (iterator.hasNext()) {
                lstr.add(iterator.next().toString());
            }
            // 调用数组的静态排序方法sort,且不区分大小写
            String[] toBeStored = lstr.toArray(new String[lstr.size()]);
            Arrays.sort(toBeStored, String.CASE_INSENSITIVE_ORDER);
            String signStr = "{";
            for (String istr : toBeStored) {
                signStr = signStr + istr + ":" + jsonObj.getString(istr);
            }
            //System.out.println("signStr0 = "+signStr);
            //竖杠不参与签名生成
            signStr = signStr.replaceAll("\\|", "");
            signStr = signStr + "}";
            signStr = signStr.replace("\n", "");
            signStr = signStr.replace("'", "");
            signStr = signStr.replace("\"", "");
            signStr = signStr.replace(",", "");
            signStr = signStr.replace(" ", "");
            signStr = signStr.replace("　", "");
            signStr = signStr.replace("[", "");
            signStr = signStr.replace("]", "");
            signStr = signStr.replace("	", "");
           // System.out.println("signStr = "+signStr);
            return signStr;
        } catch (Exception e) {
            throw e;
        }
    }

    public static void main(String[] args) {
        //String url = "http://192.168.99.27:6002/productApi/productDetail";
        SortedMap<String,String> params = new TreeMap<String,String>();
        params.put("id", "1");
        params.put("token", "5d528e29b5dd29fc212e993fa652ac41");
        String sign = generateSign(JSONObject.toJSONString(params));
        System.out.println("sign = "+sign);
        params.put("sign", sign);
        String reqParam = JSONObject.toJSONString(params);
        System.out.println("reqParam = "+reqParam);
        boolean b = checkSign(reqParam);
        //Thread t1 = new Thread();
        //t1.start();
        //发起请求 phone':'','password':'','type'
        System.out.println("b = "+b);
    }
}

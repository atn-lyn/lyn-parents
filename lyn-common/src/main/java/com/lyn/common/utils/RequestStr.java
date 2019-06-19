package com.lyn.common.utils;

import com.alibaba.fastjson.JSONObject;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * <p>ClassName: RequestStr.java </p>
 * <p>请求request请求体</p>
 *
 * @author lft
 * @version 1.0
 * @date 2019年1月24日
 * @since jdk1.8
 */
public class RequestStr {

    /**
     * <p>请求体数据流获取</p>
     *
     * @param request
     * @return
     */
    public static String getRequestStr(HttpServletRequest request) {
        BufferedReader in;
        try {
            Object requestStr = request.getAttribute("RequestStr");
            if (!StringUtils.isEmpty(requestStr)) {
                return requestStr.toString();
            }
            in = new BufferedReader(new InputStreamReader(request.getInputStream(), "UTF-8"));
            StringBuilder sb = new StringBuilder();
            String line = null;
            while ((line = in.readLine()) != null) {
                sb.append(line);
            }
            /*千万不可去除！！*/
            request.setAttribute("RequestStr", sb.toString());
            return sb.toString();
        } catch (IOException e) {
            return "";
        }
    }

    /**
     * 从Parameter中获取参数
     *
     * @param request
     * @return
     */
    @SuppressWarnings("rawtypes")
    public static String getParamJson(HttpServletRequest request) {
        Object requestStr = request.getAttribute("RequestStr");
        if (!StringUtils.isEmpty(requestStr)) {
            return requestStr.toString();
        }
        // 参数Map
        Map<String, String[]> properties = request.getParameterMap();
        Iterator entries = properties.entrySet().iterator();
        Entry entry;
        String name = "";
        while (entries.hasNext()) {
            entry = (Entry) entries.next();
            name = (String) entry.getKey();
            request.setAttribute("RequestStr", name);
        }
        return name;
    }

    /**
     * 从Parameter中获取参数
     *
     * @param request
     * @return
     */
    @SuppressWarnings("rawtypes")
    public static String getParameterMap(HttpServletRequest request) {
        Object requestStr = request.getAttribute("RequestParm");
        if (!StringUtils.isEmpty(requestStr)) {
            return requestStr.toString();
        }
        // 参数Map
        Map<String, String[]> properties = request.getParameterMap();
        // 返回值Map
        Map<String, String> returnMap = new HashMap<String, String>();
        Iterator entries = properties.entrySet().iterator();
        Entry entry;
        String name = "";
        String value = "";
        String results = "";
        while (entries.hasNext()) {
            entry = (Entry) entries.next();
            name = (String) entry.getKey();
            Object valueObj = entry.getValue();
            if (null == valueObj) {
                value = "";
            } else if (valueObj instanceof String[]) {
                String[] values = (String[]) valueObj;
                for (int i = 0; i < values.length; i++) {
                    value = values[i] + ",";
                }
                value = value.substring(0, value.length() - 1);
            } else {
                value = valueObj.toString();
            }
            returnMap.put(name, value);
            results = returnMap.toString().replace("{{", "{").replace("}}", "}");
            request.setAttribute("RequestParm", results);
            System.out.println("jsonStr = " + results);
        }
        return results;
    }

    /**
     * 从request中获取参数,遍历,并且转成json格式返回
     *
     * @param request
     * @return
     */
    public static String getParamJsonString(HttpServletRequest request) {
        Map<String, String[]> map = request.getParameterMap();
        Map<String, String> results = new HashMap<>();
        Set<Entry<String, String[]>> entrySet = map.entrySet();
        for (Entry<String, String[]> stringEntry : entrySet) {
            results.put(stringEntry.getKey(), stringEntry.getValue()[0]);
        }
        return JSONObject.toJSONString(results);
    }
}
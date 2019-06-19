package com.lyn.common.utils;

import com.lyn.common.exception.ExceptionEnum;
import com.lyn.common.message.Result;

/**
 * <p>响应返回数据封装</p>
 *
 * @author lft
 * @version 1.0
 * @date 2019/6/15 0015
 * @since jdk1.8
 */
public class ResultUtils {

    /**
     * 发生错误返回
     *
     * @param code
     * @param msg
     * @return
     */
    public static Result error(int code, String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setStatus(false);
        result.setMsg(msg);
        return result;
    }

    /**
     * 自定义异常返回
     *
     * @param exceptionEnum
     * @return
     */
    public static Result exception(ExceptionEnum exceptionEnum) {
        Result result = new Result();
        result.setCode(exceptionEnum.getCode());
        result.setStatus(false);
        result.setMsg(exceptionEnum.getMsg());
        return result;
    }

    /**
     * 业务成功返回
     *
     * @param data
     * @return
     */
    public static Result success(Object data) {
        Result result = success(data, null);
        result.setMsg("ok");
        return result;
    }

    public static Result success(Object data, String msg) {
        Result result = new Result();
        result.setCode(1000);
        result.setStatus(true);
        result.setMsg(msg);
        result.setData(data);
        return result;
    }

    public static Result fail(String msg) {
        Result result = new Result();
        result.setCode(1000);
        result.setStatus(false);
        result.setMsg(msg);
        return result;
    }
}

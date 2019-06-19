package com.lyn.common.message;

/**
 * <p>封装返回实体</p>
 *
 * @author lft
 * @version 1.0
 * @date 2019/6/15 0015
 * @since jdk1.8
 */
public class Result<T> {

    private int code;
    private boolean status;
    private String msg;
    private T data;

    public int getCode() {
        return code;
    }

    public boolean isStatus() {
        return status;
    }

    public String getMsg() {
        return msg;
    }

    public T getData() {
        return data;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "{\"code\":\"" + code + "\"," +
                " \"status\":\"" + status + "\", " +
                "\"msg\":\"" + msg + "\"," +
                " \"data\":\"" + data + "\"}";
    }
}

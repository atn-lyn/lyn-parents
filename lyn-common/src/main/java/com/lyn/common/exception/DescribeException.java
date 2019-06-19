package com.lyn.common.exception;

/**
 * <p>异常描述类</p>
 *
 * @author lft
 * @version 1.0
 * @date 2019/6/15 0015
 * @since jdk1.8
 */
public class DescribeException extends RuntimeException {

    private Integer code;

    /**
     * 继承exception，加入错误状态值
     * * @param exceptionEnum
     */
    public DescribeException(ExceptionEnum exceptionEnum) {
        super(exceptionEnum.getMsg());
        this.code = exceptionEnum.getCode();
    }

    /**
     * 自定义错误信息
     *
     * @param message
     * @param code
     */
    public DescribeException(String message, Integer code) {
        super(message);
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}

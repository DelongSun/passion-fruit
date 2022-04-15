package com.toodin.passion.ui;

/**
 * @author kenzo
 * @date 2022-03-29 16:30
 */
public enum ApiResultCode {

    SUCCESS(200, "成功"),

    PARAM_IS_NULL(1001, "参数为空"),

    USER_NOT_LOGIN(2001, "用户未登录"),

    NOT_FOUND(5001, "实体未找到"),

    ERROR(9999, "其他异常");

    private final Integer code;
    private final String message;

    ApiResultCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer code() {
        return this.code;
    }

    public String message() {
        return this.message;
    }

}

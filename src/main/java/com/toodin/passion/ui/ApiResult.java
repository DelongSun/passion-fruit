package com.toodin.passion.ui;

import java.io.Serializable;

/**
 * @author kenzo
 * @date 2022-03-29 16:29
 */
public class ApiResult implements Serializable {

    private Integer code;

    private String message;

    private Object data;

    public static ApiResult success() {
        ApiResult result = new ApiResult();
        result.setApiResultCode(ApiResultCode.SUCCESS);
        return result;
    }

    public static ApiResult success(Object data) {
        ApiResult result = new ApiResult();
        result.setApiResultCode(ApiResultCode.SUCCESS);
        result.setData(data);
        return result;
    }

    public static ApiResult success(ApiResultCode code) {
        ApiResult result = new ApiResult();
        result.setApiResultCode(code);
        return result;
    }

    private void setApiResultCode(ApiResultCode resultCode) {
        this.code = resultCode.code();
        this.message = resultCode.message();
    }

    // -- setter/getter

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}

package com.msymobile.games.gamesdatamanager.model;

/**
 * @Author 马孟孟【mamengmeng@msymobile.com】
 * @Date 2017/10/20 13:51
 */
public class JsonResult<T> {
    /***状态码***/
    private Integer code;
    /***结果描述***/
    private String message;
    /***返回的数据***/
    private T data;

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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public JsonResult(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public JsonResult() {
    }

    @Override
    public String toString() {
        return "JsonResult{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}

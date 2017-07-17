package com.danlu.seckil.common;

import java.io.Serializable;

/**
 * Created by Danlu on 2017/7/17.
 */
public class ResultModel<T> implements Serializable {

    private boolean success;

    private T body;

    private String msg;

    public ResultModel(T body) {
        this(true, body, "成功");
    }

    public ResultModel(boolean success, String msg) {
        this.success = success;
        this.msg = msg;
    }

    public ResultModel(boolean success, T body, String msg) {
        this.success = success;
        this.body = body;
        this.msg = msg;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getBody() {
        return body;
    }

    public void setBody(T body) {
        this.body = body;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

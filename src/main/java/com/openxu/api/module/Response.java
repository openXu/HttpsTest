package com.openxu.api.module;


import com.alibaba.fastjson.JSON;

import java.io.Serializable;

public class Response<T> implements Serializable {

    private Integer code;
    private T data;
    private String msg;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Response(Integer code, T data, String msg){
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    @Override
    public String toString(){
        return JSON.toJSONString(this);
    }
}

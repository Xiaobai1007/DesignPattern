package com.xiaobai.entity;

import com.github.pagehelper.Page;
import org.apache.poi.ss.formula.functions.T;

public class ResultBuilder<T> {

    private int code;

    private String errMsg;

    private T data;

    private Page<T> pager;

    private Throwable error;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Page<T> getPager() {
        return pager;
    }

    public void setPager(Page<T> pager) {
        this.pager = pager;
    }

    public Throwable getError() {
        return error;
    }

    public void setError(Throwable error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return "ResultBuilder{" +
                "code=" + code +
                ", errMsg='" + errMsg + '\'' +
                ", data=" + data +
                ", pager=" + pager +
                ", error=" + error +
                '}';
    }
}

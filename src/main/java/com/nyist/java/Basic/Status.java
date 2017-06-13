package com.nyist.java.Basic;

/**
 * Created by lvbowen on 2017/6/13.
 * we will be the best
 */
public enum Status {

    OK(1),
    ERROR(0);
    private Integer code;

    Status(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}

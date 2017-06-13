package com.nyist.java.TO;

import com.nyist.java.Basic.Status;

import java.util.List;

/**
 * Created by lvbowen on 2017/6/13.
 * we will be the best
 */
public class ReturnMessage {


    private Status statusCode;
    private int size;
    private List data;

    public ReturnMessage(Status statusCode, int size, List data) {
        this.statusCode = statusCode;
        this.size = size;
        this.data = data;
    }

    public Status getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Status statusCode) {
        this.statusCode = statusCode;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List getData() {
        return data;
    }

    public void setData(List data) {
        this.data = data;
    }
}

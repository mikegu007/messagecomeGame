package com.message.game.model.PageBase;

import java.io.Serializable;
import java.util.List;

public class PageBean<T> implements Serializable {

    private static final long serialVersionUID = -1L;

    private String code;

    private String msg;

    private Integer count;

    private List<T> data;

     public PageBean() {
         super();
     }
    public PageBean(Integer count) {
         super();
        this.count = count;
     }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}

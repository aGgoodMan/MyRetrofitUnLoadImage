package com.example.yxw.myretrofitunloadimage.beans;

/**
 * TODO
 * Created by yxw on 2017/2/14.
 */

public class RetrofitBean {

    /**
     * data : http://kuaiwenzhen.kjkj123.cn//2017/2month/14day/8a002c9574ef4baea5542631c5501a2b.jpg
     * ret : true
     * msg : 操作成功!
     */

    private String data;
    private boolean ret;
    private String msg;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public boolean isRet() {
        return ret;
    }

    public void setRet(boolean ret) {
        this.ret = ret;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

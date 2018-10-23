package com.land.ch.smartnewcountryside.bean;

import java.util.List;

/**
 * Created by CH
 * on 2018/10/16 16:23
 */
public class HomeTypeBean {


    private String title;
    private int img;
    private Class<?> clz;

    public HomeTypeBean(String title, int img, Class<?> clz) {
        this.title = title;
        this.img = img;
        this.clz = clz;
    }

    public Class<?> getClz() {

        return clz;
    }

    public void setClz(Class<?> clz) {
        this.clz = clz;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

}

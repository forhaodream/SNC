package com.land.ch.smartnewcountryside.bean;

/**
 * Created by CH
 * on 2018/10/25 13:14
 */
public class 认证Bean {
    private int img;
    private String title;
    private String include;
    private Class<?> clz;

    public 认证Bean(int img, String title, String include, Class<?> clz) {
        this.img = img;
        this.title = title;
        this.include = include;
        this.clz = clz;
    }

    public Class<?> getClz() {

        return clz;
    }

    public void setClz(Class<?> clz) {
        this.clz = clz;
    }


    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInclude() {
        return include;
    }

    public void setInclude(String include) {
        this.include = include;
    }
}

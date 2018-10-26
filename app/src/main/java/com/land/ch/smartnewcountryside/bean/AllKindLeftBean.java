package com.land.ch.smartnewcountryside.bean;

/**
 * Created by CH
 * on 2018/10/26 10:50
 */
public class AllKindLeftBean {
    private String title;
    private int color;
    private boolean isCheck;

    public AllKindLeftBean(String title, int color, boolean isCheck) {
        this.title = title;
        this.color = color;
        this.isCheck = isCheck;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public boolean isCheck() {
        return isCheck;
    }

    public void setCheck(boolean check) {
        isCheck = check;
    }
}

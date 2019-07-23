package cn.pincha.domain;

import java.io.Serializable;

public class Pinchaxiang implements Serializable {
    private String id;
    //评查项内容
    private String pcxcontent;
    //分值
    private int score;
    //评查项
    private String pcx;
    //评查项序号
    private int pcxsort;
    //评查类型
    private int type;

    private String registerid;
    //扣分情况
    private int deductmarks;
    //扣分理由
    private String deductreson;

    public String getRegisterid() {
        return registerid;
    }

    public void setRegisterid(String registerid) {
        this.registerid = registerid;
    }

    public int getDeductmarks() {
        return deductmarks;
    }

    public void setDeductmarks(int deductmarks) {
        this.deductmarks = deductmarks;
    }

    public String getDeductreson() {
        return deductreson;
    }

    public void setDeductreson(String deductreson) {
        this.deductreson = deductreson;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPcxcontent() {
        return pcxcontent;
    }

    public void setPcxcontent(String pcxcontent) {
        this.pcxcontent = pcxcontent;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getPcx() {
        return pcx;
    }

    public void setPcx(String pcx) {
        this.pcx = pcx;
    }

    public int getPcxsort() {
        return pcxsort;
    }

    public void setPcxsort(int pcxsort) {
        this.pcxsort = pcxsort;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Pinchaxiang{" +
                "id='" + id + '\'' +
                ", pcxcontent='" + pcxcontent + '\'' +
                ", score=" + score +
                ", pcx='" + pcx + '\'' +
                ", pcxsort=" + pcxsort +
                ", type=" + type +
                ", registerid='" + registerid + '\'' +
                ", deductmarks=" + deductmarks +
                ", deductreson='" + deductreson + '\'' +
                '}';
    }
}

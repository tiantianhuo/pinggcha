package cn.pincha.domain;

import java.io.Serializable;

public class Registerdeductmarks implements Serializable {
    private String id;
    //犯罪者id
    private String registerid;
    //扣分情况
    private int deductmarks;
    //扣分理由
    private String deductreson;
    //pxcid
    private String pcxid;
    //评查类型
    private int type;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getPcxid() {
        return pcxid;
    }

    public void setPcxid(String pcxid) {
        this.pcxid = pcxid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    @Override
    public String toString() {
        return "Registerdeductmarks{" +
                "id='" + id + '\'' +
                ", registerid='" + registerid + '\'' +
                ", deductmarks=" + deductmarks +
                ", deductreson='" + deductreson + '\'' +
                ", pcxid='" + pcxid + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}

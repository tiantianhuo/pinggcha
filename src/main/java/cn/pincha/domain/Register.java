package cn.pincha.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

public class Register implements Serializable {

    private String id;
    //人员名称
    private String name;
    //罪名名称
    private String accusation;
    //案件名称
    private String legalCase;
    //检察院
    private String procuratorate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccusation() {
        return accusation;
    }

    public void setAccusation(String accusation) {
        this.accusation = accusation;
    }

    public String getLegalCase() {
        return legalCase;
    }

    public void setLegalCase(String legalCase) {
        this.legalCase = legalCase;
    }

    public String getProcuratorate() {
        return procuratorate;
    }

    public void setProcuratorate(String procuratorate) {
        this.procuratorate = procuratorate;
    }

    @Override
    public String toString() {
        return "Register{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", accusation='" + accusation + '\'' +
                ", legalCase='" + legalCase + '\'' +
                ", procuratorate='" + procuratorate + '\'' +
                '}';
    }
}

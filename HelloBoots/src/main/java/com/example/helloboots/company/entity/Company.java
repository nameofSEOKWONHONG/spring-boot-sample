package com.example.helloboots.company.entity;

import javax.validation.constraints.NotEmpty;
import java.util.UUID;

public class Company {
    private String compId;
    @NotEmpty
    private String compNm;
    private String compTel;
    @NotEmpty
    private String compCel;

    public Company() {
        this.compId = UUID.randomUUID().toString();
    }
    public Company(String compNm, String compTel, String compCel) {
        this();
        this.compNm = compNm;
        this.compTel = compTel;
        this.compCel = compCel;
    }

    public String getCompId() {
        return compId;
    }

    public void setCompId(String compId) {
        this.compId = compId;
    }

    public String getCompNm() {
        return compNm;
    }

    public void setCompNm(String compNm) {
        this.compNm = compNm;
    }

    public String getCompTel() {
        return compTel;
    }

    public void setCompTel(String compTel) {
        this.compTel = compTel;
    }

    public String getCompCel() {
        return compCel;
    }

    public void setCompCel(String compCel) {
        this.compCel = compCel;
    }
}

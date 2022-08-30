package com.example.helloboots.company.entity;

import javax.validation.constraints.NotEmpty;
import java.util.UUID;

public class Department {
    private String deptId;
    @NotEmpty
    private String deptNm;
    @NotEmpty
    private String compId;

    public Department() {
        this.deptId = UUID.randomUUID().toString();
    }
    public Department(String deptNm, String compId) {
        this();
        this.deptNm = deptNm;
        this.compId = compId;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getDeptNm() {
        return deptNm;
    }

    public void setDeptNm(String deptNm) {
        this.deptNm = deptNm;
    }

    public String getCompId() {
        return compId;
    }

    public void setCompId(String compId) {
        this.compId = compId;
    }
}

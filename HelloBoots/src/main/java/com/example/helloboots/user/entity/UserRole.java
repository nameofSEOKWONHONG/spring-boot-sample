package com.example.helloboots.user.entity;

import java.util.UUID;

public class UserRole {
    private String roleId;
    private String roleNm;
    private Integer roleVal;

    public UserRole() {
        this.roleId = UUID.randomUUID().toString();
    }

    public UserRole(String roleNm, Integer roleVal) {
        this();
        this.roleNm = roleNm;
        this.roleVal = roleVal;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getRoleNm() {
        return roleNm;
    }

    public void setRoleNm(String roleNm) {
        this.roleNm = roleNm;
    }
}

package com.example.helloboots.user.entity;

import javax.validation.constraints.NotEmpty;
import java.util.UUID;

public class User {
    private String id;
    private String name;
    private String email;

    /**
     * ROLE_ID
     */
    private String roleId;

    @NotEmpty
    private String compId;
    @NotEmpty
    private String deptId;

    public User() {
        id = UUID.randomUUID().toString();
    }

    public User(String name, String email, String compId, String deptId) {
        this();
        this.name = name;
        this.email = email;
        this.compId = compId;
        this.deptId = deptId;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCompId() {
        return compId;
    }

    public void setCompId(String compId) {
        this.compId = compId;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }
}

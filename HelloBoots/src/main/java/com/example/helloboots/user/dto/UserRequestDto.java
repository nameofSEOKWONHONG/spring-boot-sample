package com.example.helloboots.user.dto;

import java.io.Serializable;

/**
 * Get Method에서 object 맵핑을 지원하기 위하여 Serializable 상속함.
 */
public class UserRequestDto implements Serializable {
    public String name;
    public String email;

    public String getName() {
        if(name == null) return "";
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        if(email == null) return "";
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
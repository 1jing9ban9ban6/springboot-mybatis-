package com.mybatis.pojo;

import lombok.Data;

@Data
public class User {
    private String id;
    private String name;
    private Integer age;
    private String email;

    public User(String id, String name, Integer age, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public User() {
    }
}

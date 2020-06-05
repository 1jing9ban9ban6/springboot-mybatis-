package com.mybatis.pojo;

import lombok.Data;

import java.util.List;

@Data
public class Project {
    private String pid;
    private String pname;
    private float price;
    private List<User> users;
}

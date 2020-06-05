package com.mybatis.dao;

import com.mybatis.pojo.Project;
import com.mybatis.pojo.User;

import java.util.List;

public interface ProjectMapper {
    List<Project> getPro();
    Integer countByProList(List<String> UserList);
}

package com.mybatis.dao;

import com.mybatis.pojo.Emails;
import com.mybatis.pojo.UserVo;

import java.util.List;

public interface EmailsMapper {
    Emails getEmailById(String id);
    UserVo getAllById(String id);
    List<UserVo> getAll();
}

package com.mybatis.service;

import com.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserService {
    boolean addUser(User user);
    User getUserById(String id);
    List<User> getUsers();
    boolean deleteUserById(String id);
    List<Map<String, Object>> getUserByAgeAndName(Integer age, String name);
    List<Map<String, Object>> getUserByAgeAndName1();
    /**
     *
     * @param pageNum 第几页
     * @param pageSize 每一页的大小
     * @return
     */
    List<User> getUserByPage(Integer pageNum, Integer pageSize);
    boolean updateUser(String user);
}

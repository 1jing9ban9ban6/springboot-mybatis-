package com.mybatis.dao;

import com.mybatis.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserMapper {
    // 增加一个用户
    boolean addUser(User user);
    // 根据id查找用户
    User getUserById(@Param("id") String id);
    // 查询所有用户
    List<User> getUsers();
    // 根据用户名删除一个用户
    boolean deleteUserById(@Param("id") String id);
    // 根据用户年龄或者姓名
    List<Map<String, Object>> getUserByAgeAndName(@Param("age") Integer age, @Param("name") String name);
    List<Map<String, Object>> getUserByAgeAndName1();
    // 用户分页
    /**
     *
     * @param pageNum 第几页
     * @param pageSize 每一页的大小
     * @return
     */
    List<User> getUserByPage(@Param("pageNum") Integer pageNum, @Param("pageSize") Integer pageSize);
    boolean updateUser(User user);
}

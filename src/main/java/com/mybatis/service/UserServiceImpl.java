package com.mybatis.service;

import com.alibaba.fastjson.JSONObject;
import com.mybatis.dao.UserMapper;
import com.mybatis.pojo.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public boolean addUser(User user) {
        return userMapper.addUser(user);
    }

    @Override
    public User getUserById(String id) {
        return userMapper.getUserById(id);
    }

    @Override
    public List<User> getUsers() {
        return userMapper.getUsers();
    }

    @Override
    public boolean deleteUserById(String id) {
        return userMapper.deleteUserById(id);
    }

    @Override
    public List<Map<String, Object>> getUserByAgeAndName(Integer age, String name) {
        return userMapper.getUserByAgeAndName(age, name);
    }

    @Override
    public List<Map<String, Object>> getUserByAgeAndName1() {
        return userMapper.getUserByAgeAndName1();
    }

    /**
     * @param pageNum  第几页
     * @param pageSize 每一页的大小
     * @return
     */
    @Override
    public List<User> getUserByPage(Integer pageNum, Integer pageSize) {
        return userMapper.getUserByPage(pageNum, pageSize);
    }

    @Override
    public boolean updateUser(String user) {
        JSONObject object = JSONObject.parseObject(user);
        String id = (String) object.getOrDefault("id", "");
        User byId = userMapper.getUserById(id);
        if (byId == null) {
            System.out.println("查无此人");
            return false;
        }
        User userNew = new User();
        userNew.setId(byId.getId());
        String name = (String) object.getOrDefault("name", "");
        String age = (String) object.getOrDefault("age", "");
        String email = (String) object.getOrDefault("email", "");
        userNew.setName(name);
        if (!(age==null || "".equals(age))){
            userNew.setAge(Integer.parseInt(age));
        }
        userNew.setEmail(email);
        return userMapper.updateUser(userNew);
    }
}

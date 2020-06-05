package com.mybatis.UserTest;

import com.mybatis.dao.UserMapper;
import com.mybatis.pojo.User;
import com.mybatis.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.RequestBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class userTest {

    @Autowired
    private UserService userService;
    @Resource
    private UserMapper userMapper;
    @Test
    public void testSelect() {
        System.out.println(userService.getUserById("21"));

    }
    @Test
    public void testInsert() {
        User user = new User("24", "小hu", 22, "212424124@qq.com");
        userService.addUser(user);
    }
    @Test
    public void testSelectUsers() {
        List<User> users = userService.getUsers();
        for (User u:users) {
            System.out.println(u);
        }
    }
    @Test
    public void testDeleteUsers() {
        boolean b = userService.deleteUserById("24");
        System.out.println(b);
    }
    @Test
    public void testLianHe() {
        List<Map<String, Object>> list = userService.getUserByAgeAndName(null, "小");
        System.out.println(list);
    }
    @Test
    public void testLianHe1() {
        List<Map<String, Object>> list = userService.getUserByAgeAndName1();
        System.out.println(list);
    }
    @Test
    public void testUserPage() {
        List<User> userByPage = userService.getUserByPage(4, 2);
        System.out.println(userByPage);
    }
    @Test
    public void update() {
        boolean ads = userMapper.updateUser(new User("44", "ads", 33, "123@qq.com"));
        System.out.println(ads);
    }
}
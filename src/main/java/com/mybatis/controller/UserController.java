package com.mybatis.controller;

import com.alibaba.fastjson.JSONObject;
import com.mybatis.pojo.User;
import com.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/user")
    public String getUserById(@RequestParam("id") String id){
        System.out.println(id);
        User u = userService.getUserById("21");
        return u.toString();
    }
    @PostMapping("/user")
    public String insertUser(@RequestBody String user){
        User u = JSONObject.parseObject(user, User.class);
        boolean b = userService.addUser(u);
        if (b){
            return "添加成功";
        } else {
            return "添加失败";
        }
    }
    @PutMapping("/user")
    public String updateUser(@RequestBody String user){
        boolean b = userService.updateUser(user);
        if (b){
            return "修改成功";
        } else {
            return "修改失败";
        }
    }
    @DeleteMapping("/user")
    public String delete(@RequestParam("id") String id){
        boolean b = userService.deleteUserById(id);
        if (b){
            return "删除成功";
        } else {
            return "删除失败";
        }
    }
}

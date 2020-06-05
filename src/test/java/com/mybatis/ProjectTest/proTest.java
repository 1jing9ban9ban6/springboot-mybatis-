package com.mybatis.ProjectTest;

import com.mybatis.dao.ProjectMapper;
import com.mybatis.pojo.Project;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class proTest {
    @Resource
    private ProjectMapper projectMapper;
    @Test
    public void TestGetAll(){
        List<Project> pro = projectMapper.getPro();

    }
    @Test
    public void TestGetForeach(){
        ArrayList<String> users = new ArrayList<>();
        users.add("1");
        users.add("2");
        users.add("12");
        Integer integer = projectMapper.countByProList(users);
        System.out.println(integer);

    }
}


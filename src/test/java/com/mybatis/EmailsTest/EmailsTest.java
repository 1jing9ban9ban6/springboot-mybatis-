package com.mybatis.EmailsTest;

import com.mybatis.dao.EmailsMapper;
import com.mybatis.dao.UserMapper;
import com.mybatis.pojo.Emails;
import com.mybatis.pojo.UserVo;
import com.mybatis.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmailsTest {
    @Resource
    private EmailsMapper emailsMapper;
    @Test
    public void testSelect() {
        Emails emailById = emailsMapper.getEmailById("12121212@qq.com");
        System.out.println(emailById);
    }
    @Test
    public void testGetAllById() {
        UserVo allById = emailsMapper.getAllById("21");
        System.out.println(allById.getName());
    }
    @Test
    public void testGetAll() {
        List<UserVo> all = emailsMapper.getAll();
        for (int i = 0; i < all.size(); i++) {
            System.out.println(all.get(i).getEmails());
        }
    }
}

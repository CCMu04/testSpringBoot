package com.example.demo.mapper;

import com.example.demo.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    void Test() {
        List<User> list = userMapper.selectList(null);
        for (User user : list) {
            System.out.println("id: " + user.getId() + ", name: " + user.getName() + ", age: " + user.getAge());
        }
    }
}
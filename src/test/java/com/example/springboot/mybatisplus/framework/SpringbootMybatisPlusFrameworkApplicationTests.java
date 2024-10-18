package com.example.springboot.mybatisplus.framework;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.springboot.mybatisplus.framework.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootMybatisPlusFrameworkApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {
        userMapper.selectList(new QueryWrapper<>()).forEach(System.out::println);
    }

}

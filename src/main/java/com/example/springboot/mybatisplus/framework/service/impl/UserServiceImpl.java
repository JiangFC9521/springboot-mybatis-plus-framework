package com.example.springboot.mybatisplus.framework.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springboot.mybatisplus.framework.model.po.User;
import com.example.springboot.mybatisplus.framework.service.UserService;
import com.example.springboot.mybatisplus.framework.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author jiang
* @description 针对表【user】的数据库操作Service实现
* @createDate 2024-10-17 17:16:43
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}





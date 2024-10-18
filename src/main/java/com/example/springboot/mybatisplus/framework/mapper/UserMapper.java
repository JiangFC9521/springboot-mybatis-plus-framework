package com.example.springboot.mybatisplus.framework.mapper;

import com.example.springboot.mybatisplus.framework.model.po.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author jiang
* @description 针对表【user】的数据库操作Mapper
* @createDate 2024-10-17 17:16:43
* @Entity com.example.springboot.mybatisplus.framework.model.po.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

}





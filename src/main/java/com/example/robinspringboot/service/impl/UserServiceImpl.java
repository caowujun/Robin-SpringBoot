package com.example.robinspringboot.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.robinspringboot.mapper.UserMapper;
import com.example.robinspringboot.domain.User;
import com.example.robinspringboot.service.UserService;
import org.springframework.stereotype.Service;

/**
* @author P0164442
* @description 针对表【user】的数据库操作Service实现
* @createDate 2023-06-25 16:23:43
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}





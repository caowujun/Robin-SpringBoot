package com.example.robinspringboot.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.robinspringboot.entity.Log;
import com.example.robinspringboot.service.LogService;
import com.example.robinspringboot.mapper.LogMapper;
import org.springframework.stereotype.Service;

/**
* @author P0164442
* @description 针对表【log】的数据库操作Service实现
* @createDate 2023-07-07 12:56:04
*/
@Service
public class LogServiceImpl extends ServiceImpl<LogMapper, Log>
    implements LogService{

}





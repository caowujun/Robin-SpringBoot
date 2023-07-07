package com.example.robinspringboot.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.robinspringboot.entity.Money;
import com.example.robinspringboot.service.MoneyService;
import com.example.robinspringboot.mapper.MoneyMapper;
import org.springframework.stereotype.Service;

/**
* @author P0164442
* @description 针对表【money】的数据库操作Service实现
* @createDate 2023-07-07 12:56:04
*/
@Service
public class MoneyServiceImpl extends ServiceImpl<MoneyMapper, Money>
    implements MoneyService{

}





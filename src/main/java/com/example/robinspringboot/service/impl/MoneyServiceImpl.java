package com.example.robinspringboot.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.robinspringboot.mapper.MoneyMapper;
import com.example.robinspringboot.domain.Money;
import com.example.robinspringboot.service.MoneyService;
import org.springframework.stereotype.Service;

/**
* @author P0164442
* @description 针对表【money】的数据库操作Service实现
* @createDate 2023-06-25 16:23:43
*/
@Service
public class MoneyServiceImpl extends ServiceImpl<MoneyMapper, Money>
    implements MoneyService{

}





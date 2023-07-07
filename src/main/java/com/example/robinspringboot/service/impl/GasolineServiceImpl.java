package com.example.robinspringboot.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.robinspringboot.entity.Gasoline;
import com.example.robinspringboot.service.GasolineService;
import com.example.robinspringboot.mapper.GasolineMapper;
import org.springframework.stereotype.Service;

/**
* @author P0164442
* @description 针对表【gasoline】的数据库操作Service实现
* @createDate 2023-07-07 12:56:04
*/
@Service
public class GasolineServiceImpl extends ServiceImpl<GasolineMapper, Gasoline>
    implements GasolineService{

}





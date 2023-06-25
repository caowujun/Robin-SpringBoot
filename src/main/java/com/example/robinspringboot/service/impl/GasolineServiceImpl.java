package com.example.robinspringboot.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.robinspringboot.mapper.GasolineMapper;
import com.example.robinspringboot.domain.Gasoline;
import com.example.robinspringboot.service.GasolineService;
import org.springframework.stereotype.Service;

/**
* @author P0164442
* @description 针对表【gasoline】的数据库操作Service实现
* @createDate 2023-06-25 16:23:43
*/
@Service
public class GasolineServiceImpl extends ServiceImpl<GasolineMapper, Gasoline>
    implements GasolineService{

}





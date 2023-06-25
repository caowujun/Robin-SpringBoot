package com.example.robinspringboot.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.robinspringboot.mapper.ScheduleMapper;
import com.example.robinspringboot.domain.Schedule;
import com.example.robinspringboot.service.ScheduleService;
import org.springframework.stereotype.Service;

/**
* @author P0164442
* @description 针对表【schedule】的数据库操作Service实现
* @createDate 2023-06-25 16:23:43
*/
@Service
public class ScheduleServiceImpl extends ServiceImpl<ScheduleMapper, Schedule>
    implements ScheduleService{

}





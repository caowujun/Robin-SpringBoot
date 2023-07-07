package com.example.robinspringboot.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.robinspringboot.entity.Battle;
import com.example.robinspringboot.service.BattleService;
import com.example.robinspringboot.mapper.BattleMapper;
import org.springframework.stereotype.Service;

/**
* @author P0164442
* @description 针对表【battle】的数据库操作Service实现
* @createDate 2023-07-07 12:56:04
*/
@Service
public class BattleServiceImpl extends ServiceImpl<BattleMapper, Battle>
    implements BattleService{

}





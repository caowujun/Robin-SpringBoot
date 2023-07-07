package com.example.robinspringboot.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.robinspringboot.entity.Role;
import com.example.robinspringboot.service.RoleService;
import com.example.robinspringboot.mapper.RoleMapper;
import org.springframework.stereotype.Service;

/**
* @author P0164442
* @description 针对表【role】的数据库操作Service实现
* @createDate 2023-07-07 12:56:04
*/
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role>
    implements RoleService{

}





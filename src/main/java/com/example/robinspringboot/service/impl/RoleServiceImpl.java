package com.example.robinspringboot.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.robinspringboot.mapper.RoleMapper;
import com.example.robinspringboot.domain.Role;
import com.example.robinspringboot.service.RoleService;
import org.springframework.stereotype.Service;

/**
* @author P0164442
* @description 针对表【role】的数据库操作Service实现
* @createDate 2023-06-25 16:23:43
*/
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role>
    implements RoleService{

}




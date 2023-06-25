package com.example.robinspringboot.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.robinspringboot.domain.Fire;
import com.example.robinspringboot.service.FireService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname Battle
 * @Description TODO
 * @Date 2023/6/25 16:05
 * @Author wujun.cao
 */
@RestController
@RequestMapping("/fire")
public class FireController {

    @Resource
    private FireService fireService;


    @GetMapping(value = "page")
    public Page<Fire> page(Page<Fire> page, Fire fire) {
        return this.fireService.page(page, new QueryWrapper<>(fire));
    }
}

package com.example.robinspringboot.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.robinspringboot.entity.Enumconfig;
import com.example.robinspringboot.service.EnumconfigService;
import jakarta.annotation.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


/**
 * (Enumconfig)表控制层
 *
 * @author makejava
 * @since 2023-07-07 14:15:53
 */
@RestController
@RequestMapping("enumconfig")
public class EnumconfigController {
    /**
     * 服务对象
     */
    @Resource
    private EnumconfigService enumconfigService;

    /**
     * 分页查询
     *
     * @param page       分页对象
     * @param enumconfig 筛选条件
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Enumconfig>> page(Page<Enumconfig> page, Enumconfig enumconfig) {
        return ResponseEntity.ok(this.enumconfigService.page(page, new QueryWrapper<>(enumconfig)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Enumconfig> query(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.enumconfigService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param enumconfig 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Boolean> add(Enumconfig enumconfig) {
        return ResponseEntity.ok(this.enumconfigService.save(enumconfig));
    }

    /**
     * 编辑数据
     *
     * @param enumconfig 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Boolean> edit(Enumconfig enumconfig) {
        return ResponseEntity.ok(this.enumconfigService.updateById(enumconfig));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.enumconfigService.removeById(id));
    }

}


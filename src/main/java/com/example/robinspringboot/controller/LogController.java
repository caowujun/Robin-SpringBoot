package com.example.robinspringboot.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.robinspringboot.entity.Log;
import com.example.robinspringboot.service.LogService;
import jakarta.annotation.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


/**
 * (Log)表控制层
 *
 * @author makejava
 * @since 2023-07-07 14:15:53
 */
@RestController
@RequestMapping("log")
public class LogController {
    /**
     * 服务对象
     */
    @Resource
    private LogService logService;

    /**
     * 分页查询
     *
     * @param page 分页对象
     * @param log  筛选条件
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Log>> page(Page<Log> page, Log log) {
        return ResponseEntity.ok(this.logService.page(page, new QueryWrapper<>(log)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Log> query(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.logService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param log 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Boolean> add(Log log) {
        return ResponseEntity.ok(this.logService.save(log));
    }

    /**
     * 编辑数据
     *
     * @param log 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Boolean> edit(Log log) {
        return ResponseEntity.ok(this.logService.updateById(log));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.logService.removeById(id));
    }

}


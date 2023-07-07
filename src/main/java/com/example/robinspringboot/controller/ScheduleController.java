package com.example.robinspringboot.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.robinspringboot.entity.Schedule;
import com.example.robinspringboot.service.ScheduleService;
import jakarta.annotation.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


/**
 * (Schedule)表控制层
 *
 * @author makejava
 * @since 2023-07-07 14:15:53
 */
@RestController
@RequestMapping("schedule")
public class ScheduleController {
    /**
     * 服务对象
     */
    @Resource
    private ScheduleService scheduleService;

    /**
     * 分页查询
     *
     * @param page     分页对象
     * @param schedule 筛选条件
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Schedule>> page(Page<Schedule> page, Schedule schedule) {
        return ResponseEntity.ok(this.scheduleService.page(page, new QueryWrapper<>(schedule)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Schedule> query(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.scheduleService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param schedule 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Boolean> add(Schedule schedule) {
        return ResponseEntity.ok(this.scheduleService.save(schedule));
    }

    /**
     * 编辑数据
     *
     * @param schedule 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Boolean> edit(Schedule schedule) {
        return ResponseEntity.ok(this.scheduleService.updateById(schedule));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.scheduleService.removeById(id));
    }

}


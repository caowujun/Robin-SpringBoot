package com.example.robinspringboot.controller;

import com.example.robinspringboot.domain.Schedule;
import com.example.robinspringboot.service.ScheduleService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Schedule)表控制层
 *
 * @author makejava
 * @since 2023-06-26 13:44:19
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
     * @param schedule    筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Schedule>> queryByPage(Schedule schedule, PageRequest pageRequest) {
        return ResponseEntity.ok(this.scheduleService.queryByPage(schedule, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Schedule> queryById(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.scheduleService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param schedule 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Schedule> add(Schedule schedule) {
        return ResponseEntity.ok(this.scheduleService.insert(schedule));
    }

    /**
     * 编辑数据
     *
     * @param schedule 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Schedule> edit(Schedule schedule) {
        return ResponseEntity.ok(this.scheduleService.update(schedule));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(String id) {
        return ResponseEntity.ok(this.scheduleService.deleteById(id));
    }

}


package com.example.robinspringboot.controller;

import com.example.robinspringboot.domain.Log;
import com.example.robinspringboot.service.LogService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Log)表控制层
 *
 * @author makejava
 * @since 2023-06-26 13:44:19
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
     * @param log         筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Log>> queryByPage(Log log, PageRequest pageRequest) {
        return ResponseEntity.ok(this.logService.queryByPage(log, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Log> queryById(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.logService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param log 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Log> add(Log log) {
        return ResponseEntity.ok(this.logService.insert(log));
    }

    /**
     * 编辑数据
     *
     * @param log 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Log> edit(Log log) {
        return ResponseEntity.ok(this.logService.update(log));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(String id) {
        return ResponseEntity.ok(this.logService.deleteById(id));
    }

}


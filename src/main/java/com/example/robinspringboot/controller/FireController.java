package com.example.robinspringboot.controller;

import com.example.robinspringboot.domain.Fire;
import com.example.robinspringboot.service.FireService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Fire)表控制层
 *
 * @author makejava
 * @since 2023-06-26 13:44:19
 */
@RestController
@RequestMapping("fire")
public class FireController {
    /**
     * 服务对象
     */
    @Resource
    private FireService fireService;

    /**
     * 分页查询
     *
     * @param fire        筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Fire>> queryByPage(Fire fire, PageRequest pageRequest) {
        return ResponseEntity.ok(this.fireService.queryByPage(fire, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Fire> queryById(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.fireService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param fire 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Fire> add(Fire fire) {
        return ResponseEntity.ok(this.fireService.insert(fire));
    }

    /**
     * 编辑数据
     *
     * @param fire 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Fire> edit(Fire fire) {
        return ResponseEntity.ok(this.fireService.update(fire));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(String id) {
        return ResponseEntity.ok(this.fireService.deleteById(id));
    }

}


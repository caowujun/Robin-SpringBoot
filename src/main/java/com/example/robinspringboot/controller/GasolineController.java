package com.example.robinspringboot.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.robinspringboot.entity.Gasoline;
import com.example.robinspringboot.service.GasolineService;
import jakarta.annotation.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


/**
 * (Gasoline)表控制层
 *
 * @author makejava
 * @since 2023-07-07 14:15:53
 */
@RestController
@RequestMapping("gasoline")
public class GasolineController {
    /**
     * 服务对象
     */
    @Resource
    private GasolineService gasolineService;

    /**
     * 分页查询
     *
     * @param page     分页对象
     * @param gasoline 筛选条件
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Gasoline>> page(Page<Gasoline> page, Gasoline gasoline) {
        return ResponseEntity.ok(this.gasolineService.page(page, new QueryWrapper<>(gasoline)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Gasoline> query(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.gasolineService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param gasoline 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Boolean> add(Gasoline gasoline) {
        return ResponseEntity.ok(this.gasolineService.save(gasoline));
    }

    /**
     * 编辑数据
     *
     * @param gasoline 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Boolean> edit(Gasoline gasoline) {
        return ResponseEntity.ok(this.gasolineService.updateById(gasoline));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.gasolineService.removeById(id));
    }

}


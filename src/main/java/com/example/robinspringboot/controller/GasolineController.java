package com.example.robinspringboot.controller;

import com.example.robinspringboot.domain.Gasoline;
import com.example.robinspringboot.service.GasolineService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Gasoline)表控制层
 *
 * @author makejava
 * @since 2023-06-26 13:44:19
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
     * @param gasoline    筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Gasoline>> queryByPage(Gasoline gasoline, PageRequest pageRequest) {
        return ResponseEntity.ok(this.gasolineService.queryByPage(gasoline, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Gasoline> queryById(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.gasolineService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param gasoline 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Gasoline> add(Gasoline gasoline) {
        return ResponseEntity.ok(this.gasolineService.insert(gasoline));
    }

    /**
     * 编辑数据
     *
     * @param gasoline 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Gasoline> edit(Gasoline gasoline) {
        return ResponseEntity.ok(this.gasolineService.update(gasoline));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(String id) {
        return ResponseEntity.ok(this.gasolineService.deleteById(id));
    }

}


package com.example.robinspringboot.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.robinspringboot.entity.Battle;
import com.example.robinspringboot.service.BattleService;
import jakarta.annotation.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


/**
 * (Battle)表控制层
 *
 * @author makejava
 * @since 2023-07-07 14:15:53
 */
@RestController
@RequestMapping("battle")
public class BattleController {
    /**
     * 服务对象
     */
    @Resource
    private BattleService battleService;

    /**
     * 分页查询
     *
     * @param page   分页对象
     * @param battle 筛选条件
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Battle>> page(Page<Battle> page, Battle battle) {
        return ResponseEntity.ok(this.battleService.page(page, new QueryWrapper<>(battle)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Battle> query(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.battleService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param battle 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Boolean> add(Battle battle) {
        return ResponseEntity.ok(this.battleService.save(battle));
    }

    /**
     * 编辑数据
     *
     * @param battle 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Boolean> edit(Battle battle) {
        return ResponseEntity.ok(this.battleService.updateById(battle));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.battleService.removeById(id));
    }

}


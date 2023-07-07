package com.example.robinspringboot.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.robinspringboot.entity.Money;
import com.example.robinspringboot.service.MoneyService;
import jakarta.annotation.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


/**
 * (Money)表控制层
 *
 * @author makejava
 * @since 2023-07-07 14:15:53
 */
@RestController
@RequestMapping("money")
public class MoneyController {
    /**
     * 服务对象
     */
    @Resource
    private MoneyService moneyService;

    /**
     * 分页查询
     *
     * @param page  分页对象
     * @param money 筛选条件
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Money>> page(Page<Money> page, Money money) {
        return ResponseEntity.ok(this.moneyService.page(page, new QueryWrapper<>(money)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Money> query(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.moneyService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param money 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Boolean> add(Money money) {
        return ResponseEntity.ok(this.moneyService.save(money));
    }

    /**
     * 编辑数据
     *
     * @param money 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Boolean> edit(Money money) {
        return ResponseEntity.ok(this.moneyService.updateById(money));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.moneyService.removeById(id));
    }

}


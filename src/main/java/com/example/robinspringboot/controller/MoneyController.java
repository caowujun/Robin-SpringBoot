package com.example.robinspringboot.controller;

import com.example.robinspringboot.domain.Money;
import com.example.robinspringboot.service.MoneyService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Money)表控制层
 *
 * @author makejava
 * @since 2023-06-26 13:44:19
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
     * @param money       筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Money>> queryByPage(Money money, PageRequest pageRequest) {
        return ResponseEntity.ok(this.moneyService.queryByPage(money, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Money> queryById(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.moneyService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param money 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Money> add(Money money) {
        return ResponseEntity.ok(this.moneyService.insert(money));
    }

    /**
     * 编辑数据
     *
     * @param money 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Money> edit(Money money) {
        return ResponseEntity.ok(this.moneyService.update(money));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(String id) {
        return ResponseEntity.ok(this.moneyService.deleteById(id));
    }

}


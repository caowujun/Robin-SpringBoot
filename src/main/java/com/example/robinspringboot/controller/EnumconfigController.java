package com.example.robinspringboot.controller;

import com.example.robinspringboot.domain.Enumconfig;
import com.example.robinspringboot.service.EnumconfigService;
import jakarta.annotation.Resource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


/**
 * (Enumconfig)表控制层
 *
 * @author makejava
 * @since 2023-06-26 13:44:19
 */
@RestController
@RequestMapping("enumconfig")
public class EnumconfigController {
    /**
     * 服务对象
     */
    @Resource
    private EnumconfigService enumconfigService;

    /**
     * 分页查询
     *
     * @param enumconfig  筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Enumconfig>> queryByPage(Enumconfig enumconfig, PageRequest pageRequest) {
        return ResponseEntity.ok(this.enumconfigService.queryByPage(enumconfig, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Enumconfig> queryById(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.enumconfigService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param enumconfig 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Enumconfig> add(Enumconfig enumconfig) {
        return ResponseEntity.ok(this.enumconfigService.insert(enumconfig));
    }

    /**
     * 编辑数据
     *
     * @param enumconfig 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Enumconfig> edit(Enumconfig enumconfig) {
        return ResponseEntity.ok(this.enumconfigService.update(enumconfig));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(String id) {
        return ResponseEntity.ok(this.enumconfigService.deleteById(id));
    }

}


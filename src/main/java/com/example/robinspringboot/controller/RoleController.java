package com.example.robinspringboot.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.robinspringboot.entity.Role;
import com.example.robinspringboot.service.RoleService;
import jakarta.annotation.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


/**
 * (Role)表控制层
 *
 * @author makejava
 * @since 2023-07-07 14:15:53
 */
@RestController
@RequestMapping("role")
public class RoleController {
    /**
     * 服务对象
     */
    @Resource
    private RoleService roleService;

    /**
     * 分页查询
     *
     * @param page 分页对象
     * @param role 筛选条件
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Role>> page(Page<Role> page, Role role) {
        return ResponseEntity.ok(this.roleService.page(page, new QueryWrapper<>(role)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Role> query(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.roleService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param role 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Boolean> add(Role role) {
        return ResponseEntity.ok(this.roleService.save(role));
    }

    /**
     * 编辑数据
     *
     * @param role 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Boolean> edit(Role role) {
        return ResponseEntity.ok(this.roleService.updateById(role));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.roleService.removeById(id));
    }

}


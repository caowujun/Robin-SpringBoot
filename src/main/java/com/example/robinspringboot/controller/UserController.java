package com.example.robinspringboot.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.robinspringboot.entity.User;
import com.example.robinspringboot.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


/**
 * (User)表控制层
 *
 * @author makejava
 * @since 2023-07-07 14:15:54
 */
@RestController
@RequestMapping("user")
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;

    /**
     * 分页查询
     *
     * @param page 分页对象
     * @param user 筛选条件
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<User>> page(Page<User> page, User user) {
        return ResponseEntity.ok(this.userService.page(page, new QueryWrapper<>(user)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<User> query(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.userService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param user 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Boolean> add(User user) {
        return ResponseEntity.ok(this.userService.save(user));
    }

    /**
     * 编辑数据
     *
     * @param user 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Boolean> edit(User user) {
        return ResponseEntity.ok(this.userService.updateById(user));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.userService.removeById(id));
    }

}


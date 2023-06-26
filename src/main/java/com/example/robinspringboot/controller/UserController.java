package com.example.robinspringboot.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.robinspringboot.domain.User;
import com.example.robinspringboot.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

/**
 * @Classname UserController
 * @Description TODO
 * @Date 2023/6/26 9:16
 * @Author wujun.cao
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    /**
     * @param page
     * @param user
     * @Description:
     * @return: Page<com.example.robinspringboot.domain.User>
     * @Author: wujun.cao
     * @Date: 2023/6/26 13:22
     */
    @GetMapping
    public Page<User> page(Page<User> page, User user) {
        return this.userService.page(page, new QueryWrapper<>(user));
    }

    /**
     * @param user
     * @Description:
     * @return: boolean
     * @Author: wujun.cao
     * @Date: 2023/6/26 13:22
     */
    @PostMapping
    public boolean add(@RequestBody User user) {
        return this.userService.save(user);
    }

    /**
     * @param user
     * @Description:
     * @return: boolean
     * @Author: wujun.cao
     * @Date: 2023/6/26 13:22
     */
    @PutMapping
    public boolean update(@RequestBody User user) {
        return this.userService.updateById(user);
    }

    /**
     * @param id
     * @Description:
     * @return: com.example.robinspringboot.domain.User
     * @Author: wujun.cao
     * @Date: 2023/6/26 13:22
     */
    @GetMapping("/{id}")
    public User query(@PathVariable String id) {
        return this.userService.getById(id);
    }

    /**
     * @param id
     * @Description:
     * @return: boolean
     * @Author: wujun.cao
     * @Date: 2023/6/26 13:22
     */
    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable String id) {
        return this.userService.removeById(id);
    }
}

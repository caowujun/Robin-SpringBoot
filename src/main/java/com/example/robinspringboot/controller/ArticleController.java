package com.example.robinspringboot.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.robinspringboot.entity.Article;
import com.example.robinspringboot.service.ArticleService;
import jakarta.annotation.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


/**
 * (Article)表控制层
 *
 * @author makejava
 * @since 2023-07-07 14:15:53
 */
@RestController
@RequestMapping("article")
public class ArticleController {
    /**
     * 服务对象
     */
    @Resource
    private ArticleService articleService;

    /**
     * 分页查询
     *
     * @param page    分页对象
     * @param article 筛选条件
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Article>> page(Page<Article> page, Article article) {
        return ResponseEntity.ok(this.articleService.page(page, new QueryWrapper<>(article)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Article> query(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.articleService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param article 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Boolean> add(Article article) {
        return ResponseEntity.ok(this.articleService.save(article));
    }

    /**
     * 编辑数据
     *
     * @param article 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Boolean> edit(Article article) {
        return ResponseEntity.ok(this.articleService.updateById(article));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.articleService.removeById(id));
    }

}


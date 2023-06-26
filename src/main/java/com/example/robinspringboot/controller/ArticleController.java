package com.example.robinspringboot.controller;

import com.example.robinspringboot.domain.Article;
import com.example.robinspringboot.service.ArticleService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import jakarta.annotation.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * (Article)表控制层
 *
 * @author makejava
 * @since 2023-06-26 13:44:19
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
     * @param article     筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Article>> queryByPage(Page<Article> page, Article article) {
        return ResponseEntity.ok(this.articleService.page(page, new QueryWrapper<>(article)));
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
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/{id}")
    public ResponseEntity<Article> queryById(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.articleService.getById(id));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> deleteById(@PathVariable String id) {
        return ResponseEntity.ok(this.articleService.removeById(id));
    }

}


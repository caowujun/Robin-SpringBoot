package com.example.robinspringboot.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.robinspringboot.entity.Article;
import com.example.robinspringboot.service.ArticleService;
import com.example.robinspringboot.mapper.ArticleMapper;
import org.springframework.stereotype.Service;

/**
* @author P0164442
* @description 针对表【article】的数据库操作Service实现
* @createDate 2023-07-07 12:56:04
*/
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article>
    implements ArticleService{

}





package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.domain.Article;
import generator.service.ArticleService;
import generator.mapper.ArticleMapper;
import org.springframework.stereotype.Service;

/**
* @author P0164442
* @description 针对表【article】的数据库操作Service实现
* @createDate 2023-06-25 16:23:42
*/
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article>
    implements ArticleService{

}





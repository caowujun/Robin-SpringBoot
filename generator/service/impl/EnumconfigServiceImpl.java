package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.domain.Enumconfig;
import generator.service.EnumconfigService;
import generator.mapper.EnumconfigMapper;
import org.springframework.stereotype.Service;

/**
* @author P0164442
* @description 针对表【enumConfig】的数据库操作Service实现
* @createDate 2023-06-25 16:23:43
*/
@Service
public class EnumconfigServiceImpl extends ServiceImpl<EnumconfigMapper, Enumconfig>
    implements EnumconfigService{

}




package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.domain.Money;
import generator.service.MoneyService;
import generator.mapper.MoneyMapper;
import org.springframework.stereotype.Service;

/**
* @author P0164442
* @description 针对表【money】的数据库操作Service实现
* @createDate 2023-06-25 16:23:43
*/
@Service
public class MoneyServiceImpl extends ServiceImpl<MoneyMapper, Money>
    implements MoneyService{

}





package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.domain.Log;
import generator.service.LogService;
import generator.mapper.LogMapper;
import org.springframework.stereotype.Service;

/**
* @author P0164442
* @description 针对表【log】的数据库操作Service实现
* @createDate 2023-06-25 16:23:43
*/
@Service
public class LogServiceImpl extends ServiceImpl<LogMapper, Log>
    implements LogService{

}





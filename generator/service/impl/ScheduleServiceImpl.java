package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.domain.Schedule;
import generator.service.ScheduleService;
import generator.mapper.ScheduleMapper;
import org.springframework.stereotype.Service;

/**
* @author P0164442
* @description 针对表【schedule】的数据库操作Service实现
* @createDate 2023-06-25 16:23:43
*/
@Service
public class ScheduleServiceImpl extends ServiceImpl<ScheduleMapper, Schedule>
    implements ScheduleService{

}




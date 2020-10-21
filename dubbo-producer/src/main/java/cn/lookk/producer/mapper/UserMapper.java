package cn.lookk.producer.mapper;

import cn.lookk.api.po.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

public interface UserMapper extends BaseMapper<User> {
    Integer update(@Param("user") User user);
}

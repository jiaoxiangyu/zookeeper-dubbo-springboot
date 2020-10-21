package cn.lookk.producer.service.impl;


import cn.lookk.api.po.User;
import cn.lookk.api.service.IUserService;
import cn.lookk.producer.mapper.UserMapper;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ClassName: UserServiceImpl
 * @Description: TODO
 * @Author jiaoxiangyu
 * @Date 2020/10/21
 * @Version 1.0
 * @Since JDK1.8
 */
@Component
@Service(version = "1.0.0", interfaceClass = IUserService.class)
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectById(Long id) {
        return userMapper.selectById(id);
    }
}

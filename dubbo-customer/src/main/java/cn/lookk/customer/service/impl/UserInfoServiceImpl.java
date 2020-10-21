package cn.lookk.customer.service.impl;

import cn.lookk.api.po.User;
import cn.lookk.api.service.IUserService;
import cn.lookk.customer.service.IUserInfoService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

/**
 * @ClassName: UserInfoServiceImpl
 * @Description: TODO
 * @Author jiaoxiangyu
 * @Date 2020/10/21
 * @Version 1.0
 * @Since JDK1.8
 */
@Service
public class UserInfoServiceImpl implements IUserInfoService {

    @Reference(version = "1.0.0", interfaceName = "cn.lookk.api.service.IUserService")
    IUserService userService;

    @Override
    public User selectById(Long id) {
        return userService.selectById(id);
    }
}

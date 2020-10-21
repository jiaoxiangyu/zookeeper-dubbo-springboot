package cn.lookk.customer.service;

import cn.lookk.api.po.User;

public interface IUserInfoService {
    User selectById(Long id);
}

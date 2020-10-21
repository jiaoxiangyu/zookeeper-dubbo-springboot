package cn.lookk.api.service;


import cn.lookk.api.po.User;

public interface IUserService {

    User selectById(Long id);
}

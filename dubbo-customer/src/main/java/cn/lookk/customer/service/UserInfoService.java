package cn.lookk.customer.service;


import cn.lookk.customer.po.User;

public interface UserInfoService {
    int add(User user);

    int update(User user);

    int updateLoginTime(User user);

    int delete(Long id);

    User findOneById(Long id);

    User login(String phone, String pwd);
}

package com.openxu.api.service;

import com.openxu.api.mapper.IUserMapper;
import com.openxu.api.module.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Author: openXu
 * Time: 2022/5/2 23:01
 * class: UserService
 * Description:
 */

@Service
public class UserService implements IUserService {

    @Autowired
    IUserMapper userMapper;

    @Override
    public User regist(User user) {
        System.out.println("Service注册用户:"+user);
        userMapper.regist(user);
        System.out.println("存储成功:"+user);
        return user;
    }

    @Override
    public User login(String account) {
        return null;
    }
}

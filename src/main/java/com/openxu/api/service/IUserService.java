package com.openxu.api.service;

import com.openxu.api.module.User;

/**
 * Author: openXu
 * Time: 2022/5/2 22:49
 * class: IUserService
 * Description:
 */
public interface IUserService {

    User regist(User user);

    User login(String account);


}

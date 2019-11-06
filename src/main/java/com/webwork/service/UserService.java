package com.webwork.service;

import com.webwork.entity.User;

public interface UserService {


    /**
     * 描述：通过username查询用户相关信息
     * author:单和霖
     * Create date 2019-11-16
     */
    User findByUsername(String username);
}

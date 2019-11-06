package com.webwork.service.impl;

import com.webwork.dao.UserDao;
import com.webwork.entity.User;
import com.webwork.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User findByUsername(String username) {


        return userDao.findByUsername( username );
    }
}

package com.webwork.service.impl;

import com.webwork.dao.AdminDao;
import com.webwork.entity.Admin;
import com.webwork.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminDao adminDao;

    @Override
    public int findByUsername(String username, String password) {

        Admin admin=adminDao.findByUserName(username);

        if(admin==null){

            return 0;
        }

        if(admin.getPassword().equals(password)){

            return 1;
        }

        return 0;
    }
}

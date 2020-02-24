package com.webwork.service;

import com.webwork.entity.Admin;

public interface AdminService {

    int findByUsername(String username,String password);
}

package com.webwork.service;


import com.webwork.entity.Student;

public interface StudentService {

    int findByUsername(String username, String password);
}

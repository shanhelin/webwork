package com.webwork.service;

import com.webwork.entity.Teacher;

public interface TeacherService {

    int findByUsername(String username, String password);
}

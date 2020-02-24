package com.webwork.service.impl;

import com.webwork.dao.StudentDao;
import com.webwork.dao.TeacherDao;
import com.webwork.entity.Student;
import com.webwork.entity.Teacher;
import com.webwork.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl implements TeacherService {


    @Autowired
    private TeacherDao teacherDao;

    @Override
    public int findByUsername(String username, String password) {

        Teacher teacher=teacherDao.findByUserName(username);

        if(teacher==null){
            return 0;
        }

        if(teacher.getPassword().equals(password)){

            return 1;
        }

        return 0;
    }
}

package com.webwork.service.impl;

import com.webwork.dao.StudentDao;
import com.webwork.entity.Student;
import com.webwork.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public int findByUsername(String username, String password) {

        Student student=studentDao.findByUserName(username);

        if(student==null){
            return 0;
        }

        if(student.getPassword().equals(password)){

            return 1;
        }

        return 0;
    }

}

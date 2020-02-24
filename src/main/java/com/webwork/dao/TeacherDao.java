package com.webwork.dao;


import com.webwork.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TeacherDao extends JpaRepository<Teacher,Integer> {

    @Query(value="select * from teacher where tea_name=?",nativeQuery=true)
    Teacher findByUserName(String username);
}

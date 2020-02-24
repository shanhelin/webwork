package com.webwork.dao;

import com.webwork.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AdminDao extends JpaRepository<Admin,Integer> {

    @Query(value="select * from admin where username=?",nativeQuery=true)
    Admin findByUserName(String username);
}

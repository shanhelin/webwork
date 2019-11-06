package com.webwork.dao;

import com.webwork.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserDao extends JpaRepository<User,Integer> {


    /**
     * 描述：通过username查询用户的相关信息
     * author:shanhelin
     * Create date 2019-11-6 19:45
     * @param username
     * @return
     */
    @Query(value="select * from user where username=?",nativeQuery=true)
    User findByUsername(String username);



}

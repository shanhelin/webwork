package com.webwork.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * 描述：用户实体
 * author:单和霖
 * Create date 2019-11-6 19:40
 */
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(generator = "a_native")
    // 指定主键生成策略，默认为自增
    @GenericGenerator(name = "a_native", strategy = "native")
    private int id;
    private String username;
    private String password;
    private String  email;
    private String picture;
    private String turename;

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getPicture() {
        return picture;
    }

    public String getTurename() {
        return turename;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public void setTurename(String turename) {
        this.turename = turename;
    }

    @Override
    public  String toString(){

        return "username="+username+" password="+password+"turename"+turename+"picture"+picture;

    }
}


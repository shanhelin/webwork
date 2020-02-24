package com.webwork.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 描述：学生界面映射
 * author：肖存瑞
 * Create date 2020-2-14
 */
@Controller
public class WebStudentController {

    /**
     * 描述：登录界面
     * author：肖存瑞
     * Create date 2020-2-14
     */
    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    /**
     * 描述：学生登录
     * author：肖存瑞
     * Create date 2020-2-14
     */
    @RequestMapping("/indexStudent")
    public String indexStudent(){
        return "index-student";
    }

    /**
     * 描述：选课中心
     * author：肖存瑞
     * Create date 2020-2-14
     */
    @RequestMapping("/courseCenter")
    public String courseCenter(){
        return "index-course-center";
    }

    /**
     * 描述：课表查询
     * author：肖存瑞
     * Create date 2020-2-14
     */
    @RequestMapping("/courseTable")
    public String courseTable(){
        return "course-table";
    }

    /**
     * 描述：已选课程
     * author：肖存瑞
     * Create date 2020-2-14
     */
    @RequestMapping("/courseList")
    public String courseList(){
        return "course-list";
    }





}

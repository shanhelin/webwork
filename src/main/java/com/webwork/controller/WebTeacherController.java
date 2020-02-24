package com.webwork.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 描述：教师页面部分映射
 * author：肖存瑞
 * Create date 2020-2-14
 */
@Controller
public class WebTeacherController {

    /**
     * 描述：教师登录
     * author：肖存瑞
     * Create date 2020-2-14
     */
    @RequestMapping("/indexTeacher")
    public String indexTeacher(){
        return "index-teacher";
    }
}

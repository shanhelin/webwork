package com.webwork.controller;

import com.webwork.service.AdminService;
import com.webwork.service.StudentService;
import com.webwork.service.TeacherService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

    @Autowired
    private TeacherService teacherService;

    @Autowired
    private StudentService studentService;

    @Autowired
    private AdminService adminService;

    @PostMapping("/loginUser")
    @ResponseBody
    public int loginUser(@RequestBody JSONObject jsonParam, HttpServletRequest request){


        String username=jsonParam.getString("username");
        String password=jsonParam.getString("password");
        String ident=jsonParam.getString("ident");

        //为0去student
        if(ident.equals("0")){

            return studentService.findByUsername(username,password);
        }//为1去teacher
        else if(ident.equals("1")){

            return teacherService.findByUsername(username,password);
        }
           //去管理员
            return adminService.findByUsername(username,password);


    }



}

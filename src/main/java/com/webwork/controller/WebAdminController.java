package com.webwork.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 描述：管理员部分映射
 * author：肖存瑞
 * Create date 2020-2-14
 */
@Controller
public class WebAdminController {

    /**
     * 描述：管理员登录
     * author：肖存瑞
     * Create date 2020-2-14
     */
    @RequestMapping("/indexAdmin")
    public String indexAdmin(){
        return "index-admin";
    }

}

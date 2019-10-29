package com.webwork.webController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 描述：项目中网址的跳转链接接口
 * author：yulin
 * Create date 2019-10-23 17:02
 */
@Controller
public class WebController {

    /**
     * 描述：主界面接口
     * author：yulin
     * Create date 2019-10-23
     * @return
     */
    @RequestMapping("/index")
    public String index(){
        return "index.html";
    }

    /**
     * 描述：登录界面
     * author：yulin
     * Create date 2019-10-29 11:51
     */
    @RequestMapping("/login")
    public String login(){
        return "login.html";
    }


}

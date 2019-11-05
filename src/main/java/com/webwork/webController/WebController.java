package com.webwork.webController;

import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 描述：项目中网址的跳转链接接口
 * author：yulin
 * Create date 2019-10-23 17:02
 */
@Controller
public class WebController {

    /**
     * 描述：注册界面
     * author：yulin
     * Create date 2019-10-21
     */
    @RequestMapping("/sign")
    public String sign(){
        return "sign-up";
    }

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

    @RequestMapping("/404")
    public String dsa(){
        return "404.html";
    }

    @RequestMapping("result")
    @ResponseBody
    private String generateWord(HttpServletRequest request) {
        String[] beforeShuffle = new String[] { "2", "3", "4", "5", "6", "7",
                "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
                "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V",
                "W", "X", "Y", "Z" };
        List<String> list = Arrays.asList(beforeShuffle);
        Collections.shuffle(list);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
        }
        String afterShuffle = sb.toString();
        String result = afterShuffle.substring(5, 9);

        //char[] result1=result.toCharArray();
        HttpSession session = request.getSession();
        session.setAttribute("result", result);

        System.out.println("--------------------result="+result);
        return result;
    }

    @ResponseBody
    @RequestMapping(value = "/adminindex/index", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public int getByJSON(@RequestBody JSONObject jsonParam, HttpServletRequest request, Model model, HttpServletResponse response) {
        // 直接将json信息打印出来
        System.out.println("---------开始-----------");

        Administrator administrator2=new Administrator();
        //取出josn中的数据
        administrator2.setAdminpassworld(jsonParam.getString("adminpassworld"));
        administrator2.setAdminusername(jsonParam.getString("adminusername"));
        String code=jsonParam.getString("mytry");
        System.out.println("----------------------mytry="+code);

        HttpSession session = request.getSession();
        String code2 = (String) session.getAttribute("result");
        if(code.equals(code2)){

            System.out.println( jsonParam.getString("adminpassworld") );
            System.out.println( jsonParam.getString("adminusername") );

            return 1;
        }

        return 2;

    }



}

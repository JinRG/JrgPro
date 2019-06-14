package com.example.testgateway.controller.userservice;

import com.example.testapi.service.userservice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {
   /* @Autowired
    private UserService userService;

    @RequestMapping("/test")
    @ResponseBody
    public Map<String,Object> testwebpath(HttpServletResponse response) throws Exception{
            userService.buySomeThing("3");
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("name","jrg");
        map.put("age","18");
        response.setContentType("text/html;charset=UTF-8");
        return map;
    }*/

}

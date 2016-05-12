package com.william.index.controller;

import com.alibaba.fastjson.JSON;
import com.william.index.pojo.User;
import com.william.index.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/index")
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    @ResponseBody
    public String login(@RequestParam("userId") String userId) {
        System.out.println("login");
        User user = userService.getUserByUserId(userId);
        System.out.println(user);
        return JSON.toJSONString(user);
    }

    @RequestMapping
    public String index() {
        return "index";
    }
}

package com.example.demo.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 *
 */
@RestController
@RequestMapping("demo/")
public class DemoController {
    @RequestMapping("home")
    String home(HttpServletRequest request) {
        String userName = "Jef";
        int count = 100;
        return "欢迎您" + userName + "，这是您的第 " + count + " 次登录";

    }

    @PostMapping("/api/auth")
    public String getOrder(@RequestBody String args) {
        //for debug
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return "args : " + args;
    }
}

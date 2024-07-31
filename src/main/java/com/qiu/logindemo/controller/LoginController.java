package com.qiu.logindemo.controller;
import com.qiu.logindemo.service.LoginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : QIU
 * @date : 2024-07-31 18:53
 */
@RestController
public class LoginController {

    @Autowired(required = true)
    public LoginService loginService;

    @GetMapping("/HelloWorld")
    public String login(String username, String password) {
        if(loginService.verfiy(username,password)){
            return "success";
        }else {
            return "fail";
        }
    }
}

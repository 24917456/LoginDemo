package com.qiu.logindemo.service.impl;

import com.qiu.logindemo.service.LoginService;
import org.springframework.stereotype.Service;

/**
 * @author : QIU
 * @date : 2024-07-31 18:54
 */
@Service
public class LoginServiceImpl implements LoginService {
    @Override
    public boolean verfiy(String username, String password) {
        if(username.equals("test") && password.equals("123456")) {
            return true;
        }
        return false;
    }
}

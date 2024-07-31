package com.qiu.logindemo.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author : QIU
 * @date : 2024-07-31 18:52
 * 登入服务
 */
public interface LoginService {
    public boolean verfiy(String username, String password);
}

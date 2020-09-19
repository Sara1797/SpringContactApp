/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.capp.test;

import com.mycompany.capp.config.SpringRootConfig;
import com.mycompany.capp.domain.User;
import com.mycompany.capp.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author manish
 */
public class TestUserServiceRegister {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
        UserService userService = ctx.getBean(UserService.class);
        //the user details will be taken from user-reg-form
        User u = new User();
        u.setName("Nitin");
        u.setPhone("7452333343");
        u.setEmail("Nitin@gmail.com");
        u.setAddress("Hyderabad");
        u.setLoginName("Nitin");
        u.setPassword("Nitin123");
        u.setRole(UserService.ROLE_ADMIN);
        u.setLoginStatus(UserService.LOGIN_STATUS_ACTIVE);
        userService.register(u);

        System.out.println("-------------User Registered Successfully--------------");
    }
}

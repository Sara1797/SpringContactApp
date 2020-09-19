/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.capp.test;

import com.mycompany.capp.config.SpringRootConfig;
import com.mycompany.capp.dao.UserDAO;
import com.mycompany.capp.domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author manish
 */
public class TestUserDAOUpdate {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
        UserDAO userDAO = ctx.getBean(UserDAO.class);
        //the user details will be taken from user profile page
        User u = new User();
        u.setUserid(2);
        u.setName("Amit Sinha");
        u.setPhone("7433333343");
        u.setEmail("amit.sinha@gmail.com");
        u.setAddress("Mumbai, MS");
        u.setLoginName("amit");
        u.setPassword("amit123");
        u.setRole(1);//Admin Role
        u.setLoginStatus(1);//Active
        userDAO.update(u);
        System.out.println("-------------Data Updated--------------");
    }
}

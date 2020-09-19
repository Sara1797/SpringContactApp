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
public class TestUserDAOSave {
    public static void main(String[] args) {
        ApplicationContext ctx =new AnnotationConfigApplicationContext(SpringRootConfig.class);
        UserDAO userDAO=ctx.getBean(UserDAO.class);
        //the user details will be taken from user-reg-form
        User u=new User();
    u.setName("Sumit");
    u.setPhone("7453333343");
    u.setEmail("sumit@gmail.com");
    u.setAddress("Hyderabad");
    u.setLoginName("Sumit");
    u.setPassword("Sumit123");
    u.setRole(1);//Admin Role
    u.setLoginStatus(1);//Active
    userDAO.save(u);
        System.out.println("-------------Data Saved--------------");
    }
}

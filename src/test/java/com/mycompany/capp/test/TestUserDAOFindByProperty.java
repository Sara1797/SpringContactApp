/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.capp.test;

import com.mycompany.capp.config.SpringRootConfig;
import com.mycompany.capp.dao.UserDAO;
import com.mycompany.capp.domain.User;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author manish
 */
public class TestUserDAOFindByProperty {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
        UserDAO userDAO = ctx.getBean(UserDAO.class);
        List<User> users= userDAO.findByProperty("Userid", 1);
        for(User u : users){
            System.out.println(u.getUserid()+" "+u.getName()+" "+u.getRole()); 
            //TODO: Access other columns
        }
       
    }

    public TestUserDAOFindByProperty() {
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.capp.test;

import com.mycompany.capp.config.SpringRootConfig;
import com.mycompany.capp.dao.ContactDAO;
import com.mycompany.capp.domain.Contact;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author manish
 */
public class TestContactDAOSave {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
        ContactDAO contactDAO = ctx.getBean(ContactDAO.class);
        //the user details will be taken from user-reg-form
        Contact c = new Contact();
        c.setUserId(1);
        c.setName("Amit");
        c.setPhone("7433333343");
        c.setEmail("amit@gmail.com");
        c.setAddress("Mumbai");
        c.setRemark("My Friend");
        contactDAO.save(c);
        System.out.println("-------------Data Saved--------------");
    }
}

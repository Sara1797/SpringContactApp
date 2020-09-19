/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.capp.service;

import com.mycompany.capp.dao.BaseDAO;
import com.mycompany.capp.dao.UserDAO;
import com.mycompany.capp.domain.User;
import com.mycompany.capp.exception.UserBlockedException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author manish
 */
@Service
public class UserServiceImpl extends BaseDAO implements UserService{
    
    @Autowired
    private UserDAO userDAO;
 
    @Override
    public void register(User u) {
    userDAO.save(u);
    }

    @Override
    public User login(String loginName, String password) throws UserBlockedException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<User> getUserList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void changeLoginStatus(Integer userid, Integer loginStatus) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

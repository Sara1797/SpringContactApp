package com.mycompany.capp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author manish
 */
@Controller
public class UserController {
    @RequestMapping(value={"/","/index"})
    public String index(){
        return "index"; //JSP - /WEB-INF/view /index.jsp
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.capp.util;

/**
 * This class contains utility methods related to String Operations. 
 * @author manish
 */
public class StringUtil {
    public static String toCommaSeparatedtoString(Object[] items){
        StringBuilder sb = new StringBuilder();
        for(Object item : items){
            sb.append(item).append(",");
        }
        if(sb.length()>0){
            sb.deleteCharAt(sb.length()-1);
        }
        return  sb.toString();
    }
    
}

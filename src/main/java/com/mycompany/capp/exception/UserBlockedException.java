/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.capp.exception;

/**
 *
 * @author manish
 */
public class UserBlockedException extends Exception{
//Creates user obj without err description
    public UserBlockedException() {
    }
    //Creates user obj with error Description
    public UserBlockedException(String errDesc){
        super(errDesc);
    }
}

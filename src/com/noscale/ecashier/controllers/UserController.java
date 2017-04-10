/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.noscale.ecashier.controllers;

import com.noscale.ecashier.views.MainFrame;
import com.noscale.ecashier.views.users.UserFrame;

/**
 *
 * @author rizkikurniawan
 */
public class UserController {
    
    private MainFrame main;
    private UserFrame frame;
    
    public UserController(MainFrame main) {
        
        this.main = main;
        frame = main.getUserFrame();
        
    }
    
}

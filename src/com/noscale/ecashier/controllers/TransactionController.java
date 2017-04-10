/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.noscale.ecashier.controllers;

import com.noscale.ecashier.views.MainFrame;
import com.noscale.ecashier.views.transactions.TransactionFrame;
import javax.swing.JFrame;

/**
 *
 * @author rizkikurniawan
 */
public class TransactionController {
    
    private MainFrame main;
    private TransactionFrame frame;
    
    public TransactionController(MainFrame main) {
        this.main = main;
    }
    
    public void initLayout() {
        
        frame = main.getTransFrame();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
    }
    
}

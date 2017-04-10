/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.noscale.ecashier.controllers;

import com.noscale.ecashier.views.MainFrame;
import com.noscale.ecashier.views.items.ItemFrame;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author rizkikurniawan
 */
public class ItemController {
  
    private MainFrame main;
    private ItemFrame frame;
    
    public ItemController(MainFrame main) {
        this.main = main;
    }
    
    public void initLayout() {
        
        frame = main.getItemFrame();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
    }
    
}

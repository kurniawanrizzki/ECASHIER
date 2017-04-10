/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.noscale.ecashier.controllers;

import com.noscale.ecashier.views.MainFrame;
import com.noscale.ecashier.views.suppliers.SupplierFrame;

/**
 *
 * @author rizkikurniawan
 */
public class SupplierController {
    
    private MainFrame main;
    private SupplierFrame frame;
    
    public SupplierController(MainFrame main) {
        this.main = main;
        this.frame = main.getSupplierFrame();
    }
    
}

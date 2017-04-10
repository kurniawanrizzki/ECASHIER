package com.noscale.ecashier.controllers;

import com.noscale.ecashier.listeners.MainMenuListener;
import com.noscale.ecashier.utilities.Global;
import com.noscale.ecashier.views.MainFrame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

/**
 * Created by kurniawanrizzki on 24/03/17.
 */
public class MainController {

    private MainFrame main;
    
    public MainController(MainFrame main) {
        
        this.main = main;
        initLayout();
        initEvent();
        
    }
   
    public void showPage(String key, boolean isShowing) {
        
        switch(key) {
            
            case Global.PRODUCT_BIG_PANEL : 
                
                main.getItemFrame().setVisible(isShowing);
                break;
                
            case Global.SELL_BIG_PANEL : 
                
                main.getTransFrame().setVisible(isShowing);
                break;
                
            case Global.SUPPLIER_BIG_PANEL : 
                
                main.getSupplierFrame().setVisible(isShowing);
                break;
                
            case Global.REPORT_BIG_PANEL : 
                
                main.getReportFrame().setVisible(isShowing);
                break;
                
            default:break;
            
        }
        
        main.setVisible(!isShowing);

        if (isShowing) {
            
            main.dispose();
            
        }
        
    }
    
    private void initLayout() {
        
        main.getTitlePanel().setName(Global.TITLE_PANEL);
        main.getFooterPanel().setName(Global.FOOTER_PANEL);
        
        main.getProductSmallPanel().setName(Global.PRODUCT_SMALL_PANEL);
        main.getProductBigPanel().setName(Global.PRODUCT_BIG_PANEL);
        
        main.getSellSmallPanel().setName(Global.SELL_SMALL_PANEL);
        main.getSellBigPanel().setName(Global.SELL_BIG_PANEL);
        
        main.getSupplierSmallPanel().setName(Global.SUPPLIER_SMALL_PANEL);
        main.getSupplierBigPanel().setName(Global.SUPPLIER_BIG_PANEL);
        
        main.getReportSmallPanel().setName(Global.REPORT_SMALL_PANEL);
        main.getReportBigPanel().setName(Global.REPORT_BIG_PANEL);
        
        main.getProductBigPanel().setVisible(false);
        main.getSellBigPanel().setVisible(false);
        main.getSupplierBigPanel().setVisible(false);   
        main.getReportBigPanel().setVisible(false);
        
    }
    
    private void initEvent() {
        
        MainMenuListener menuListener = new MainMenuListener(main);
        
        main.addMouseListener(menuListener);
        
        main.getProductSmallPanel().addMouseListener(menuListener);
        main.getProductBigPanel().addMouseListener(menuListener);

        main.getSellSmallPanel().addMouseListener(menuListener);
        main.getSellBigPanel().addMouseListener(menuListener);
        
        main.getReportSmallPanel().addMouseListener(menuListener);
        main.getReportBigPanel().addMouseListener(menuListener);
        
        main.getSupplierSmallPanel().addMouseListener(menuListener);
        main.getSupplierBigPanel().addMouseListener(menuListener);
        
        main.getFooterPanel().addMouseListener(menuListener);
        main.getTitlePanel().addMouseListener(menuListener);
        
    }
    
}

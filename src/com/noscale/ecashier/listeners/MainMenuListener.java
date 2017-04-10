/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.noscale.ecashier.listeners;

import com.noscale.ecashier.utilities.Global;
import com.noscale.ecashier.views.MainFrame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author rizkikurniawan
 */
public class MainMenuListener implements MouseListener{
    
    private MainFrame form;
    
    public MainMenuListener(MainFrame form) {
        this.form = form;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
        JPanel panel = (JPanel) e.getSource();
        form.getController().showPage(panel.getName(), true);
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
        if (e.getSource() instanceof JPanel) {
            
            JPanel panel = (JPanel) e.getSource();
        
            if (!panel.getName().contains("BIG")) {
                
                switch (panel.getName()) {

                    case Global.PRODUCT_SMALL_PANEL :
                        animateMenuToogle(true, false, false, false);
                        break;
                    case Global.SELL_SMALL_PANEL :
                        animateMenuToogle(false, true, false, false);
                        break;
                    case Global.SUPPLIER_SMALL_PANEL :
                        animateMenuToogle(false, false, true, false);
                        break;
                    case Global.REPORT_SMALL_PANEL :
                        animateMenuToogle(false, false, false, true);
                        break;
                    default:
                        animateMenuToogle(false, false, false, false);
                        break;

                } 
                
            }
            
        }
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
       
        if (e.getSource() instanceof JFrame) {
            animateMenuToogle(false, false, false, false);
        }
        
    }
    
    public void animateMenuToogle(boolean isProductVisible, boolean isSellVisible, boolean isSupplierVisible, boolean isReportVisible) {
        
        form.getProductBigPanel().setVisible(isProductVisible);
        form.getProductSmallPanel().setVisible(!isProductVisible);

        form.getSellBigPanel().setVisible(isSellVisible);
        form.getSellSmallPanel().setVisible(!isSellVisible);

        form.getSupplierBigPanel().setVisible(isSupplierVisible);
        form.getSupplierSmallPanel().setVisible(!isSupplierVisible);

        form.getReportBigPanel().setVisible(isReportVisible);
        form.getReportSmallPanel().setVisible(!isReportVisible);
        
    }
    
}

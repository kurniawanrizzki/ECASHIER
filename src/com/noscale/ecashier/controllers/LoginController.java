package com.noscale.ecashier.controllers;

import com.noscale.ecashier.utilities.Global;
import com.noscale.ecashier.views.LoginFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTextField;

/**
 * Created by rizkikurniawan on 09/04/17.
 */
public class LoginController {
    
    private LoginFrame loginFrame;

    public LoginController() {
        
        loginFrame = new LoginFrame();
        loginFrame.getOverlayPanel().setBackground(Global.TRANSPARENT);

        initEvent();
        
    }
    
    public void showPage() {
        loginFrame.setVisible(true);
    }
    
    public void login() {

    }

    public void logout() {

    }
    
    private void initEvent() {
        
        loginFrame.getUsernameField().addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                
                paintFocusGained(
                        loginFrame.getUsernameField(), 
                        loginFrame.getUsernameTxt(), 
                        loginFrame.getUsernameSeparator()
                );
                                
            }

            @Override
            public void focusLost(FocusEvent e) {
                
                paintFocusLost(
                        loginFrame.getUsernameField(), 
                        loginFrame.getUsernameTxt(), 
                        loginFrame.getUsernameSeparator()
                );
                
            }
        });
        
       loginFrame.getPasswordField().addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                
                paintFocusGained(
                        loginFrame.getPasswordField(), 
                        loginFrame.getPasswordTxt(), 
                        loginFrame.getPasswordSeparator()
                );
                
            }

            @Override
            public void focusLost(FocusEvent e) {
                
                paintFocusLost(
                        loginFrame.getPasswordField(), 
                        loginFrame.getPasswordTxt(), 
                        loginFrame.getPasswordSeparator()
                );
                
            }
        });
       
       loginFrame.getCloseTxt().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                closeForm();
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });
       
       loginFrame.getLoginButton().addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                
                paintFocusLost(
                        loginFrame.getPasswordField(), 
                        loginFrame.getPasswordTxt(), 
                        loginFrame.getPasswordSeparator()
                );
                
                paintFocusLost(
                        loginFrame.getUsernameField(), 
                        loginFrame.getUsernameTxt(), 
                        loginFrame.getUsernameSeparator()
                );
                
            }

            @Override
            public void focusLost(FocusEvent e) {
            }
        });
       
       loginFrame.getLoginButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                closeForm();
                loginFrame.getMainFrame().getController().showPage(Global.MAIN_PANEL, false);
            }
        });
        
    }
    
    private void paintFocusGained(JTextField field, JLabel label, JSeparator separator) {
        
        separator.setBackground(Global.WHITE);
        label.setForeground(Global.WHITE);
        field.setForeground(Global.WHITE);
 
    }
    
    private void paintFocusLost(JTextField field, JLabel label, JSeparator separator) {
        
        separator.setBackground(Global.BLUE_APP);
        label.setForeground(Global.BLUE_APP);
        field.setForeground(Global.BLUE_APP);
        
    }
    
    private void closeForm() {
        
        loginFrame.setVisible(false);
        loginFrame.dispose();
    
    }

}

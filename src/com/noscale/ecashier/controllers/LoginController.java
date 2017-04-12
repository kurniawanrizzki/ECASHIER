package com.noscale.ecashier.controllers;

import com.noscale.ecashier.views.login.LoginForm;
import java.awt.Color;

/**
 * Created by rizkikurniawan on 09/04/17.
 */
public class LoginController {
    
    private LoginForm form;

    public LoginController(LoginForm form) {
        this.form = form;
    }

    public void login() {

    }

    public void logout() {
        form.setVisible(true);
    }
    
    public void paintUsernameField(Color gainColor, Color separatorColor) {
        form.getUsernaField().setBackground(gainColor);
        form.getUsernameTxt().setBackground(gainColor);
        form.getUsernameSeparator().setBackground(separatorColor);
    }
    
    public void paintPasswordField(Color gainColor, Color separatorColor) {
        form.getPasswordField().setBackground(gainColor);
        form.getPasswordTxt().setBackground(gainColor);
        form.getPasswordSeparator().setBackground(separatorColor);
    }
    

}

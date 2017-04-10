package com.noscale.ecashier.controllers;

import com.noscale.ecashier.Main;
import com.noscale.ecashier.utilities.Global;
import com.noscale.ecashier.views.MainForm;
import com.noscale.ecashier.views.login.LoginForm;

/**
 * Created by kurniawanrizzki on 24/03/17.
 */
public class MainController {

    private LoginForm loginForm;
    private MainForm mainForm;
    
    public MainController() {
        initPage();
    }

    private void initPage() {
        loginForm = new LoginForm(this);
        mainForm = new MainForm(this);
    }

    /**
     * Show page
     * @param pageIndex fill this param with intended page
     * @param data fill this param with the data, optional
     */
    public void showPage(int pageIndex, Object data) {

        switch (pageIndex) {

            case Global.LOGIN_PAGE :
                loginForm.setVisible(true);
                mainForm.setVisible(false);
                break;

            case Global.REGISTER_PAGE :
                break;

            case Global.SINGLE_USER_PAGE :
                break;

            case Global.MANAGE_USER_PAGE :
                break;

            case Global.LOGIN_FORM_PAGE :
                break;

            case Global.LOG_PAGE :
                break;

            case Global.ITEM_PAGE :
                break;

            case Global.ITEM_FORM_PAGE :
                break;

            case Global.SUPPLIER_PAGE :
                break;

            case Global.SUPPLIER_FORM_PAGE :
                break;

            case Global.TRANSACTION_PAGE :
                break;

            case Global.TRANSACTION_FORM_PAGE :
                break;

            default: 
                mainForm.setVisible(true);
                loginForm.setVisible(false);
                break;

        }

    }

    public LoginForm getLoginForm() {
        return loginForm;
    }
    
    public MainForm getMainForm() {
        return mainForm;
    }

}

package com.noscale.ecashier.controllers;

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
        mainForm = new MainForm(this);
        loginForm = new LoginForm();
    }

    /**
     * Show page
     * @param pageIndex fill this param with intended page
     */
    public void showPage(int pageIndex) {
        switch (pageIndex) {
            case Global.HOME_PAGE :
                break;
            case Global.ITEM_PAGE :
                break;
            case Global.TRANSACTION_PAGE :
                break;
            case Global.SUPPLIER_PAGE :
                break;
            case Global.REPORT_PAGE :
                break;
            default:break;
        }
    }

    public LoginForm getLoginForm() {
        return loginForm;
    }
    
    public MainForm getMainForm() {
        return mainForm;
    }

}

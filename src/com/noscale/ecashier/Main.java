package com.noscale.ecashier;

import com.noscale.ecashier.controllers.MainController;
import com.noscale.ecashier.models.Login;
import com.noscale.ecashier.utilities.SampleData;
import com.noscale.ecashier.utilities.connector.ECashierDB;
import java.sql.SQLException;

/**
 * Created by kurniawanrizzki on 24/03/17.
 */
public class Main {

    private static MainController mainController;

    public static void main(String[] args) {

        try {

            ECashierDB eCashierDB = new ECashierDB();
            eCashierDB.open();
            
            mainController = new MainController();            
            mainController.getLoginForm().setVisible(true);

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public MainController getMainController() {
        return mainController;
    }

}

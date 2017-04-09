package com.noscale.ecashier;

import com.noscale.ecashier.controllers.MainController;
import com.noscale.ecashier.models.Login;
import com.noscale.ecashier.utilities.SampleData;
import com.noscale.ecashier.utilities.connector.ECashierDB;

import java.sql.SQLException;

/**
 * Created by kurniawanrizzki on 24/03/17.
 */
public class main {

    private MainController mainController;

    public static void main(String[] args) {

        try {

            ECashierDB eCashierDB = new ECashierDB();
            eCashierDB.open();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    private void initData() {
        mainController = new MainController();
    }

    public MainController getMainController() {
        return mainController;
    }

}

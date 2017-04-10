package com.noscale.ecashier;

import com.noscale.ecashier.controllers.LoginController;
import com.noscale.ecashier.utilities.connector.ECashierDB;
import java.sql.SQLException;

/**
 * Created by kurniawanrizzki on 24/03/17.
 */
public class Main {

    public static void main(String[] args) {

        try {

            ECashierDB eCashierDB = new ECashierDB();
            eCashierDB.open();
            
            LoginController controller = new LoginController();
            controller.showPage();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}

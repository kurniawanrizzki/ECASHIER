package com.noscale.ecashier.databases;

import com.noscale.ecashier.models.User;
import com.noscale.ecashier.utilities.TrippleDES;
import com.noscale.ecashier.utilities.connector.Database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 * Login table
 * Created by kurniawanrizzki on 26/03/17.
 */
public class LoginTable extends Database {

    @Override
    public long insertNewEntry(Object object) throws SQLException {

        long id = 0;

        String query = buildInsertQuery(
                LOGIN_TABLE,
                new String[]
                        {
                                USERNAME_COLUMN,
                                NAME_COLUMN,
                                PASSWORD_COLUMN,
                                LEVEL_COLUMN,
                                CREATED_BY_COLUMN
                        }
                );

        PreparedStatement statement = getPreparedStatement(object, query);
        statement.executeUpdate();

        ResultSet rs = statement.getGeneratedKeys();

        if (rs.next()){
            id =rs.getInt(1);
        }

        statement.close();

        return id;

    }

    @Override
    public List<?> getAllEntries() {
        return null;
    }

    @Override
    public Object getObject(ResultSet result) {
        return null;
    }

    public PreparedStatement getPreparedStatement(Object object, String query) throws SQLException {

        PreparedStatement statement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

        User login = (User) object;

        statement.setString(1, login.getUsername());
        statement.setString(2, login.getName());
        statement.setString(3, login.getPassword());
        statement.setInt(4, login.getLevel());
        statement.setInt(5, login.getCreatedBy());

        return statement;

    }

    /**
     * Get authenticate user
     * @param username username account
     * @param password password account
     * @return #Login
     */
    public User getAuthenticateUser(String username, String password) {

        User account = null;
        String encryptedPass = TrippleDES.getInstance().encrypt(password);

        String query = buildSelectQuery(
                LOGIN_TABLE,
                new String[]{ID_COLUMN, USERNAME_COLUMN, PASSWORD_COLUMN ,NAME_COLUMN, LEVEL_COLUMN},
                null,
                USERNAME_COLUMN+" = ? AND "+PASSWORD_COLUMN+" = ? AND "+IS_DELETED_COLUMN+" < ?",
                new String[]{username, encryptedPass, "1"},
                null,
                null
                );

        try {

            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet set = statement.executeQuery();

            set.first();

            account = new User();
            account.setId(set.getInt(1));
            account.setUsername(set.getString(2));
            account.setPassword(set.getString(3));
            account.setName(set.getString(4));
            account.setLevel(set.getInt(5));

            set.close();
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return account;
    }

}

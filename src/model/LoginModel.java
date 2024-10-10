package model;

import java.sql.*;

import controller.*;

public class LoginModel {
    public static boolean loginUser(String email, String password) {
        try {
            Connection connection = MySQLConnector.connection();
            String strSqlLogin = "SELECT * FROM `" + InterfaceController.dbPadrao + "`.`" + InterfaceController.tblPadrao + "`" + " WHERE `email` = '" + email + "' and `password` = '" + password + "';";
            System.out.println(strSqlLogin);
            Statement stmSqlLogin = connection.createStatement();
            ResultSet rstSqlLogin = stmSqlLogin.executeQuery(strSqlLogin);
            if (rstSqlLogin.next()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }

    }
}
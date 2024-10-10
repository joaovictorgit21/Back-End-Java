package model;

import java.sql.*;

import controller.*;

public class RegisterModel {
    public static String registerUser(String name, String email, String password) {
        String retorno = "Nada aconteceu ainda...";
        try {
            Connection connection = MySQLConnector.connection();
            String strSqlInsereRegistro = "INSERT INTO `" + InterfaceController.dbPadrao + "`.`" + InterfaceController.tblPadrao + "` (`" + name + "`, `" + email + "`, `" + password + "`)  VALUES ('" + name + "', '" + email + "', '" + password + "');";
            Statement stmSqlInsereRegistro = connection.createStatement(); 

            stmSqlInsereRegistro.addBatch(strSqlInsereRegistro);
            stmSqlInsereRegistro.executeBatch();
            stmSqlInsereRegistro.close();

            retorno = "Registro inserido com sucesso";
            System.out.println(retorno);
            
        } catch (Exception e) {
            retorno = "Opsss!! Ocorreu um erro"+ e;
            System.out.println(retorno);
        }
        return retorno;
    }
}

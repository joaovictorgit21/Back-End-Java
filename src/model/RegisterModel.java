package model;

import java.sql.Connection;
import java.sql.Statement;
import controller.*;

public class RegisterModel {

    public static String registerUser(String name, String email, String password, String profileImage) {
        String retorno = "Nada aconteceu ainda...";
        try {
            // Conectando ao banco de dados
            Connection connection = MySQLConnector.connection();
            
            // Criando a query de inserção, incluindo a imagem de perfil
            String strSqlInsereRegistro = "INSERT INTO `" + InterfaceController.dbPadrao + "`.`" + InterfaceController.tblPadrao + "` (`name`, `email`, `password`, `profile_image`)  VALUES ('" + name + "', '" + email + "', '" + password + "', '" + profileImage + "');";
            
            // Criando statement para executar a query
            Statement stmSqlInsereRegistro = connection.createStatement(); 

            // Adicionando a query ao batch e executando
            stmSqlInsereRegistro.addBatch(strSqlInsereRegistro);
            stmSqlInsereRegistro.executeBatch();
            stmSqlInsereRegistro.close();

            retorno = "Registro inserido com sucesso";
            System.out.println(retorno);
            
        } catch (Exception e) {
            retorno = "Opsss!! Ocorreu um erro: " + e.getMessage();
            System.out.println(retorno);
        }
        return retorno;
    }
}





// package model;

// import java.sql.*;

// import controller.*;

// public class RegisterModel {
//     public static String registerUser(String name, String email, String password) {
//         String retorno = "Nada aconteceu ainda...";
//         try {
//             Connection connection = MySQLConnector.connection();
//             String strSqlInsereRegistro = "INSERT INTO `" + InterfaceController.dbPadrao + "`.`" + InterfaceController.tblPadrao + "` (`" + name + "`, `" + email + "`, `" + password + "`)  VALUES ('" + name + "', '" + email + "', '" + password + "');";
//             Statement stmSqlInsereRegistro = connection.createStatement(); 

//             stmSqlInsereRegistro.addBatch(strSqlInsereRegistro);
//             stmSqlInsereRegistro.executeBatch();
//             stmSqlInsereRegistro.close();

//             retorno = "Registro inserido com sucesso";
//             System.out.println(retorno);
            
//         } catch (Exception e) {
//             retorno = "Opsss!! Ocorreu um erro"+ e;
//             System.out.println(retorno);
//         }
//         return retorno;
//     }
// }

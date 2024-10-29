package model;

import java.sql.*;

public class MySQLConnector {
    public static Connection connection() {
        // String status = "Nada aconteceu ainda...";
        // String mysqlHost = "localhost";
        // String mysqlDb = "db_mysql_connector";
        // String mysqlUser = "root";
        // String mysqlPassword = "senac@02";
        // String mysqlPort = "3306";
        String status = "Nada aconteceu ainda...";
        String mysqlHost = "localhost";
        String mysqlDb = "db_mysql_connector";
        String mysqlUser = "root";
        String mysqlPassword = "";
        String mysqlPort = "3306";
        String mysqlUrl = "jdbc:mysql://" + mysqlHost + ":" + mysqlPort + "/" + mysqlDb + "?user=" + mysqlUser + "&password=" + mysqlPassword;

        Connection conn = null;

        System.out.println("URL do banco de dados: " + mysqlUrl);
        System.out.println("Usuário: " + mysqlUser);
        System.out.println("Senha: " + mysqlPassword);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            conn = DriverManager.getConnection(mysqlUrl);
            status = "Conexão realizada com Sucesso!!";
        } catch (SQLException e) {
            status = "Opeesssss!!! Algo de errado não está certo com a conexão com o banco de dados MySQL!! Mensagem do servidor: " + e;
        } catch (Exception e) {
            status = "Opeesssss!!! Algo de errado não está certo com a conexão com o banco de dados MySQL!! Mensagem do servidor: " + e;
        }

        System.out.println(status);
        return conn;
    }
}
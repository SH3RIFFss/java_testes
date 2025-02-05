package CONECTION;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    // Declaraçao dos dados de login no banco de dados
    private static final String url = "jdbc:mysql://localhost:3306/empresa2";
    private static final String user = "root";
    private static final String passw = "Cud3cachorro!";

    // Estabelecimento da conexao com o banco de dados
    private static Connection conn;

    public static Connection getConexao() {
        try {
            if (conn == null) {
                conn = DriverManager.getConnection(url, user, passw);
                return conn;
            } else {
                return conn;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}

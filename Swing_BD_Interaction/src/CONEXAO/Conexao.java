package CONEXAO;
import java.sql.*;

public class Conexao {
    private static final String url ="jdbc:mysql://localhost:3306/empresa2";
    private static final String  user="root";
    private static final String  pasw="Cud3cachorro!";
    private static Connection conn;
    public static Connection getConexao(){
        try {
            if (conn==null) {
                conn=DriverManager.getConnection(url, user, pasw);
                System.out.println("conexao concluida !");
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
package DAO;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import CONECTION.Conexao;
import entity.Users;

public class userDAO {
        public void loginUser(Users user){
            String sql="INSERT INTO PRODUTOS(NOME,EMAIL,SENHA) VALUES(?,?,?)";
            PreparedStatement ps=null;
            try {
                ps=Conexao.getConexao().prepareStatement(sql);
                ps.setString(1, user.getName());
                ps.setString(2, user.getEmail());
                ps.setString(3, user.getPassw());
                ps.execute();
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
}

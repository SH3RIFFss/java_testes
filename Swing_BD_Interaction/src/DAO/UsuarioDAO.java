package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import CONEXAO.Conexao;
import ENTIDADE.Usuario;

public class UsuarioDAO {
    public void loginUser(Usuario user){
        String sql="INSERT INTO PRODUTOS(NOME,EMAIL,SENHA) VALUES(?,?,?)";
        PreparedStatement ps=null;
        try {
            ps=Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, user.getName());
            ps.setString(2, user.getEmail());
            ps.setString(3, user.getPasw());
            System.out.println("Dados cadastrados !");
            ps.execute();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

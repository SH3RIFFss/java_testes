import DAO.UsuarioDAO;
import ENTIDADE.Usuario;

public class App {
    public static void main(String[] args) throws Exception {
        //descriçao do objeto
        Usuario u=new Usuario();
        u.setName("andre oliveira");
        u.setEmail("andOL@gmail.com");
        u.setPasw("andol123");

        new UsuarioDAO().loginUser(u);
    }
}

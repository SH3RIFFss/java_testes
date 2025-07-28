import DAO.userDAO;
import entity.Users;


public class App {
    public static void main(String[] args) throws Exception {
        
        Users u=new Users();
        u.setName("magno");
        u.setEmail("bruxoMagno@gmail.com");
        u.setPassw("BRux0007");

        new userDAO().loginUser(u);
    }
}

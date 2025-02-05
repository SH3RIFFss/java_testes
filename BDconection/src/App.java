import DAO.userDAO;
import entity.Users;


public class App {
    public static void main(String[] args) throws Exception {
        
        Users u=new Users();
        u.setName("eduardo ramos");
        u.setEmail("eduram@gmail.com");
        u.setPassw("kurir1");

        new userDAO().loginUser(u);
    }
}

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class App {
    public static void main(String[] args) throws Exception {
        Connection c1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/mercado","root","Cud3cachorro!");
        Statement st = c1.createStatement();
        st.executeUpdate("insert into cliente values(5,'steve','m', 'steve@gmail.com')");
        st.close();
        c1.close();
    }
}

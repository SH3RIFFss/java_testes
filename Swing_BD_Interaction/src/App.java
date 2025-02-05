import DAO.UsuarioDAO;
import ENTIDADE.Usuario;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.*;


public class App {
    public static void main(String[] args) throws Exception {
        JFrame window = new JFrame("Login com banco de dados");

        JLabel tit = new JLabel("Digite seus dados");
        tit.setBounds(100, 20, 150, 30);
        window.add(tit);

        JLabel nameLabel = new JLabel("NOME");
        nameLabel.setBounds(30, 50, 50, 30);
        window.add(nameLabel);

        JTextArea nameTextArea = new JTextArea();
        nameTextArea.setBounds(10, 80, 150, 20);
        window.add(nameTextArea);

        JLabel emailLabel = new JLabel("EMAIL");
        emailLabel.setBounds(30, 100, 50, 30);
        window.add(emailLabel);

        JTextArea emailTextArea = new JTextArea();
        emailTextArea.setBounds(10, 130, 150, 20);
        window.add(emailTextArea);

        JLabel passwLabel = new JLabel("SENHA");
        passwLabel.setBounds(30, 150, 50, 30);
        window.add(passwLabel);

        JTextArea passwTextArea = new JTextArea();
        passwTextArea.setBounds(10, 180, 150, 20);
        window.add(passwTextArea);

        JButton btnLogin = new JButton("Login");
        btnLogin.setBounds(100, 220, 100, 30);
        window.add(btnLogin);

        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Usuario u = new Usuario();
                String nameValue = nameTextArea.getText();
                String emailValue = emailTextArea.getText();
                String passwlValue = passwTextArea.getText();
               
                u.setName(nameValue);
                u.setEmail(emailValue);
                u.setPasw(passwlValue);

                new UsuarioDAO().loginUser(u);
            }
        });

        window.setLayout(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setBounds(300, 300, 300, 300);
        window.setVisible(true);

        // descriçao do objeto

    }
}

import javax.swing.*;
import java.awt.event.*;

// import java.awt.event.ActionEvent;
public class App {
    public static void main(String[] args) throws Exception {
        JFrame janela = new JFrame();

        // conteudo da janela
        JButton btn = new JButton("Login");
        JLabel txtUsuario = new JLabel("Usuario");
        JLabel txtSenha = new JLabel("Senha");
        JTextArea usuario = new JTextArea();
        JPasswordField senha = new JPasswordField();
        txtUsuario.setBounds(50, 100, 100, 30);
        usuario.setBounds(50, 130, 100, 30);
        txtSenha.setBounds(50, 200, 100, 30);
        senha.setBounds(50, 230, 100, 30);
        btn.setBounds(50, 300, 100, 30);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usr=usuario.getText();
                String snh=new String(senha.getPassword());
                System.out.printf("Logado com ususario: %s\nsenha %s: ",usr,snh);
            }
        });
        janela.setLayout(null);
        janela.add(txtUsuario);
        janela.add(usuario);
        janela.add(senha);
        janela.add(txtSenha);
        janela.add(btn);

        // tamanho da janela
        janela.setBounds(50, 50, 300, 500);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);

    }
}

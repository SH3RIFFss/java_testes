import javax.swing.*; //biblioteca de janela.
import java.awt.event.*; //biblioteca de eventos.

// import java.awt.event.ActionEvent;
public class App {
    public static void main(String[] args) throws Exception {
        JFrame janela = new JFrame(); //deifiniçao da janela com a biblioteca.

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
        btn.addActionListener(new ActionListener() {  //definiçao da açao do botao com a biblioteca.
            @Override
            public void actionPerformed(ActionEvent e) {
                String usr=usuario.getText();  //para captuarar o conteudo da textArea.
                String snh=new String(senha.getPassword()); //para capturar o conteudo do passwordField.
                System.out.printf("Logado com ususario: %s\nsenha %s: ",usr,snh);
            }
        });
        janela.setLayout(null);  //para definir a ocupaçao dos itens com a biblioteca.
        janela.add(txtUsuario);
        janela.add(usuario);
        janela.add(senha);
        janela.add(txtSenha);
        janela.add(btn);

        // tamanho da janela
        janela.setBounds(50, 50, 300, 500); //para definir otamanho de um item com a biblioteca.
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //para definir o encerramento do programa com o fechamento da janela com a biblioteca.
        janela.setVisible(true);

    }
}

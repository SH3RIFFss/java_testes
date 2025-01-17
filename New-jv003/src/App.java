import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class App {
    public static void main(String[] args) throws Exception {
        // definiçao da janela
        JFrame janela = new JFrame("calculadora");
        // Definiçao dos campos de texto
        JLabel titulo = new JLabel("Digite e escolha as açoes !");
        titulo.setBounds(50, 80, 200, 100);
        janela.add(titulo);
        JTextArea txt1 = new JTextArea();
        txt1.setBounds(50, 150, 30, 40);
        janela.add(txt1);
        JLabel lb1 = new JLabel("=");
        lb1.setBounds(150, 150, 30, 40);
        janela.add(lb1);
        JTextArea txt2 = new JTextArea();
        txt2.setBounds(110, 150, 30, 40);
        janela.add(txt2);
        JButton btnSom = new JButton("+");
        btnSom.setBounds(15, 200, 45, 40);
        janela.add(btnSom);
        JButton btnSub = new JButton("-");
        btnSub.setBounds(60, 200, 40, 40);
        janela.add(btnSub);
        JButton btnMut = new JButton("x");
        btnMut.setBounds(100, 200, 40, 40);
        janela.add(btnMut);
        JButton btndiv = new JButton("/");
        btndiv.setBounds(140, 200, 45, 40);
        janela.add(btndiv);
        JLabel lbRes = new JLabel("0");
        lbRes.setBounds(180, 150, 300, 40);
        janela.add(lbRes);
        // Logica de funcionamento
        btnSom.addActionListener (new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int numb1 = Integer.parseInt(txt1.getText());
                int numb2 = Integer.parseInt(txt2.getText());
                int res = numb1 + numb2;
                lbRes.setText(Integer.toString(res));
            }
        });
        btnSub.addActionListener (new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int numb1 = Integer.parseInt(txt1.getText());
                int numb2 = Integer.parseInt(txt2.getText());
                int res = numb1 - numb2;
                lbRes.setText(Integer.toString(res));
            }
        });
        btnMut.addActionListener (new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int numb1 = Integer.parseInt(txt1.getText());
                int numb2 = Integer.parseInt(txt2.getText());
                int res = numb1 * numb2;
                lbRes.setText(Integer.toString(res));
            }
        });
        btndiv.addActionListener (new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int numb1 = Integer.parseInt(txt1.getText());
                int numb2 = Integer.parseInt(txt2.getText());
                int res = numb1 / numb2;
                lbRes.setText(Integer.toString(res));
            }
        });

        //Implantaçao da janela
        janela.setLayout(null);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setBounds(200, 100, 300, 400);
        janela.setVisible(true);
    }
}

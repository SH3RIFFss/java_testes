import java.util.*;
import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
        //definiçao da janela 
        JFrame janela = new JFrame("calculadora");
        // Definiçao dos campos de texto
        JLabel titulo=new JLabel("Digite para somar");
        titulo.setBounds(50,80,100,100);
        janela.add(titulo);
        JTextArea txt1=new JTextArea();
        txt1.setBounds(50, 150, 30, 40);
        janela.add(txt1);
        JLabel lb1=new JLabel("+");
        lb1.setBounds(90,150,30,40);
        janela.add(lb1);
        JTextArea txt2=new JTextArea();
        txt2.setBounds(110,150,30,40);
        janela.add(txt2);
        JButton btnSoma=new JButton("=");
        btnSoma.setBounds(160,150,50,40);
        janela.add(btnSoma);
        JLabel lbRes=new JLabel("0");
        lbRes.setBounds(220,150,30,40);
        janela.add(lbRes);
        // Logica de funcionamento
        int numb1=Integer.parseInt(txt1.getText());
        int numb2=Integer.parseInt(txt2.getText());
        int res=numb1+numb2;
        lbRes.setText(Integer.toString(res));
        // Adiçao dos itens para a janela
        janela.setLayout(null);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setBounds(200, 100, 300, 400);
        janela.setVisible(true);
    }
}

import javax.swing.*;
import java.util.*;
import java.awt.*;

public class App {
    public static void main(String[] args) throws Exception {
        // D eclaraçao da janela
        JFrame janela=new JFrame("Calcudor de idade");
        // Decaraçao e implantadao dos itens na janela
        JLabel tit=new JLabel("digite seu ano de nacimento !");
        tit.setBounds(50,50,200,50);
        janela.add(tit);
        JSpinner id=new JSpinner();
        id.setBounds(50,100,50,20);
        janela.add(id);

        // Logida de funcionamento
        Toolkit resolucao=Toolkit.getDefaultToolkit(); //Obtém o Toolkit padrão.
        Dimension dimençaoTela=resolucao.getScreenSize(); //Obtém a dimensão da tela.
        int resLar= dimençaoTela.width; //obtém a largura da tela.
        int resAlt= dimençaoTela.height; //obtém a altura da tela.
        int largura=resLar/2;
        int altura=resAlt/2;
        // IMplantaçao da janela
        janela.setLayout(null);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setBounds(largura,altura,300,300);
        janela.setVisible(true);
    }
}

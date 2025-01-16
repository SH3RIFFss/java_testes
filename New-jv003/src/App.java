import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.BorderLayout;
// import java.util.*;
// import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
public class App {
    public static void main(String[] args) throws Exception {
       JFrame janela=new JFrame("janela com imagem");
       janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       try {
        BufferedImage imagem=ImageIO.read (new File("src\\imagem\\stormtrooper.jpg"));
        ImageIcon icone=new ImageIcon(imagem);
        JLabel label= new JLabel(icone);
        JLabel labeltxt=new JLabel("fala, fela !");
        JButton btn=new JButton("Clique Aqui");
        btn.setSize(120, 30);
        janela.add(btn);
        labeltxt.setSize(100,30);
        janela.add(labeltxt);
        janela.add(label);
        janela.setSize(400,300);
        janela.setVisible(true);
       } catch (Exception e) {
        System.out.println("Erro ao carregar imagem :"+e.getMessage());
       }
    }
}

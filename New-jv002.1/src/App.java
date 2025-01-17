import javax.imageio.ImageIO;
import javax.swing.*;
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
        btn.setBounds(30,60,120, 30);
        janela.add(btn);
        labeltxt.setBounds(30,30,100,30);
        janela.add(labeltxt);
        janela.add(label);
        janela.setBounds(300,300,400,300);
        janela.setVisible(true);
       } catch (Exception e) {
        System.out.println("Erro ao carregar imagem :"+e.getMessage());
       }
    }
}

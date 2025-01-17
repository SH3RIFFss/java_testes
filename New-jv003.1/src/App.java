import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) throws Exception {
        // D eclaraçao da janela
        JFrame janela = new JFrame("Calcudor de idade");
        // Decaraçao e implantadao dos itens na janela
        JLabel tit = new JLabel("digite seu ano de nacimento !");
        tit.setBounds(50, 50, 200, 50);
        janela.add(tit);
        JSpinner id = new JSpinner();
        id.setBounds(50, 100, 50, 20);
        janela.add(id);
        JLabel idtxt = new JLabel("Sua idade atual é ");
        idtxt.setBounds(50, 130, 200, 50);
        janela.add(idtxt);
        JLabel idRes = new JLabel("0");
        idRes.setBounds(50, 160, 100, 50);
        janela.add(idRes);
        JButton btnCalc = new JButton("Calcular");
        btnCalc.setBounds(150, 100, 80, 50);
        janela.add(btnCalc);
        // Logida de funcionamento
        LocalDateTime agr = LocalDateTime.now();
        DateTimeFormatter form = DateTimeFormatter.ofPattern("y");
        String dtfor = agr.format(form);
        Toolkit resolucao = Toolkit.getDefaultToolkit();
        Dimension dimençaoTela = resolucao.getScreenSize();
        int resLar = dimençaoTela.width;
        int resAlt = dimençaoTela.height;
        int largura = resLar / 3;
        int altura = resAlt / 3;
        btnCalc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int vl = Integer.parseInt(id.getValue().toString());
                int vlRlg = Integer.parseInt(dtfor.toString());
                int vlId = vlRlg - vl;
                idRes.setText(Integer.toString(vlId));
            }
        });
        // Implantaçao da janela
        janela.setLayout(null);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setBounds(largura, altura, 300, 300);
        janela.setVisible(true);
    }
}

import java.util.*;
import java.awt.*;

public class App {
    public static void main(String[] args) throws Exception {
        // relogio
        Date relogio = new Date(); // para saber e declarar a variavel e o pacote.
        System.out.println("A hora do sistema eh " + relogio);

        // local
        Locale local = Locale.getDefault(); // para capturar e vincular a vaiavel e declarar o pacote.
        String idioma = local.getDisplayLanguage(); // para saber a linguagem do sistema.
        String pais = local.getDisplayCountry(); // para saber a pais do sistema.
        System.out.println("o idioma esta em " + idioma + " do " + pais);

        //resoluçao
        Toolkit resolucao=Toolkit.getDefaultToolkit(); //Obtém o Toolkit padrão.
        Dimension dimençaoTela=resolucao.getScreenSize(); //Obtém a dimensão da tela.
        int largura= dimençaoTela.width; //obtém a largura da tela.
        int altura= dimençaoTela.height; //obtém a altura da tela.
        System.out.println("A resolucao da tela: "+largura+" x "+altura);
    }
}
public class App {
    public static void main(String[] args) throws Exception {
        ControleRemoto c1 =new ControleRemoto();
        c1.ligar();
        c1.play();
        c1.menosVolume();
        c1.ligarMudo();
        c1.desligarMudo();
        c1.abrirMenu();
    }
}

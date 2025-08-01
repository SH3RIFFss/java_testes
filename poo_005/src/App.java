 public class App {
    public static void main(String[] args) throws Exception {
        Lutador[] l= new Lutador[6];
        luta war=new luta();
        l[0] = new Lutador("felipe o terrivel", "brasil", 21, 1.70, 73.2, 2, 5, 1);
        l[1]=new Lutador("zeus", "grecia", 2000, 1.81, 78.8, 2, 0, 0);
       war.marcarLuta(l[0], l[1]);
       war.lutar();
    }
}

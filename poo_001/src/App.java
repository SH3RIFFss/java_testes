public class App {
    public static void main(String[] args) throws Exception {
       caneta c1=new caneta();
       c1.cor="azul";
       c1.modelo="bic";
       c1.ponta=1.0f;
       c1.carga=60;
       c1.destampar();
       c1.rabiscar();
       c1.status();
    }
}

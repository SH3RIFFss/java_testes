public class App {
    public static void main(String[] Args) throws Exception {
        // Randomizaçao usando a classe base MATH.
        int ini = 1;
        int fim = 7;
        int randonNumber = (int) (ini + Math.random() * (fim - ini));

        // operador ternario (if-else compacto).
        // int n1 = 5;
        // String look=(n1>randonNumber)?"azar":"sorte";
        // System.out.printf("Voce esta com %s. O valor de seus dados foram
        // :%s",look,randonNumber);

        Bycicle bike1 = new Bycicle();
        Bycicle bike2 = new Bycicle();

        //bike com problema na marcha
        bike1.escolherCadencia(50);
        bike1.almentarVelocidade(10);
        bike1.escolherMarcha(randonNumber);
        bike1.mostrarEstatisticas();

        //bike normal
        bike2.escolherCadencia(50);
        bike2.almentarVelocidade(10);
        bike2.escolherMarcha(2);
        bike2.escolherCadencia(40);
        bike2.almentarVelocidade(10);
        bike2.escolherMarcha(3);
        bike2.acionarFreio(5);
        bike2.mostrarEstatisticas();

    }
}

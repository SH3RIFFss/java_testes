public class App {
    public static void main(String[] args) throws Exception {
        // Randomizaçao usando a classe base MATH
        int ini = 1;
        int fim = 10;
        double randonNumber = (int) (ini + Math.random() * (fim - ini));
        System.out.println(randonNumber);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Aluno a1 = new Aluno("Pedro", "m", 21, "Informatica", 1111);
        a1.status();
        a1.pagarMensalidade();
        // Bolsista b1 = new Bolsista(a1);
        // b1.cadastrar(a1);
        // b1.pagarMensalidade();
    }
}

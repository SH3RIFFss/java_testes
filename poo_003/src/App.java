public class App {
    public static void main(String[] args) throws Exception {
        //para criar uma conta deve-se informar o tipo e numero da conta(com cinco digitos).
        ContaBanco conta1=new ContaBanco();
        conta1.abrirConta("cc", 12345);
        conta1.setDono("felipe");
        conta1.depositar(2000);
        conta1.sacar(50);
        conta1.status();
        

    }
}

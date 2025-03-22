public class App {
    public static void main(String[] args) throws Exception {
        //para declara um array ainhado.
        // String[][] jogadores0={
        //     {"cris","messi","rodri"},
        //     {"marta","aitana","putellas"}
        // };
        //System.out.printf("Uma comrassao, %s ou %s, quem eh melhor",jogadores0[0][2],jogadores0[1][1]);

        //para criar uma copia de um array.
        String[] jogadores={
            "cris","messi","rodri","marta","aitana","putellas"
        };
        //forma padrao.
        // String[] copia=new String[6];
        // System.arraycopy(jogadores, 3, copia, 0, 3);

        String[] copia=java.util.Arrays.copyOfRange(jogadores,3,6); //forma compacta.
        int local=java.util.Arrays.binarySearch(jogadores, "messi"); //localizar o indice de um valor dentro do array.
        for (String string : copia) {
            System.out.println(string);
        }
        System.out.println(" \n"+local);

    }
}
class nome{
    public void meuNome{
        
    }
}

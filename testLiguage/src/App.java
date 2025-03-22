import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        // para declara um array ainhado.
        // String[][] jogadores0={
        // {"cris","messi","rodri"},
        // {"marta","aitana","putellas"}
        // };
        // System.out.printf("Uma comrassao, %s ou %s, quem eh
        // melhor",jogadores0[0][2],jogadores0[1][1]);

        // para criar uma copia de um array.
        String[] jogadores = {
                "cris", "messi", "rodri", "marta", "aitana", "putellas"
        };
        // forma padrao.
        // String[] copia=new String[6];
        // System.arraycopy(jogadores, 3, copia, 0, 3);

        String[] copia = java.util.Arrays.copyOfRange(jogadores, 3, 6); // forma compacta.
        int local = java.util.Arrays.binarySearch(jogadores, "messi"); // localizar o indice de um valor dentro do
                                                                       // array.

        for (var string : copia) { // for para iteraçao de array.
            System.out.println(string);
        }
        System.out.println("\n" + local);

        // instanciaçao do objeto nome.
        nome nome1 = new nome();
        nome1.meuNome("felipe");
        nome1.mostrarNome();

        // suporte e funcionamento do identificador de tipo "var".
        var txt = "ola mundo";
        int num1 = 1;
        int num2;
        num2 = 2;
        int num3=num2+=3;
        System.out.println(num1);

        for (var i = 0; i < num2; i++) { // for para iteraçao de numeros
            System.out.println(txt + "\n");
        }

        //declaraçao de lista, iteraçao e apresentaçao com o for.
        List<String> cidades = new ArrayList<>();
        cidades.add("cuiaba");
        cidades.add("varzea grade");
        cidades.add("acorizal");
        cidades.add("primavera");
        for (var str : cidades) {
            System.out.println(str);
        }

        System.out.println(num3+" , "+num2);
    }
}

class nome {
    String nomes;

    void meuNome(String nome) {
        nomes = nome;
    }

    void mostrarNome() {
        System.out.println(nomes);
    }
}

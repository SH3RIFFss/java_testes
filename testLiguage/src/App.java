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
        var num1 = 1;
        int num2;
        num2 = 2;
        int num3 = num2 += 3;
        System.out.println(num1);

        for (var i = 0; i < num2; i++) { // for para iteraçao de numeros
            System.out.println("\n"+txt);
        }
        System.out.printf("%d,%d\n", num3, num2);

        // declaraçao de lista, iteraçao e apresentaçao com o for.
        List<String> cidades = new ArrayList<>();
        cidades.add("cuiaba");
        cidades.add("varzea grade");
        cidades.add("acorizal");
        cidades.add("primavera");
        for (var str : cidades) {
            System.out.println(str);
        }

        // verificador de idade para votaçao apartir de uma idade aleatoia.
        var vota = "nao tem a obrigacao de votar";
        var NaoVota = "tem a obrigacao de votar";
        var ini = 16;
        var fin = 80;
        int numRandon = (int) (Math.random() * (fin - ini + 1)) + ini;
        String votar = (numRandon >= 16 && numRandon < 18) || (numRandon > 70) ? vota : NaoVota;
        System.out.printf("\nvoce tem %d anos de idade, logo a voce %s\n", numRandon, votar);

        // testes de estruturas condicionais.
        // estruturas condicionais simples.
        int random=(int) (Math.random()*(50-1+1))+1;
        if(random>=25){
            System.out.printf("\nvoce tem %s carrinhos da hotweels, voce pode ser um colecionador!\n",random);
        }
        // estruturas condicionais compostas.
        if(random>=35){
            System.out.printf("\nprodutor, pois possui %d galinhas em sua propriedade\n",random);
        }else{
            System.out.printf("\nconsumidor, pois possui apenas %d galinhas em sua propriedade.\n",random);
        }

    }

}

// logica do objeto nome em interaçao com array.
class nome {
    String nomes;

    void meuNome(String nome) {
        nomes = nome;
    }

    void mostrarNome() {
        System.out.println(nomes);
    }
}
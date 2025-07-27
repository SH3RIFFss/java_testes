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
            System.out.println("\n" + txt);
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
        var ini = 1;
        var fin = 80;
        int numRandon = (int) (Math.random() * (fin - ini + 1)) + ini;
        String votar = (numRandon >= 16 && numRandon < 18) || (numRandon > 70) ? vota : NaoVota;
        // System.out.printf("\nvoce tem %d anos de idade, logo a voce %s\n", numRandon,
        // votar);

        // testes de estruturas condicionais.
        // estruturas condicionais simples.
        int random = (int) (Math.random() * (50 - 1 + 1)) + 1;
        if (random >= 25) {
            System.out.printf("\nvoce tem %s carrinhos da hotweels, voce pode ser um colecionador!\n", random);
        }
        // estruturas condicionais compostas.
        if (random >= 35) {
            System.out.printf("\nprodutor, pois possui %d galinhas em sua propriedade\n", random);
        } else {
            System.out.printf("\nconsumidor, pois possui apenas %d galinhas em sua propriedade.\n", random);
        }
        // estruturas condicionais encadeada.
        if (numRandon < 16) {
            System.out.printf("\nsua idade eh %d, logo nao pode votar\n", numRandon);
        } else if ((numRandon >= 16 && numRandon <= 18) || (numRandon >= 70)) {
            System.out.printf("\nsua idade eh %d, logo seu voto eh opcional\n", numRandon);
        } else {
            System.out.printf("\nsua idade eh %d, logo seu voto eh obrigatorio\n", numRandon);
        }

        // estruturas condicionais de multipla escolha.
        var estado = "solido";
        switch (estado) {
            case "solido":
                System.out.printf("\no estado eh %s\n", estado);
                break;
            case "liquido":
                System.out.printf("\no estado eh %s\n", estado);
                break;
            case "gasoso":
                System.out.printf("\no estado eh %s\n", estado);
                break;
            default:
                System.out.println("nao tem estado cadastrado");
                break;
        }
        // estruturas de repetiçao
        var i = 1;
        //estruturas com teste logico no inico.
        while (i <= 5) {
            System.out.println("\nlaco de numero: " + i);
            i++;
        }
        //estruras co teste logico no final.
    }
    Math.pow(2,2);
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
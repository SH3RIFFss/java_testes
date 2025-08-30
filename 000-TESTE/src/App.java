import java.util.Arrays;
import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        recursiva(5); // chamada do metodo recursivo

        sauda("felipe"); // chamada do metodo onde um chama o outro

        // declaração de uma pilha (stack)
        Stack<String> minhaLista = new Stack<>();
        minhaLista.push("felipe"); // adiciona itens no topo da lista
        minhaLista.push("andre");
        System.out.println("========\n" + minhaLista); // vizualiza a lista por completo
        System.out.println(minhaLista.peek()); // vizualiza o topo da lista
        minhaLista.pop(); // remove o ultimo item da lista
        System.out.println(minhaLista);

        // declaração dos valores de um array
        int[] numeros = { 1, 2, 3, 4, 15 };
        int[] numeros2 = { 1, 2, 3, 4, 5, 6 };
        System.out.println("==========");
        System.out.println("a soma dos numeros eh: " + somaArray(numeros)); // chamada e exibição do
        System.out.println("==========");// resultado da soma do aray
        System.out.println("a contagem dos itens do array eh: " + contaItemArray(numeros)); // chamae exibe o resultado
                                                                                            // da quantidade de itens do
                                                                                            // array
        System.out.println("================\no maior iten do array eh: " + maiorNumero(numeros)); // chamada e exibição
                                                                                                   // do resultado do
                                                                                                   // maior item do array

        /*
         * na função nativa (Math.max ou Math.min) recebe como parametro dois numeros
         * independentes de ser variaveis normais ou retornos de metodos
         */
        int sla = Math.max(somaArray(numeros), somaArray(numeros2));
        int sla2 = Math.max(contaItemArray(numeros), contaItemArray(numeros2));
        System.out.println("o array com a maior quantidade de numeros altos contem : "+sla+", somando todos os indices");
        System.out.println("o array com mais numeros contem : "+sla2+" itens");

        //declaração do arrray desordenado
        int[] miniNum = { 17,2 ,3,5,};
        int maxSort=miniNum.length-1; //maximo indice para o quicksort
        System.out.println("array original : "+Arrays.toString(miniNum)); //apresentação da lista desordenada
        quickSort(miniNum, 0, maxSort); //instanciação do quck sort
        System.out.println("array com quicksort : "+Arrays.toString(miniNum)); //apresentação da lista ordenada
    }
    //metode principal do quick sort
    public static void quickSort(int[] n,int menor, int maior) {
        if(menor<maior){ //compara as instancias
            int pi=particion(n, menor, maior); //declara o formato da partição 
            quickSort(n, menor, pi-1); //chama o metodo auxilar e formata o array para o lado maior
            quickSort(n, pi+1, maior); //chama o metodo auxilar e formata o array para o lado menor
        }
    }
    //metodo auxiliar do quicksort
    public static int particion(int[] n ,int menor, int maior) {
        int pivot=n[maior]; //cria um pivô para comparação
        int i=(menor-1); //nova declarao do menor indice
        for(int j=menor;j<maior;j++){ //looping para verificar e incrementar o menor indice
            if(n[j]<=pivot){ //condição para comparar o valor do menor indice com o pivô
                i++; //se a condição for certa incrementa ao valor do menor indice
                int temp=n[i]; //declaração de variavel de troca de valores
                n[i]=n[j]; //troca o menor valor recebido pelo valor dado pelo looping
                n[j]=temp; //troca o valor dado pelo looping pelo antes valor menor
            }
            //reorganização do pivô
            int temp=n[i+1]; //reorganiza o indice do pivô
            n[i+1]=n[maior]; //troca o valor do piô para o ultimo item
            n[maior]=temp; //volta o valor para o item anterior
        }
        return i+1; //retorna o indice zero.
    }

    public static int maiorNumero(int[] v) {
        if (v.length == 1) { // verifica se o array tem apenas um elemento
            return v[0]; // se sim, retorna esse elemento
        } else {
            int maior = maiorNumero(java.util.Arrays.copyOfRange(v, 1, v.length)); // chama o metodo recursivamente com
                                                                                   // o restante do array
            return Math.max(v[0], maior); // compara o primeiro elemento com o maior do restante e retorna o maior
        }
    }

    // metodo recursivo que soma os numeros de um array
    public static int somaArray(int[] n) {
        if (n.length == 0) { // verifica se o array esta vazio
            return 0; // se estiver, retorna 0
        } else {
            return n[0] + somaArray(java.util.Arrays.copyOfRange(n, 1, n.length)); // retorna o primeiro elemento do
                                                                                   // array mais a soma do restante do
                                                                                   // array
        }
    }

    // metodo recursivo que conta os itens de um array
    public static int contaItemArray(int[] n) {
        if (n.length == 0) {
            return 0;
        } else {
            return 1 + contaItemArray(java.util.Arrays.copyOfRange(n, 1, n.length));
        }
    }

    // metodo recursivo
    public static void recursiva(int n) {
        if (n <= 1) {
            System.out.println("================\na base eh : " + n);
            return;
        } else {
            System.out.println("n : " + n);
            recursiva(n - 1);
            System.out.println("retornando de n : " + n);
        }
    }

    // metodo onde um chama o outro
    public static void sauda(String nome) {
        System.out.println("===========\nola " + nome);
        sauda2(nome);
        System.out.println("preparando para dizer tchau...");
        tchau(nome);
    }

    public static void sauda2(String nome) {
        System.out.println("seja bem vindo, como vai voce " + nome);
    }

    public static void tchau(String nome) {
        System.out.println("tchau " + nome + ", foi bom enquanto durou");
    }
}

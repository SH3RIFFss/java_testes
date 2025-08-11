public class App {
    public static void main(String[] args) throws Exception {
        int[] dados={1,4,6,14,7,90,23}; //dados a serem ordenados
        int n=dados.length; //tamanho do array
        System.out.println("\ndados desordenados :\n");
        for(int i : dados){ //mostra os dados não ordenados
            System.out.print(i+" ");
        }
        quickSort(dados, 0, n-1);
        System.out.println("\ndados ordenados :\n");
        for(int i :dados){ //mostra os dados ordendos
            System.out.print(i+" ");
        }
    }
    //metodo pricipal do quicksort
    static void quickSort(int[] lista, int esquerda, int direita) { 
        //condição para desparada da ordenação
        if (esquerda < direita) {
            int pivot = particao(lista, esquerda, direita); //particona o array e retorna o indice do pivô
            quickSort(lista, esquerda, pivot - 1); //chama o qucksort para a sub-lista á esquerda do pivô
            quickSort(lista, pivot + 1, direita); //chama o qucksort para a sub-lista á direita do pivô
        }
    }
    //metodo para partionar o array e encintrar a posição final do pivô
    private static int particao(int[] lista, int esquerda, int direita) {
        int pivot = lista[direita]; //escolheo ultimo elemento como pivô
        int i = esquerda - 1; //indice do elemento que será trocado
        for (int j = esquerda; j < direita; j++) { //percorre o array do inicio ao fim (exeto o pivô)
            if (lista[j] <= pivot) { //verifica a condição
                i++; //incrementa 
                troca(lista, i , j); //troca o elemento em i pelo em j
            }
        }
        troca(lista, i+1, direita); //troca o pivô (array[direita]) com o elemento no indice (i+1)
        return i+1; //retorna o indice onde o pivô foi colocado
    }
    //metodo auxiliar para tocar as posições no array
    private static void troca(int[] lista, int i, int j) {
        int aux = lista[i];
        lista[i]=lista[j];
        lista[j]=aux;
    }
}

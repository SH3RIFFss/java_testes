
public class App {
    public static void main(String[] args) throws Exception {
        int[] lista = { 1, 3, 5, 7, 9,12,34,65 };
        int resultado = busca(lista, 65);

        System.out.println("o indice encontrado na posicao : " + resultado);
    }

    public static int busca(int[] lista, int item) {
        int baixo = 0;
        int alto = lista.length - 1;
        while (baixo <= alto) {
            int meio = (baixo + alto) / 2;
            int chute = lista[meio];
            if (chute == item) {
                return meio;
            } else if (chute > item) {
                alto = meio - 1;
            } else {
                baixo = meio + 1;
            }
        }
        return -1;
    }
}

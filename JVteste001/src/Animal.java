import java.util.Random;

public class Animal {
    String mamifero;
    String especie;
    int tempoNaTerra;
    String extincao;

    // metodo para mostrar o objeto formatado
    void mostrarStatus() {
        int idade=idadeAnimal();
        System.out.format(
                "o animal %s, %s eh um mamifero, viveu na terra durante %d mil anos, e %s entrou em extincao, e um de sua especie chegou a viver %d anos de idade \n",
                especie, mamifero, tempoNaTerra, extincao,idade);
    }

    int idadeAnimal() {
        Random gerador = new Random();
        int dado = 1 + gerador.nextInt(200);
        return dado;
    }
}
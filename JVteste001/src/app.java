public class app {

    public static void main(String args[]) {
        Animal animal1 = new Animal();
        animal1.especie = "mamute";
        animal1.mamifero = "sim";
        animal1.tempoNaTerra = 100;
        animal1.extincao = "sim";
        animal1.mostrarStatus();

        Animal animal2 = new Animal();
        animal2.especie = "dodo";
        animal2.mamifero = "nao";
        animal2.tempoNaTerra = 50;
        animal2.extincao = "sim";
        animal2.mostrarStatus();

        Animal animal3 = new Animal();
        animal3.especie = "cachorro";
        animal3.mamifero = "sim";
        animal3.tempoNaTerra = 70;
        animal3.extincao = "nao";
        animal3.mostrarStatus();
    }
}
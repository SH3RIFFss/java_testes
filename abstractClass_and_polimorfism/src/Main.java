// Classe Abstrata
abstract class Animal {
    // metodo abstrato
    public abstract void emitirSom();

    // metodo concreto
    public void dormir() {
        System.out.println("Zzzz...");
    }

    public void tipoAnimal() {
        System.out.println("É um animal selvagem!");
    }

}

// subclasse concreta
class Cachorro extends Animal {
    public void emitirSom() {
        System.out.println("Latir!");
    }
}

// subclasse concreta
class Gato extends Animal {
    public void emitirSom() {
        System.out.println("Miar!");
    }
}

// subclasse concreta
class leao extends Animal {

    public void emitirSom() {
        System.out.println("rugir!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();
        Animal leao = new leao();

        cachorro.emitirSom();
        cachorro.dormir();

        gato.emitirSom();
        gato.dormir();

        leao.emitirSom();
        leao.dormir();
        leao.tipoAnimal();
    }
}

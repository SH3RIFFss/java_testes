package java_carros;
// CLASSES, MEHTODOS, ATRIBUTOS E OBJETOS

public class carro { // classe
    String modelo; // atributo

    public carro(String modelo) {
        this.modelo = modelo;
    }

    public void acelerar() { // mehtodo
        System.out.println("acelerando o " + this.modelo);
    }
}

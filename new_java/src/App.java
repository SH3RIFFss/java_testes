import java.util.ArrayList;
import java_carros.carro;
import java_interface.*;

public class App {
    public static void main(String[] args) throws Exception {
        // TIPOS PRIMITIVOS
        int idade = 20;
        String name = "felipe";
        var tipo = "numero"; // independente da declaraçao de tipo, o JAVA decide!.
        boolean bool = false;

        // CONDICIONAIS
        // if (name.isBlank()) {
        // System.out.println("ta vazio...");
        // } else {
        // System.out.println("meu precioso !");
        // }

        // MANIPULAÇAO DE LISTA
        ArrayList<String> names = new ArrayList<>(); // declaraçao de lista abstrata.
        int[] coleçaoInteiros2 = new int[15]; // coleçao sem declaraçao abstrata.
        int[] coleçaoInteiros = { 1, 2, 3, 4, 5 }; // coleçao com itens declarados.
        names.add("felipe");
        names.add("eduardo");
        names.add("andre");
        // names.remove("felipe");
        // System.out.println(names.get(2));

        // LOOPS
        int count = 0;
        // for (int i = 0; i < names.size(); i++) {
        // System.out.println(names.get(i));
        // }

        // while (count < 10) {
        // System.out.println("contando...");
        // count++;
        // }

        // CONVERSAO DE TIPOS
        int num = 0;
        String str = "0";
        // int numStr=Integer.parseInt(str) ; //conversao de string para inteiro.
        // String strNum =String.valueOf(num) ; //conversao de inteiro para string.
        // System.out.println(name);

        //INTERFACES E CLASSES ABSTRATAS


        carro carro1 = new carro("ford_GT-500"); //declaarçao do objeto com argumento
        carro carro2 = new carro("bmw_m5-competetion") ;
        carro1.acelerar();
        carro2.acelerar();
        moto s1000 =new bmw_s();
        s1000.acelerarMoto();
        s1000.freiarMoto();
    }
}
class Aluno {
    private String nome;
    private int idade;
    public Aluno ( String nome , int idade ) {
         this.nome = nome;
         this.idade = idade;
    }
    public void definirNome ( String nome ) {
         this.nome = nome;
    }  
    public void definirIdade ( int idade ) {
         this.idade = idade;
    }
    public String recuperarNome () {
         return this.nome;
    }     
}
public class Referencia  {
       private Aluno a1 , a2;
       public Referencia() {
        a1 = new Aluno ( "Carlos" , 20);
        a2 = new Aluno ( "Ana" , 23 );
        System.out.println("O nome do aluno a1 é " + a1.recuperarNome());
        System.out.println("O nome do aluno a2 é " + a2.recuperarNome());
        a1 = a2;
        a2.definirNome("Flávia");
        System.out.println("O nome do aluno a1 é " + a1.recuperarNome());
        manipulaAluno ( a1 );
        System.out.println("O nome do aluno a1 é " + a1.recuperarNome());
       }
       public void manipulaAluno ( Aluno aluno ) {
        aluno.definirNome("Márcia");
       }
       public static void main(String args[]) {
           Referencia r = new Referencia ();
           System.out.println("Fim da Execução ");
    }
}

// import java.util.Random;

// // //Classe
// public class Pessoa {
// // Atributos
// private String nome;
// private double codigo_identificador;
// private Random aleatorio;

// // Métodos
// public Pessoa(String nome) {
// aleatorio = new Random();
// this.setNome(nome);
// this.codigo_identificador = aleatorio.nextDouble();
// }

// private void setNome(String nome) {
// this.nome = nome;
// }

// public String getNome() {
// return this.nome;
// }

// public double getCodigoIdentificador() {
// return this.codigo_identificador;
// }

// public static void main(String args[]) {
// Pessoa p1 = new Pessoa("Teste A,");
// Pessoa p2 = new Pessoa("Teste b,");
// System.out.println("Pessoa 1: " +
// p1.getNome()+"Codigoidentificador:"+p1.getCodigoIdentificador());
// System.out.println("Pessoa 2: " +
// p2.getNome()+"Codigoidentificador:"+p2.getCodigoIdentificador());
// }

// }
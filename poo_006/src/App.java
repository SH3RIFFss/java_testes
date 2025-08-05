public class App {
    public static void main(String[] args) throws Exception {
       Pessoa[] p=new Pessoa[2];
       Livro[] l=new Livro[3];
       //declaração de pessoa
       p[0]=new Pessoa("felipe", 21, "m");
       p[1]=new Pessoa("maethe", 29, "f");
       p[0].cadastro();
       //declaração de livro
       l[0]=new Livro("harry potter I", "j. k. rowling", 250, p[0]);
       l[0].abrir();
       l[0].folhear(1000);

       l[0].detalhes();
    }
}

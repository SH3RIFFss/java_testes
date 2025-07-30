public class App {
    public static void main(String[] args) throws Exception {
        // cachorro meuCachorro = new cachorro();
        // meuCachorro.setCor("caramelo");
        // meuCachorro.setRaca("bulldoggue");
        // meuCachorro.setIdade(3);
        // meuCachorro.setPreço(1500);
        // meuCachorro.setDono("felipe");

        // meuCachorro.status();
        // meuCachorro.latir();
        // meuCachorro.correr();
        // meuCachorro.comprar();

        cachorro dog1=new cachorro("caramelo", "pincher", 2);
        dog1.setPreço(300);
        dog1.setDono("felipe");
        dog1.status();
    }
}

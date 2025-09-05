import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        
        Map<String, List<String>> myMap=new HashMap<>();
        System.out.println("tamanho inicial da lista : "+myMap.size());
        List<String> amigosFelipe=new ArrayList<>();
        amigosFelipe.add("alice");
        amigosFelipe.add("joao");
        amigosFelipe.add("alacir");
        myMap.put("felipe", amigosFelipe);
        List<String> amigosJoao=new ArrayList<>();
        amigosJoao.add("claudia");
        amigosJoao.add("dirceu");
        amigosJoao.add("afonso");
        myMap.put("joao", amigosJoao);
        System.out.println("===adicionando=arquvos===");
        System.out.println("tamanho inicial da lista : "+myMap.size());
        System.out.println("tamanho inicial da lista : "+amigosFelipe.size());
        for (String amigos : myMap.keySet()) {
            System.out.println("os amigos de primeiro grau de "+amigos+" sao : "+myMap.get(amigos));
        }
        
        Grafo meuGrafo=new Grafo();
        meuGrafo.addVertice("felipe");
        meuGrafo.addVertice("clair");
        meuGrafo.addVertice("bob");
        meuGrafo.addVertice("thom");
        meuGrafo.addVertice("alice");
        meuGrafo.addVertice("peggy");
        meuGrafo.addVertice("anuj");
        meuGrafo.addVertice("jenny");

        meuGrafo.addAresta("felipe", "bob");
        meuGrafo.addAresta("felipe", "clair");
        meuGrafo.addAresta("felipe", "alacir");
        meuGrafo.addAresta("clair", "thom");
        meuGrafo.addAresta("clair", "jenny");
        meuGrafo.addAresta("alacir", "peggy");
        meuGrafo.addAresta("bob", "anuj");
        meuGrafo.addAresta("bob", "peggy");

        meuGrafo.bfs("felipe");
        
    }
    // public static void verificarAmigos(List<String> lista){
    //     for (String vendedor : lista) {
    //         if (vendedor(vendedor)) {
    //             System.out.println(vendedor+", eh vendedor(a)");
    //         }else{
    //             System.out.println(vendedor+", nao eh vendedor(a)");
    //             lista.remove(vendedor);
    //         }
    //     }
    // }
    // public static boolean vendedor(String nome){
    //     if (nome.contains("r")) {
    //         return true;
    //     }else{
    //         return false;
    //     }
    // }
}

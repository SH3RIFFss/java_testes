public class App {
    public static void main(String[] args) throws Exception {
        
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
        meuGrafo.addAresta("felipe", "thom");
        meuGrafo.addAresta("felipe", "jenny");
        meuGrafo.addAresta("thom", "clair");
        meuGrafo.addAresta("clair", "jenny");
        meuGrafo.addAresta("peggy", "alacir");
        meuGrafo.addAresta("bob", "anuj");
        meuGrafo.addAresta("bob", "peggy");

        meuGrafo.bfs("felipe");
        meuGrafo.bfs("thom");
        meuGrafo.bfs("peggy");
        
    }
}

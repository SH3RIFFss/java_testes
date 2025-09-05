import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Queue;

public class Grafo {
    private Map<String, List<String>> listaAdjancia;

    //construtor
    public Grafo() {
        this.listaAdjancia = new HashMap<>(); //cria uma nova tabela hash
    }

    @param //marcador de conexão 
    public void addVertice(String vertice) { 
        listaAdjancia.putIfAbsent(vertice, new ArrayList<>()); //cria uma nova tabela caso o valor nao esteja vinculado a nenhuma chave 
    }

    @param //
    public void addAresta(String origem, String destino) {
        addVertice(origem);
        addVertice(destino);
        listaAdjancia.get(origem).add(destino);
        listaAdjancia.get(destino).add(origem);
    }

    @param //
    public void bfs(String inicio) {
        Set<String> visitados = new HashSet<>(); 
        Queue<String> fila = new LinkedList<>();
        fila.add(inicio);
        visitados.add(inicio);
        System.out.println("==iniciando busca em largura no item : " + inicio);
        while (!fila.isEmpty()) {
            String verticeAtual = fila.poll();
            System.out.println(verticeAtual);
            for (String vizinho : listaAdjancia.get(verticeAtual)) {
                if (vendedor(vizinho)) {
                    // visitados.add(vizinho);
                    fila.add(vizinho);
                }
            }
        }
        System.out.println("==fim=da=busca==");

    }

    private boolean vendedor(String nome) {
        if (nome.contains("r")) {
            return true;
        } else {
            return false;
        }
    }
}

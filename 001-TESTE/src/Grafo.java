import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Queue;

public class Grafo {
    private Map<String, List<String>> listaAdjancia; //delaração da tabela hash principal

    //construtor
    public Grafo() {
        this.listaAdjancia = new HashMap<>(); //instancia uma nova tabela hash
    }

    @param //marcador de conexão para criar entidades(entidade[valor,valor])
    public void addVertice(String vertice) { 
        listaAdjancia.putIfAbsent(vertice, new ArrayList<>()); //cria uma nova tabela caso o valor nao esteja vinculado a nenhuma chave 
    }

    @param //marcador de conexão para criar relacionamentos(chave[valor],valor[chave])
    public void addAresta(String origem, String destino) {
        addVertice(origem); //adiciona o objeto final 
        addVertice(destino); //adiciona a conexão de chave e valor
        listaAdjancia.get(origem).add(destino); //relaciona a chave a um valor 
        listaAdjancia.get(destino).add(origem); //relaciona um valor a uma chave
    }

    @param //marcador de conexão para verificar os nós percorridos e diferenciar as caracteristica especifica desejada
    public void bfs(String inicio) {
        Set<String> visitados = new HashSet<>(); //cria uma tabela hash para itens ja visitados
        Queue<String> fila = new LinkedList<>(); //cria uma lista encadeada dos valores a serem verificados
        fila.add(inicio); //adiciona a lista encadeada o chave de relacionamentos desejada
        visitados.add(inicio); //adiciona a tabela hash o valor que ja foi verificado 
        System.out.println("==iniciando busca em largura no item : " + inicio);
        while (!fila.isEmpty()) { //emquanto lista encadeada estiver vazia
            String verticeAtual = fila.poll(); //cria a variavel que atualiza e remove itens da lista encadeada
            System.out.println(verticeAtual); 
            for (String vizinho : listaAdjancia.get(verticeAtual)) { //para cada item da tabela hash principas compara se os valores atendem as exigências
                if (vendedor(vizinho)) { //cria as exigências 
                    // visitados.add(vizinho);
                    fila.add(vizinho); //adiciona as exigências a lista encadeada
                }
            }
        }
        System.out.println("==fim=da=busca==");

    }

    private boolean vendedor(String nome) { 
        return nome.contains("r");
    }
}

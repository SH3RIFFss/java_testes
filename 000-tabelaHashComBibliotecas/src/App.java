import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class App {
    public static void main(String[] args) throws Exception {
        Map<String, Integer> mapPop=new HashMap<>(); //criando o hash map 
        int initialcapacity=32;
        float loadFactor=0.90f;
        Map<String, Integer> maptest=new HashMap<>(initialcapacity,loadFactor); //criando o hash map 
        System.out.println(maptest.size()); //para verificar o tamanho do array

        System.out.println("=========iteracao=padrao==========");
        System.out.println(mapPop.size()); //para verificar o tamanho do array
        //inserindo os dados no array
        mapPop.put("brasil", 212); 
        mapPop.put("colombia", 52);
        mapPop.put("argentina", 45);
        mapPop.put("peru", 34);
        mapPop.put("venezuela", 28);
        mapPop.put("chile", 19);
        mapPop.put("equador", 18);
        mapPop.put("bolivia", 12);
        mapPop.put("paraguay", 7);
        mapPop.put("uruguay", 3);
        System.out.println(mapPop.size()); //para verificar o tamanho do array depois da inclusao
        //retorna o valor de acordo com a chave especificada 
        Integer popBrasil=mapPop.get("brasil");
        System.out.println("populacao do brasil : "+popBrasil+" mi de habitantes");
        //remove o valor da chave especificada
        Integer popExcluido=mapPop.remove("paraguay"); 
        System.out.println("pais dominado (paraguay) : "+popExcluido+" mi de habitantes");
        System.out.println(mapPop); //para verificar o tamanho do array depois da exclusao
        //iterando sobe chaves (keySet)
        System.out.println("==========iterando=sobre=chaves=========");
        for (String pais : mapPop.keySet()) {
            System.out.println("pais : "+pais);
        }
        
        //usando iterator para remoçao segura
        System.out.println("==========iterator=de=remocao=========");
        System.out.println(mapPop.size()); //para verificar o tamanho do array
        Iterator<Map.Entry<String, Integer>> iterator=mapPop.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entrada=iterator.next();
            if (entrada.getKey().equals("uruguay")) { //recebe a chave que sera removida 
                iterator.remove(); //forma correta de remoçao
            }
        }
        System.out.println(mapPop.size()); //para verificar o tamanho do array depois da exclusao

        //usando forEach com expressao lambda(java 8+)
        System.out.println("====iterator=foreach=e=lambda=====");
        System.out.println(mapPop.size()); //para verificar o tamanho do array
        mapPop.forEach((chave, valor)->System.out.println("chave : "+chave +", valor : "+valor ));

    }
}

public class App {
    public static void main(String[] args) throws Exception {

        myHash<String, Integer> mapa=new myHash<>();
        System.out.println("tamanho inicial tabela : "+mapa.getTamanho());
        mapa.put("brasil", 215);
        mapa.put("venezuela", 12);
        mapa.put("argentina", 110);
        System.out.println("tamanho incementado da tabela : "+mapa.getTamanho());
        System.out.println("populacao do brasil : "+mapa.get("brasil")+" mi de habitantes");
        System.out.println("populacao do venezuela : "+mapa.get("venezuela")+" mi de habitantes");
        System.out.println("populacao do argentina : "+mapa.get("argentina")+" mi de habitantes");
        Integer removePop=mapa.remove("venezuela");
        System.out.println("populacao removida (venezuela) : "+removePop);
        System.out.println("");
        System.out.println("tamanho incementado da tabela : "+mapa.getTamanho());

    }
    
}


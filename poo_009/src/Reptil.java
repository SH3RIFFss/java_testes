public class Reptil extends Animal {
    private String corEscama;
    public Reptil(String especie, String corEscama, int idade, double peso) {
        setClasse("reptil");
        setEspecie(especie);
        setCorEscama(corEscama);
        setIdade(idade);
        setPeso(peso);
        status();
    }
    public void status(){
        System.out.println("=====================");
        System.out.println("especie : "+this.getEspecie());
        System.out.println("idade : "+this.getIdade());
        System.out.println("peso : "+this.getPeso());
        System.out.println("classe : "+this.getClasse());
        System.out.println("=====================");
    }
    @Override
    public void emitirSom(){
        System.out.println(getEspecie()+"."+getCorEscama()+".sound");
    }
    @Override
    public void alimentar(){
        System.out.println("pode comer insetos ou pequenos animais");
    }
    @Override
    public void locomover(){
        System.out.println(this.getClasse()+".locomover"); 
    }
    public String getCorEscama(){
        return corEscama;
    }
    public void setCorEscama(String escama){
        this.corEscama=escama;
    }
}

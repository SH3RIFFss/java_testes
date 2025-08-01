public class Lutador {

    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
        setCategoria(categoria);
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        if(peso<52.2){
            this.categoria="nao pode competir";
        }else if(peso<=70.3){
            this.categoria="leve";
        }else if(peso<=83.9){
            this.categoria="medio";
        }else if(peso<=120.2){
            this.categoria="pesado";
        }else{
            this.categoria="invalido";
        }
    }
    public int getVitorias() {
        return vitorias;
    }
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }
    public int getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
    public int getEmpates() {
        return empates;
    }
    public void setEmpates(int empates) {
        this.empates = empates;
    }
    public Lutador(String no,String na,int id,double al, double pe, int vt, int dt, int em){
        this.setNome(no);
        this.setNacionalidade(na);
        this.setIdade(id);
        this.setAltura(al);
        this.setPeso(pe);
        this.setVitorias(vt);
        this.setDerrotas(dt);
        this.setEmpates(em);
    }
    public void apresentar(){
        System.out.println("este se intitula como :"+getNome());
        System.out.println("tendo sua nacionalidade : "+getNacionalidade());
        System.out.printf("no auge dos seus : %d anos de idade \n",getIdade());
        System.out.printf("com seus mizeros : %.2f metros de altura\n",getAltura());
        System.out.printf("pesando incriveis : %.2fkg\n",getPeso());
        System.out.printf("tendo nas ultimas lutas : %d vitorias, %d derrotas e %d empates\n",getVitorias(),getDerrotas(),getEmpates());
        System.out.println("-----------------------");
    }
    public void status(){
        System.out.println("nome : "+getNome());
        System.out.println("categoria : "+getCategoria());
        System.out.println("vitorias : "+getVitorias());
        System.out.println("derrotas : "+getDerrotas());
        System.out.println("empates : "+getEmpates());
        System.out.println("-----------------------");
    }
    public void ganharLuta(){
        this.setVitorias(getVitorias()+1);
    }
    public void perderLuta(){
        this.setDerrotas(getDerrotas()+1);
    }
    public void empatarLuta(){
        this.setEmpates(getEmpates()+1);
    }

}

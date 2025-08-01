public class Pessoa {
    private String nome,sexo;
    private int idade;
    public Pessoa(String nome, int idade,String sexo){
        this.setNome(nome);
        this.setIdade(idade);
        this.setSexo(sexo);
    }
    public void cadastro(){
        System.out.println("-----cadastrado-----");
        System.out.println("nome : "+getNome());
        System.out.println("idade : "+getIdade());
        System.out.println("sexo : "+getSexo());
        System.out.println("--------------------");
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }  
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }   
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }  
    public void fazerAniversario() {
        this.idade++;
    }

}

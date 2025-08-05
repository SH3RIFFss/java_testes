public class Aluno extends Pessoa {
    private int matricula;
    private int nota;
    

    public int getNota() {
        return nota;
    }
    public void setNota(int nota) {
        this.nota = nota;
    }
    public int getMatricula(){
        return this.matricula;
    } 
    public void setMatricula(int matricula){
        this.matricula=matricula;
    }

    public Aluno(String nome, String sexo, int idade, int matricula){
        this.setNome(nome);
        this.setSexo(sexo);
        this.setIdade(idade);
        this.setMatricula(matricula);
        this.setNota(5);
    }
    public void statusAluno(){
        System.out.println("---status-aluno---");
        System.out.println("nome : "+this.getNome());
        System.out.println("sexo : "+this.getSexo());
        System.out.println("idade : "+this.getIdade());
        System.out.println("matricula : "+this.getMatricula());
        System.out.println("nota : "+this.getNota());
        System.out.println("------------");
    }
    public void matricular(){
        if(this.getIdade()>=12 && this.getIdade()<=17){
            System.out.printf("o aluno %s foi matriculado!",this.getNome());
        }else{
            System.out.println("nao tem idade pata estudar aqui !");
        }
    }
}

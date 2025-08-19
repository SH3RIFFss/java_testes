public class Aluno extends Pessoa {
    private String materia;
    private int matricula;
    private int mensalidade;

    public Aluno(String nome, String sexo, int idade, String materia, int matricula) {
        setNome(nome);
        setSexo(sexo);
        setIdade(idade);
        this.materia = materia;
        this.matricula = matricula;
    }
    public void status(){
        System.out.println("nome: "+this.getNome());
        System.out.println("idade: "+this.getIdade());
        System.out.println("matricula: "+this.getMatricula());
        System.out.println("materia: "+this.getMateria());
        System.out.println("sexo: "+this.getSexo());
        System.out.println("=========================");
    }

    public void pagarMensalidade() {
        System.out.println("sua mensalidade no valor normal foi paga com sucesso!");
    }
    public String getMateria() {
        return materia;
    }
    public void setMateria(String materia) {
        this.materia = materia;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public int getMensalidade() {
        return mensalidade;
    }
    public void setMensalidade(int mensalidade) {
        this.mensalidade = mensalidade;
    }
}

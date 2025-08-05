public class Professor extends Pessoa {
    private Aluno aprovado;

    public Professor(String nome, String sexo, int idade) {
        this.setNome(nome);
        this.setSexo(sexo);
        this.setIdade(idade);
    }
     public void statusProfessor(){
        System.out.println("---status-professor---");
        System.out.println("nome : "+this.getNome());
        System.out.println("sexo : "+this.getSexo());
        System.out.println("idade : "+this.getIdade());
        System.out.println("-----------------------");
    }

    public void darNota(Aluno aluno, int nota) {
        aluno.setNota(aluno.getNota()+nota);
        System.out.println("---notas---");
        System.out.printf(" professor(a) %s deu a nota %d para o aluno %s\n",this.getNome(),nota,aluno.getNome());
        System.out.println("-----------");
        aluno.statusAluno();
    }

    public Aluno getAprovado() {
        return aprovado;
    }

    public void setAprovado(Aluno aprovado) {
        this.aprovado = aprovado;
    }

}

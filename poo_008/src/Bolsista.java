public class Bolsista extends Aluno {
    private boolean bolsa;
    public Bolsista(Aluno aluno){
        super(aluno.getNome(), aluno.getSexo(), aluno.getMatricula(), aluno.getMateria(), aluno.getIdade());
    }
    public void cadastrar(Aluno aluno) {
        this.setBolsa(true);
        statusBolsa();
    }
    public void statusBolsa(){
        System.out.println("nome: "+this.getNome());
        System.out.println("idade: "+this.getIdade());
        System.out.println("matricula: "+this.getMatricula());
        System.out.println("materia: "+this.getMateria());
        System.out.println("sexo: "+this.getSexo());
        System.out.println("bolsa: matriculado");
        System.out.println("=========================");
    }
    @Override
    public void pagarMensalidade() {
        if(this.isBolsa()){
            System.out.println("sua mensalidade no valor de 50% foi paga com sucesso!");
        }else{
            System.out.println("nao cadastrado");
        }
    }
    public boolean isBolsa() {
        return bolsa;
    }
    public void setBolsa(boolean bolsa) {
        this.bolsa = bolsa;
    }
    
}

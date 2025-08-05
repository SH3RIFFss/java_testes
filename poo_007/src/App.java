public class App {
    public static void main(String[] args) throws Exception {
        Aluno[] a=new Aluno[3];
        Professor[] p=new Professor[3];
        a[0]=new Aluno("felipe", "masculino", 21, 12345);
        a[1]=new Aluno("eduardo", "masculino", 13, 12346);
        a[0].statusAluno();
        p[0]=new Professor("jucimeire", "feminino", 43);
        p[0].statusProfessor();
        p[0].darNota(a[0], 2);
    }
}

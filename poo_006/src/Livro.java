public class Livro implements Publicacao {
    private String titulo,autor;
    private int totalPaginas, paginaAtual;
    private boolean aberto;
    private Pessoa leitor;

    public String getTitulo() {
        return titulo;
    }           
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }   
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public Pessoa getLeitor() {
        return leitor;
    }
    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    public int getTotalPaginas() {
        return totalPaginas;
    }
    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }
    public int getPaginaAtual() {
        return paginaAtual;
    }
    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }
    public boolean isAberto() {
        return aberto;
    }
    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Livro(String titulo,String autor,int totalPaginas,Pessoa leitor){
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setTotalPaginas(totalPaginas);
        this.setLeitor(leitor);
        this.setPaginaAtual(0);
        this.setAberto(false);
    }
    public void detalhes(){
        System.out.println("-----cadastrado-----");
        System.out.println("nome : "+getTitulo());
        System.out.println("idade : "+getAutor());
        System.out.println("paginas : "+getTotalPaginas());
        System.out.println("leitor : "+getLeitor().getNome());
        System.out.println("aberto : "+isAberto());
        System.out.println("pagina atual : "+getPaginaAtual());
        System.out.println("--------------------");
    }
    @Override
    public void abrir() {
        this.setAberto(true);
    }
    @Override
    public void fechar() {
        this.setAberto(false);
    }
    @Override
    public void folhear(int pagina) {
        if(isAberto() && pagina<=this.getTotalPaginas()){
            this.paginaAtual=pagina;
        }else{
            System.out.println("para folhear abra o livro e nao ultrapasse o limite de folhas...");
        }
    }
    @Override
    public void avancarPag() {
        this.paginaAtual++;
    }
    @Override
    public void voltarPag() {
        this.paginaAtual--;
    }
}

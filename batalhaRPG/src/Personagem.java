public class Personagem {
    private String nome;
    private String classe;
    private int vida;
    private int ataque;
    private int defesa;
    private int vitorias;

    public Personagem(String nome, String classe, int vida, int ataque, int defesa, int vitorias) {
        this.nome = nome;
        this.classe = classe;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.vitorias = vitorias;
        status();
    }
    public void status(){
        System.out.println("Nome: " + getNome());
        System.out.println("classe: " + getClasse());
        System.out.println("vida: " + getVida());
        System.out.println("ataque: " + getAtaque());
        System.out.println("defesa: " + getDefesa());
        System.out.println("vitorias: " + getVitorias());
        System.out.println("==========================");
    } 
    public final void vitoria() {
        this.vitorias++;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getClasse() {
        return classe;
    }
    public void setClasse(String classe) {
        this.classe = classe;
    }
    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
    public int getAtaque() {
        return ataque;
    }
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
    public int getDefesa() {
        return defesa;
    }
    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }
    public int getVitorias() {
        return vitorias;
    }
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }
}

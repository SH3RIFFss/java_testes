public class cachorro {
    private String cor;
    private String raca;
    private String dono;
    private int idade;
    private int preço;

    public cachorro(String cor, String raca, int idade) { //CONSTRUTOR
        this.cor = cor;
        this.raca = raca;
        this.idade = idade;
    }

    public void latir() {
        System.out.println("o cao esta latindo...Au Au");
    }

    public void correr() {
        System.out.println("O cachorro esta correndo");
    }

    public void comprar() {
        if (preço < 3000) {
            System.out.println("Cachorro comprado por " + preço + " reais.");
        } else {
            System.out.println("Preco fora do meu respaldo financeiro, nao posso comprar o cachorro.");
        }
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public String getDono() {
        return dono;
    }

    public void setPreço(int preço) {
        this.preço = preço;
    }

    public int getPreço() {
        return preço;
    }

    public void status() {
        System.out.println("Cor: " + cor);
        System.out.println("Raca: " + raca);
        System.out.println("Dono: " + dono);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Preco: " + preço + " reais");
    }
}

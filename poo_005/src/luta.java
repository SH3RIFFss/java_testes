public class luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDsafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getaprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDsafiante(l2);
        } else {
            System.out.println("a luta nao pode acontecer em caso de diferenca de categoria");
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDsafiante(null);
        }
    }

    public void lutar() {
        if (getaprovada()) {
            getDesafiado().apresentar();
            getDesafiante().apresentar();
            int randomNum = (int) (Math.random() * 3);
            switch (randomNum) {
                case 0:
                    System.out.println("luta empatada");
                    System.out.println("-------------");
                    this.getDesafiado().empatarLuta();
                    this.getDesafiante().empatarLuta();
                    this.getDesafiado().status();
                    this.getDesafiante().status();
                    break;
                case 1:
                    System.out.println("desafiado amassou!");
                    System.out.println("-------------");
                    this.getDesafiado().ganharLuta();
                    this.getDesafiante().perderLuta();
                    this.getDesafiado().status();
                    break;
                case 2:
                    System.out.println("desafiante amassou!");
                    System.out.println("-------------");
                    this.getDesafiado().perderLuta();
                    this.getDesafiante().ganharLuta();
                    this.desafiante.status();
                    break;
                default:
                    break;
            }
        } else {
            System.out.println("luta nao pode acontecer!");
        }
    }
}

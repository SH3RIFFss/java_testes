public class Batalha {
    private Personagem desafiado;
    private Personagem desafiante;
    private boolean aprovada;

    public void marcarBatalha(Personagem desafiante, Personagem desafiado) {
        if(desafiante.getClasse().equals(desafiado.getClasse())){
            System.out.println("===========marcado=============");
            System.out.println(" a batalha entre os lutadores : ");
            System.out.println("desafiante: "+desafiante.getNome());
            System.out.println("desafiado: "+desafiado.getNome());
            System.out.println("classe: "+desafiante.getClasse());
            System.out.println("acontecera em breve ...");
            System.out.println("===========marcado=============");
            this.setAprovada(true);
            this.setDesafiado(desafiado);
            this.setDesafiante(desafiante);
        }else{
            setAprovada(false);
            System.out.println("luta nao pode ser marcada");
        }
    }
    public void batalhar(){
        if(isAprovada()){
            System.out.println("===========Batalha=============");
            int RandonNum= (int) (Math.random() * 3);
            switch (RandonNum) {
                case 1:
                    System.out.println("vitoria do desafiante !");
                    getDesafiante().vitoria();
                    getDesafiante().status();
                    break;
                case 2:
                System.out.println("vitoria do desafiado !");
                    getDesafiado().vitoria();
                    getDesafiado().status();
                break;
            
                default:
                System.out.println("ambos morreram");
                    break;
            }
        }
    }

    public Personagem getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Personagem desafiante) {
        this.desafiante = desafiante;
    }

    public Personagem getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Personagem desafiado) {
        this.desafiado = desafiado;
    }
    public boolean isAprovada() {
        return aprovada;
    }
    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}

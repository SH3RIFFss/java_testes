public class ControleRemoto implements Contr{
    // ATRIBUTOS
    private int volume;
    private boolean ligado;
    private boolean tocando;
    // CONSTRUTOR
    public Construtor() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }
    // MÉTODOS PÚBLICOS
    private int getVolume() {
        return volume;
    }
    private void setVolume(int volume) {
        this.volume = volume;
    }
    private boolean getLigado() {
        return ligado;
    }
    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    private boolean getTocando(){
        return tocando;
    }
    private void setTocando(boolean tocando){
        this.tocando=tocando;
    }

}

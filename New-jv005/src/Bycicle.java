public class Bycicle {
    int cadencia=0;
    int velocidade=0;
    int marcha=1;

    void escolherCadencia(int novoValor){
        cadencia=novoValor;
    }
    void escolherMarcha(int novoValor){
        marcha=novoValor;
    }
    void almentarVelocidade(int aumentar){
        velocidade+=aumentar;
    }
    void acionarFreio(int diminuir){
        velocidade-=diminuir;
    }
    void mostrarEstatisticas(){
        System.out.printf("cadencia : %d \nvelocidade : %d\nmarcha : %d\n*\n",cadencia,velocidade,marcha);
    }
}

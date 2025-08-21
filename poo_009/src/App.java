public class App {
    public static void main(String[] args) throws Exception {
        Mamifero[] m=new Mamifero[5];
        m[0]=new Mamifero("Cachorro", "caramelo", 5, 10.0);
        m[0].emitirSom();

        Reptil[] r=new Reptil[3];
        r[0]=new Reptil("Cobra", "verde", 2, 1.5);
        
    }
}

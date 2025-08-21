public class App {
    public static void main(String[] args) throws Exception {
        Personagem[] p=new Personagem[10];
        p[0]=new Personagem("claudius o grande", "Guerreiro", 100, 20, 10,2);
        p[1]=new Personagem("Mago", "Mago", 80, 25, 5,3);
        p[2]=new Personagem("Arqueiro", "Arqueiro", 90, 15, 8,1);
        p[3]=new Personagem("Paladino", "Paladino", 110, 18, 12,4);
        p[4]=new Personagem("Ladino", "ork", 130, 32, 3,6);
        p[5]=new Personagem("herius o impiedoso", "Guerreiro", 100, 20, 10,7);
        
        Batalha[] b=new Batalha[5];
        b[0]=new Batalha();
        b[0].marcarBatalha(p[0], p[5]);
        b[0].batalhar();
        
    }
}

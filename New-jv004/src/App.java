public class App {
    public static void main(String[] args) throws Exception {
        int num1 = 10;
        int num11 = 10;
        int num2=3;
        int num3=36;
        int int1=1;
        int int2=10;
        String aluno="felipe de oliveira barros";
        float nota=6.6f;

        //Contas ultilizando a biblioteca Math.
        float exp=(float)Math.pow(num1, num2); //Potencia/Expoente
        float raz=(float)Math.sqrt(num3); //Raiz quadrada
        System.out.printf("A exponenciacao dos numeros %d e %d \nResula em : %.0f",num1,num2,exp);
        System.out.printf("\nA raiz do numero %d eh : %.0f",num3,raz);

        double ntRes=Math.round(nota); //Arredondamento de valores
        System.out.printf("\nA nota do aluno %s neste semestre consiste em : %.1f",aluno,ntRes);

        double ran=Math.random(); //metodo randômico
        int numR=(int) (int1+ran*(int2-int1)); //intervalo da radomizaçao
        System.out.printf("\nO numero aleatorio da vez eh : %d",numR);
        System.out.printf("\nO valor da variavel eh : %d",num11++);
        System.out.printf("\nO valor da variavel eh : %d",num11);
    }
}
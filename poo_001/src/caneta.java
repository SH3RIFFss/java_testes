public class caneta {
    String cor;
    String modelo;
    float ponta;
    int carga;
    boolean tampa;
    void status(){
        System.out.printf(" cor: %s\n modelo: %s\n ponta: %.1f\n carga: %d",this.cor,this.modelo,this.ponta,this.carga);
    }
    void rabiscar(){
        if(this.tampa==true){
            System.out.println("erro! caneta tampada...");
        }else{
            System.out.println("rabiscando...");
        }
    }
    void tampar(){
        this.tampa=true;
       System.out.println("caneta tampada");
    }
    void destampar(){
       this.tampa=false;
        System.out.println("caneta destampada");
    }
}

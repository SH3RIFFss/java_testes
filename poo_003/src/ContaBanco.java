public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private int saldo;
    public ContaBanco(){
        this.saldo=0;
    }
    public int getNumConta(){
        return numConta;
    }
    public void setNumConta(int numConta){
        this.numConta=numConta;
    }
    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo=tipo;
    }
    public String getDono(){
        return dono;
    }
    public void setDono(String dono){
        this.dono=dono;
    }
    public int getSaldo(){
        return saldo;
    }
    public void setSaldo(int saldo){
        this.saldo=saldo;
    }
    
    public void abrirConta(String tipo, int numConta){
        this.tipo=tipo;
        this.numConta=numConta;
        if(tipo.equals("cc")){  //conta corrente 
            this.saldo=50;
        }else if(tipo.equals("cp")){    //contapaopança
            this.saldo=150;
        }
    }
    public void fecharConta(){
        this.numConta=0;
        this.tipo=null;
        this.dono=null;
        if(this.saldo>0){
            System.out.println("conta nao pode ser fechada, com credito!");
        }else if(this.saldo<0){
            System.out.println("conta nao pode ser fechada, com debito!");
        }else{
            System.out.println("conta fecada com sucesso!");
        }
    }
    public void depositar(int deposito){
        if(deposito>0){
            this.saldo+=deposito;
            System.out.println("valor depositado com sucesso!");
        }else{
            System.out.println("valor invalido para deposito!");
        }
    }
    public void sacar( int saque){
        if(saque<this.saldo){
           this.saldo-=saque;
           System.out.println("saque efetudo com sucesso!");
        }else if(saque>this.saldo){
            System.out.println("saldo insificiente para saque!");
        }else{
            this.saldo=0;
        }
    }
    public void status(){
        System.out.println("Numero da conta: " + this.numConta);
        System.out.println("Tipo de conta: " + this.tipo);
        System.out.println("Dono da conta: " + this.dono);
        System.out.println("Saldo da conta: " + this.saldo);
    }
}

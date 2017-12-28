package loiane.Aula43.labs1;

public class ContaBancaria {
    
    private String nomeCliente;
    private int numConta;
    private double saldo;
    
    public ContaBancaria(){}
    
    public ContaBancaria(String nomeCliente, int numConta, double saldo){
        this.nomeCliente = nomeCliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }
    
    
    public boolean sacar(double valor){  
        
        if((saldo-valor) >= 0){
            saldo -= valor;
            return true;
        }
        //System.out.println("Não foi possivel sacar");
        return false;   
    }
    
    public void depositar(double valor){
        
        if(valor >= 0)
            saldo += valor;
        else
            System.out.println("Não foi possivel depositar");
        
    }
    
    public double verificarSaldo(){
        return saldo;
    }
    
   @Override
    public String toString(){
        return "Nome do cliente: "+ nomeCliente +"\n" 
        +"Numero da conta: "+ numConta +"\n" 
        +"Saldo: "+ saldo;
    }
    
    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}

package loiane.Aula43.labs1;

public class ContaBancaria {

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

    protected String nomeCliente;
    protected int numConta;
    protected double saldo;
    
    public void sacar(double valor){  
        
        if(valor <= saldo && saldo != 0)
            saldo -= valor;
        else{
            String mensagem = "Não foi possivel sacar";
        }
    }
    
    public void depositar(double valor){
        
        if(valor >= 0)
            saldo += valor;
        else{
            String mensagem = "Não foi possivel depositar";
        }
    }
    
    public double verificarSaldo(){
        return saldo;
    }
    
   @Override
    public String toString(){
        return "Nome da cliente: "+ nomeCliente +"\n" 
        +"Numero da conta: "+ numConta +"\n" 
        +"Saldo: "+ saldo;
    }

}

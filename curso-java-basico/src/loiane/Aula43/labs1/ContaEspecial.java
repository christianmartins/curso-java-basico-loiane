
package loiane.Aula43.labs1;

public class ContaEspecial extends ContaBancaria {
    
    private double limite;
//    private boolean chequeEspecial = false;

    public ContaEspecial() {
    }

    public ContaEspecial(String nomeCliente, int numConta, double saldo) {
        super(nomeCliente, numConta, saldo);
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
//    @Override
//    public boolean sacar(double valor){  
//        if(getSaldo() <= 0 && valor < limite){
//            chequeEspecial = true;
//            setSaldo(getSaldo() - limite); 
//            //saldo -= limite; 
//            limite -= valor; 
//            return true;
//        }
//        return false;
//    }
    
    @Override
    public boolean sacar(double valor){  
        
        double saldoComLimite = this.getSaldo() + limite;
        
        if((saldoComLimite - valor) >=0){
            this.setSaldo(this.getSaldo()-valor);
            return true;
        }
        return false;
    }
    
    @Override
    public String toString(){
        return "-- Conta Especial --"
        +"\nLimite: "+ limite
        +"\n"+ super.toString();
    }
}


package loiane.Aula43.labs1;

public class ContaEspecial extends ContaBancaria {
    
    private double limite;
    private boolean chequeEspecial = false;

    public ContaEspecial() {
    }

    public ContaEspecial(String nomeCliente, int numConta, double saldo) {
        super(nomeCliente, numConta, saldo);
    }
    
    
    
    @Override
    public void sacar(double valor){  
        if(saldo <= 0 && valor < limite){
            chequeEspecial = true;
            saldo -= limite; 
            limite -= valor;       
        }  
        else      
            System.out.println("Não foi possivel usar o cheque especial"); 
    }
}

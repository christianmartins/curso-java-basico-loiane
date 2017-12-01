
package loiane.Aula43.labs1;

public class ContaEspecial extends ContaBancaria {
    
    private double limite;
    private boolean chequeEspecial = false;
    
    @Override
    public void sacar(double valor){  
        if(saldo <= 0 && valor < limite){
            chequeEspecial = true;
            saldo -= limite; 
            limite -= valor;       
        }  
        else{
            String mensagem = "Não foi possivel usar o cheque especial";
        } 
    }
}

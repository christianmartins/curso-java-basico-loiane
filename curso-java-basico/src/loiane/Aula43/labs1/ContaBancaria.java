package loiane.Aula43.labs1;

public class ContaBancaria {

    private String nomeCliente;
    private int numConta;
    private double saldo;
    
    public void sacar(double valor){    
        if(valor <= saldo && saldo != 0)
            saldo -= valor;
    }
    
    public void depositar(double valor){
        if(valor >= 0)
            saldo += valor;
    }
    
    public double verificarSaldo(){
        return saldo;
    }

}

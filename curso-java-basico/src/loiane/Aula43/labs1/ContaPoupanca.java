package loiane.Aula43.labs1;

public class ContaPoupanca extends ContaBancaria {
    
    //private int diaRendimento;
    private double rendimentoAoMes = 0.5;

    public ContaPoupanca() {
    }

    public ContaPoupanca(String nomeCliente, int numConta, double saldo) {
        super(nomeCliente, numConta, saldo);
    }
    
    
    public double calcularNovoSaldo(int quantidadeDeMeses){
        return saldo + (saldo * rendimentoAoMes * quantidadeDeMeses);
    }
    
}

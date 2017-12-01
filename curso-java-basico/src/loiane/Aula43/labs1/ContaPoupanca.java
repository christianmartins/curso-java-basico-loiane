package loiane.Aula43.labs1;

public class ContaPoupanca extends ContaBancaria {
    
    //private int diaRendimento;
    //private String dataAberturaDeConta;
    private double rendimentoAoMes = 0.5;

    
    public double calcularNovoSaldo(int quantidadeDeMeses){
        return saldo + (saldo * rendimentoAoMes * quantidadeDeMeses);
    }
    
}

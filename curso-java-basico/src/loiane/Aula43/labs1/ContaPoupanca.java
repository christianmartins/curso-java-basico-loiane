package loiane.Aula43.labs1;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria {
    
    private int diaRendimento;

    public ContaPoupanca() {
    }

    public ContaPoupanca(String nomeCliente, int numConta, double saldo) {
        super(nomeCliente, numConta, saldo);
    }

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }
   
    @Override
    public String toString() {  
        return "-- Conta Poupança --"
        + "\nDia de rendimento: " + diaRendimento
        + "\n" + super.toString();
    }
    
    public boolean calcularNovoSaldo(double taxaRendimento){
        
        Calendar hoje = Calendar.getInstance();
        
        if(diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)){
            this.setSaldo(this.getSaldo() + (this.getSaldo() * taxaRendimento));
            return true;
        }
        return false;
    }
   
}

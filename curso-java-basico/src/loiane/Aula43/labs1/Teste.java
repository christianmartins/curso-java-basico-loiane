package loiane.Aula43.labs1;

public class Teste {
    
    public static void main(String[] args)  {
//        ContaBancaria c = new ContaBancaria("Christian", 123456, 1000);
//        c.sacar(100);
//        c.depositar(500);
//        System.out.println(c.toString());
        
//        ContaBancaria contaSimples = new ContaBancaria();
//        contaSimples.setNomeCliente("Joao conta simples");
//        contaSimples.setNumConta(123748);
//        contaSimples.depositar(100);    
//        realizarSaque(contaSimples, 7); 
//        System.out.println(contaSimples);

        ContaPoupanca contaPoupanca = new ContaPoupanca("Pedro", 22222, 200);  
        
        contaPoupanca.setDiaRendimento(28);
        
        if(contaPoupanca.calcularNovoSaldo(0.5)){
            System.out.println("Rendimento aplicado, novo saldo é de = " 
            + contaPoupanca.getSaldo());
        }
        else{
            System.out.println("Hoje não é dia de rendimento, novo saldo não calculado");
        }
        
        System.out.println(contaPoupanca);

    }
    
    private static void realizarSaque(ContaBancaria conta, double valor){
        if(conta.sacar(valor)){
            System.out.println("Saque efetuado com sucesso, novo saldo = "
            + conta.getSaldo());
        }
        else{
            System.out.println("Saque insuficiente para saque de " + valor 
            +"\n Saldo atual = " + conta.getSaldo());
        }
        
        
    }
}

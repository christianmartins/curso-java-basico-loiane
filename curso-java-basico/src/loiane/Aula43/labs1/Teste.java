package loiane.Aula43.labs1;

public class Teste {
    public static void main(String[] args) {
        ContaBancaria c = new ContaBancaria();
        
        c.depositar(100);
        c.sacar(100);
        System.out.println(c.verificarSaldo());
    }
}

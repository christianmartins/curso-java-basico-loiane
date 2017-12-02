package loiane.Aula43.labs1;

public class Teste {
    
    public static void main(String[] args)  {
        ContaBancaria c = new ContaBancaria("Christian", 123456, 1000);

        c.sacar(100);
        c.depositar(500);
        System.out.println(c.toString());
  
    }
}

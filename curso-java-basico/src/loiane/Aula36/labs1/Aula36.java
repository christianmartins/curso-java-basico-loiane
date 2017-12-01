package loiane.Aula36.labs1;
import loiane.Aula36.labs1.Agenda;
import java.util.Scanner;
public class Aula36 {
    
    private Scanner sc = new Scanner(System.in);
    private String nome;
    
    
    
    
    public Aula36(){
        
        System.out.println("Digite o nome da agenda: ");
        nome = sc.nextLine();
        Agenda a = new Agenda(nome);
        Contato[] contato = new Contato[1];
         
        for(int i = 0; i < 1; i++){
            Contato c = new Contato();
            System.out.println("Digite o nome do contato "+ (i+1) +" : ");
            nome = sc.nextLine();
            c.setNome(nome);
            
            System.out.println("Digite o email do contato "+ (i+1) +" : ");
            String email = sc.nextLine();
            c.setEmail(email);
            
            System.out.println("Digite o telefone do contato "+ (i+1) +" : ");
            String telefone = sc.nextLine();
            c.setTelefone(telefone);
        }
        
        System.out.println(a.toString());
        for (int i = 0; i < 1; i++) {
            System.out.println(contato[i].toString());
        }
    }
}

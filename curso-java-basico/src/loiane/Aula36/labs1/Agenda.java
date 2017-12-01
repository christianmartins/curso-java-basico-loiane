package loiane.Aula36.labs1;

public class Agenda {
    private String nome;
    
    private Contato[] contato = new Contato[3];
    
    public Agenda(String nome){     
        this.nome = nome;  
    }   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Contato[] getContato() {
        return contato;
    }

    public void setContato(Contato[] contato) {
        this.contato = contato;
    }
    
    public String toString(){
        return "Nome da agenda: "+ nome;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loiane.Aula36.labs1;

/**
 *
 * @author Christian
 */
public class Contato {
    private String nome;
    private String telefone;
    private String email;
    
    public Contato(){}
    
    public Contato(String nome, String telefone, String email){
        
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String toString(){
        return "Contato"
                + "\nNome: " + nome 
                + "\nTelefone: "+ telefone
                + "\nEmail: "+ email;  
    }
    
}

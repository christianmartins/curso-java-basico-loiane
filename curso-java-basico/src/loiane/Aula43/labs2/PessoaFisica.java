/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loiane.Aula43.labs2;

/**
 *
 * @author Christian
 */
public class PessoaFisica extends Pessoa {

    public PessoaFisica(String nome) {
        super(nome);
    }

    @Override
    public void calcularImposto() {
        
        if(rendaBruta < 0){
            System.out.println("Renda Bruta invalida");
        }
        else if(rendaBruta <= 1400){
            imposto = 0;
        }
        else if(rendaBruta <= 2100){
            imposto = rendaBruta * 10 / 100;
        }
        else if(rendaBruta <= 2800){
            
        }
        else if(rendaBruta <= 3600){
           
        }
        else{
        
        }
        
    }
    
}

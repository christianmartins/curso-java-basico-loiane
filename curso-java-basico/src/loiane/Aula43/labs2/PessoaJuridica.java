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
public class PessoaJuridica extends Pessoa {

    public PessoaJuridica(String nome) {
        super(nome);
    }

    @Override
    public void calcularImposto() {
        imposto = rendaBruta * 10 / 100;
    }
    
}

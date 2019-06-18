/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceção;

/**
 *
 * @author ifnmg
 */
public class Pessoa {
    
    private String Nome;
    
    public Pessoa(String Nome) throws ParametroVazioException{
        this.setNome(Nome);
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) throws ParametroVazioException{
        if(Nome.isEmpty()){
            throw new ParametroVazioException("Nome Vazio!");
        }
        this.Nome = Nome;
    }
    
    
    
}

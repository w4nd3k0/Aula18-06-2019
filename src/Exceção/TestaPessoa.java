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
public class TestaPessoa {
    
    public static void main(String[] args){
        
        try{
            Pessoa p1 = new Pessoa("Ana");
            Pessoa p2 = new Pessoa("");
            Pessoa p3 = new Pessoa("Carlos");
        }
        catch(ParametroVazioException e){
            System.out.println(e.getMessage());
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atp.michele.folhadepagamento;

/**
 *
 * @author User
 */
public class Dependentes {
     public int idade;
     
     public Dependentes ( int idade) {
        this.idade = idade;
    }
    
    //Verificar Limite de idade 
    public boolean estaNaIdadeLimite(int valor){
        
        if(this.idade >= valor) {
            return false;
       }
       else {
            return true;
       
        }
}
}

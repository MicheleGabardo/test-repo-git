/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atp.michele.folhadepagamento;
import java.util.ArrayList;
/**
 *
 * @author User
 */
public class Funcionario {

    public int codigo;
    public double salario;
    public int nDependentes;  
        
    
    // Armazena a lista de Dependentes
    public ArrayList<Dependentes> pdependente = new ArrayList<Dependentes>();
    
    public boolean associaDependente (Dependentes d){
        
       // limite de 05 dependentes
       
       if (pdependente.size () > 5) {
            System.out.println("Não é possível cadastrar mais de 05 dependentes.");
            return false;
       }
       else {
           pdependente.add(d);
           return true;
       }
       }
    
    public int ndepconsideraIdadeLimite(int valor){
          
        int totalDepIdadeLimite = 0; //percorrer a lista e ver quantos estão na idade limite
        for(Dependentes d: this.pdependente) { 
                
            if (d.estaNaIdadeLimite(valor));
                totalDepIdadeLimite = totalDepIdadeLimite + 1;
                }
                                   
            return totalDepIdadeLimite;
    }
    
    public double calculaValorMensal(){
        return 0;
    }
    
    public void imprimeInfo(){
        System.out.println("O Código do funcionário é: "+ this.codigo);
        System.out.println("O salário, sem gratificações, é de R$ " + this.salario);
    }

    
}




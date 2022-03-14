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
public class Concursados extends Funcionario {
    public int anoscontrato;    
    public double gratifica = 200;
    public int valordependente = 100;
   
    // Método Construtor da Classe 
public Concursados (int codigo, double salario, int nDependentes, int anoscontrato){
    this.codigo = codigo;
    this.salario = salario;
    this.nDependentes = nDependentes;
    this.anoscontrato = anoscontrato;
            }

   //Cálculo salário total mensal
     public double calculaValorMensal () {
        double gratificacaoparcial = gratifica * anoscontrato;
        int totalDepIdadeLimite = this.ndepconsideraIdadeLimite(21);
        double acrescimo = totalDepIdadeLimite * valordependente; 
        double salarioTotalFunc = gratificacaoparcial + salario + acrescimo;
    
        return salarioTotalFunc;
     }
                 
    public void imprimeInfo(){
        System.out.println("Referente aos Funcionários Concursados:");
        super.imprimeInfo();
        System.out.println("O Tempo de Contrato do funcionário é de "  + this.anoscontrato + " anos.");
        System.out.println("O Salário Total do funcionário é  R$ " +  this.calculaValorMensal());
            }
}


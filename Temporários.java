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
public class Temporários extends Funcionario{
    public int mesescontrato;
    public double gratifica = 150;
    public int valordependente = 50;
 
    // Método Construtor da Classe 
public Temporários (int codigo, double salario, int nDependentes, int mesescontrato){
    this.codigo = codigo;
    this.salario = salario;
    this.nDependentes = nDependentes;
    this.mesescontrato = mesescontrato;
            }
    //Cálculo salário total mensal
    public double calculaValorMensal () {
        double gratificacaoparcial = gratifica * mesescontrato;
        int totalDepIdadeLimite = this.ndepconsideraIdadeLimite(18);
        double acrescimo = totalDepIdadeLimite * valordependente; 
        double salarioTotalFunc = gratificacaoparcial + salario + acrescimo;
   
        return salarioTotalFunc;
        }
    
   
    public void imprimeInfo(){
        System.out.println("Referente aos Funcionários Temporários:");
        super.imprimeInfo();
        System.out.println("O Tempo de Contrato do funcionário é de " + this.mesescontrato + " meses.");
        System.out.println("O Salário, com gratificação, do funcionário é  R$ " + this.calculaValorMensal());
        
    }
}






/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atp.michele.folhadepagamento;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author User Michele Gabardo Machado
 */
public class ATPMicheleFolhadePagamento {

     // Lista armazenando todos os funcionarios
    public static ArrayList <Funcionario> pfuncionario;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      // Entrada de Dados dos funcionários
    
       Scanner teclado = new Scanner(System.in);
       System.out.print("Informe o Número de Funcionários:");
       int nFuncionario = teclado.nextInt(); teclado.nextLine();
       
       pfuncionario = new ArrayList<Funcionario>();
                       
       int cont = 0;
       while(cont <nFuncionario){
           
            System.out.print("Digite o Código do Funcionário:");
            int codigo = teclado.nextInt();teclado.nextLine();
                             
            System.out.print("Digite o Salário Base: ");
            double salario = teclado.nextDouble();   
            
            System.out.print("Digite o Número de Dependentes: ");
            int nDependentes = teclado.nextInt(); teclado.nextLine();   
            
            // Dados dos Dependentes
            ArrayList<Dependentes> pdependente = new ArrayList<Dependentes>();
            
            int n =0;
            
            while (n < nDependentes){
                System.out.println("Dependente" + n );
                System.out.println ("Informe a idade do dependente");
                    int idade = teclado.nextInt();teclado.nextLine();
            
            Dependentes d = new Dependentes (idade);
            
            pdependente.add(d);
            n++;}
            
            // Verificar se o Funcionário é Concursado ou Temporário
            System.out.print("Digite o tipo de Contrato: 1 - Concursado e 2 - Temporário:");
            int contrato = teclado.nextInt();teclado.nextLine();
                                   
            if (contrato == 1){
                System.out.println("Informe há quantos anos atua na empresa");
                int anoscontrato = teclado.nextInt(); teclado.nextLine();
                                
                Concursados func = new Concursados(codigo, salario, nDependentes, anoscontrato);
                
                // Associação dos Dependentes
                for(Dependentes d: pdependente){
                    func.associaDependente(d);
                }
                
                pfuncionario.add(func);
            }   
            
            else {        
               System.out.println("Informe em meses o tempo do contrato com a empresa");
               int mesescontrato = teclado.nextInt(); teclado.nextLine();
                              
               Temporários func = new Temporários(codigo, salario, nDependentes, mesescontrato);
               
                // Associação dos Dependentes
                for(Dependentes d: pdependente){
                    func.associaDependente(d);
                }
                
                pfuncionario.add(func);
            
            }   
            cont++;
            
            for(Funcionario func: pfuncionario){
                func.calculaValorMensal();
            }
            
            for(Funcionario func: pfuncionario){
                func.imprimeInfo(); 
                        }
       }
    }
}
       
 
   
   

    


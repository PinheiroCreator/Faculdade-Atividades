/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fatesg.atividade1509;

/**
 *
 * @author pinheirocreator
 */
public class Gerente extends Funcionario {

     private double bonificacao;

    public double getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(double bonificacao) {
        this.bonificacao = bonificacao;
    }
      
   public Gerente (String nome, double salario, String cpf, String email, String telefone, double bonificacao, String cargo) {
       
       super(nome,salario,cpf,email,telefone,cargo);
       this.bonificacao = bonificacao;
   }
    
   private double calcularBonificacao() {
       
       return super.getSalario() + this.bonificacao;
   }
   
   @Override
   
   protected void exibirInfo() {
       
       super.exibirInfo();
       
       System.out.printf("\nBonificaçao: %.2f\nSalario total: %.2f", this.bonificacao, calcularBonificacao());
   }
   
}




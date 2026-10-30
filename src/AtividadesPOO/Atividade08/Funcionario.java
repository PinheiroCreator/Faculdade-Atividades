/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pinheirocreator
 */
public class Funcionario {
    
    private String nome;
    private double salario;
    private String cpf;
    private String email;
    private String telefone;
    private String cargo;
    
    

    public String getNome() { return nome; }

    public void setNome(String nome) {this.nome = nome;}

    public double getSalario() {return salario;}

    public void setSalario(double salario) {this.salario = salario;}

    public String getCpf() {return cpf;}

    public String getEmail() {return email;}

    public void setEmail(String email) {this.email = email;}

    public String getTelefone() {return telefone;}

    public void setTelefone(String telefone) {this.telefone = telefone;}
  
    public String getCargo() { return cargo; }
    
    public void setCargo(String cargo) {this.cargo = cargo;}
    
    public Funcionario (String nome, double salario, String cpf, String email, String telefone, String cargo) {
      
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.salario = salario;
        this.cargo = cargo;
        
    }
    
    protected void exibirInfo() {
        
        System.out.printf("\nNome: %s\nCpf: %s\nEmail: %s\nTelefone: %s\nSalario: %.2f\nCargo: %s",this.nome, this.cpf, this.email, this.telefone, this.salario, this.cargo);
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fatesg.atividade0809;

/**
 *
 * @author pinheirocreator
 */
public class Produto {
    
    String nome;
    int quantidade;
    double preco;
    
    public Produto (String nome, double preco, int quantidade) {
        
        this.nome = nome;
        this.preco =  preco;
        this.quantidade =  quantidade;
}
    
    public Produto (String nome, double preco) {
        
        this(nome, preco, 1);
    }
    
}

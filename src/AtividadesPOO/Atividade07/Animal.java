/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pinheirocreator
 */
public class Animal {
    
    String nome;
    double peso;
    
    public Animal (String nome) {
        this.nome =  nome;
    
}
}
    class Cachorro extends Animal {
        
      String raca;
        
        public Cachorro (String nome, String raca) {
            
            super(nome);
            
            this.raca = raca;
        }
    }
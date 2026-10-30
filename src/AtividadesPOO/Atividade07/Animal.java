package AtividadesPOO.Atividade07;

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
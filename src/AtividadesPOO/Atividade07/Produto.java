package AtividadesPOO.Atividade07;

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

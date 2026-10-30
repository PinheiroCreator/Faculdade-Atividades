package AtividadesPOO.Atividade07;

public class Filme {
    
    String titulo, diretor;
    int durancao;
    
    public Filme (String titulo, String diretor, int duracao) {
        
        this.titulo = titulo;
        this.diretor = diretor;
        this.durancao = duracao;
    }
    
    public Filme (String diretor) {
        
        this(null,diretor,120);
    }
    
    
    
}

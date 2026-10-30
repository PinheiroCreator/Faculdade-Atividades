package AtividadesPOO.Atividade07;

public class Livro {
    
    String titulo;
    String autor;
    int paginas;
    
    public Livro (String titulo, String autor, int paginas) {
        
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }
    
    public Livro (String titulo) {
        this(titulo,null,0);
    }
    
}

package AtividadesPOO.Atividade03;

public class Livro {
    
    public String titulo;
    private String autor;
    protected int paginas;
    
    public Livro(String titulo, String autor, int paginas) {
        
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    
    }
    
    public void exibirInfo() {
        
        System.out.println("Titulo: " + titulo);
        System.out.println("Paginas: " + paginas);
    }
    
}

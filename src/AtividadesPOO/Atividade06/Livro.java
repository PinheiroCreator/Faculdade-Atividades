package AtividadesPOO.Atividade06;

public class Livro {

    public String titulo;
    private String autor;
    protected int paginas;
    
    public Livro(String titulo, String autor, int paginas) {
        
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public void setAutor(String Autor) {
        if(Autor != null) {
            this.autor = Autor;
        }
        
        else {
            System.out.println("ERRO! DIGITE UM AUTOR VALIDO!");
        }
    }
    
    
    
    public void exibirInfo() {
        System.out.println(titulo + "-" + paginas + "paginas");
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fatesg.atividade0809;

/**
 *
 * @author pinheirocreator
 */
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

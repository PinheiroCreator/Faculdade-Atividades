/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pinheirocreator
 */
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

package Atividade1;

public class Main {
    
    public static void main(String[] args) {
        
       //----------------------------------------------------------------------------
        
       //pessoa
       
    
    Pessoa EuOBrabo = new Pessoa();
    
        EuOBrabo.nome = "Matheus";
        EuOBrabo.idade = 18;
        EuOBrabo.altura = 1.78;
        EuOBrabo.nacionalidade = "Brasileiro";
        
        
        EuOBrabo.exibir();
        EuOBrabo.aniversario();
        
        //----------------------------------------------------------------------------
        
       //RETANGULO
       
       Retangulo novoRetangulo = new Retangulo();
       
       novoRetangulo.altura = 22.0;
       novoRetangulo.largura = 13.0;
       
      novoRetangulo.calcularArea();
      novoRetangulo.calcularPerimetro();
      
      novoRetangulo.exibirArea();
      novoRetangulo.exibirPerimetro();
              
         
       
       
    }
    
}

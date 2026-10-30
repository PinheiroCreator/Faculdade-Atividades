package AtividadesPOO.Atividade01;

public class Main {
    
    public static void main(String[] args) {
        
       //----------------------------------------------------------------------------
        
       //pessoa
       
    
    Pessoa Eu = new Pessoa();
    
        Eu.nome = "Matheus";
        Eu.idade = 18;
        Eu.altura = 1.78;
        Eu.nacionalidade = "Brasileiro";
        
        
        Eu.exibir();
        Eu.aniversario();
        
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

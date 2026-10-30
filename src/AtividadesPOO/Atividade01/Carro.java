package AtividadesPOO.Atividade01;

public class Carro {

    String marca;
    String modelo;
    int ano;
    
    public void ligar() {
        System.out.println("O carro ligou!!!");
    }
    
    public void mostrarinfo() {
        
        System.out.printf("Modelo: %s\nMarca: %s\nAno: %s",modelo,marca,ano);
    }
  }
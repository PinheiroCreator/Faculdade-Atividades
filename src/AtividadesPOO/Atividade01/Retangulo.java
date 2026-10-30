
public class Retangulo {
    
    double altura, largura;
    
    public double calcularArea() {
        return altura * largura;
    }
    
    public double calcularPerimetro () {
        return 2 * (altura + largura);
    } 
    
     public void exibirArea() {
        System.out.println("Área: " + calcularArea());
    }
     
     public void exibirPerimetro() {
         System.out.println("Perimetro: " + calcularPerimetro());
     }

    }
    

package fatesg.aula2909try;

public class ComTratamento {
    
    public static void main(String[] args) {
       
    double[] notas = {10.00, 7.8 ,9.5, 8.2 , 4.0 };
    
     try {
         double quantidade = notas[8];
         System.out.println("8º nota:  " + quantidade);
     }
     catch (ArrayIndexOutOfBoundsException e) {
         
         System.out.println("ERRO: " + e.getMessage());
     }
     finally {
         System.out.println("Processamento de notas finalizado.");
     }



        
    }
}


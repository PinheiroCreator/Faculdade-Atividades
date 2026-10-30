/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package fatesg.aula2209;

/**
 *
 * @author pinheirocreator
 */
public class Aula2209 {
    
  public static void main(String[] args) {
    
    Usuario[] usuarios = {
        
        new UsuarioBasico("Pinheiro", "ratojogarato171@email.com", "Basico"),
        new UsuarioPremium("Indiano Einstein", "neymar@gmail.com", "Premium"),
        new UsuarioFamilia("Familia da Pesada", "kanyeWest@top.com", "Familia")
    };
    
    for (Usuario i : usuarios) {
        
        System.out.printf("\n\nNome: %s\nConta: %s\nValor R$: %.2f",i.getNome(), i.getTipoDeConta(),i.calcularPreco());
    }
    
    Corrida[] corridas = {
        
        new CorridaCarro("Goiania", "Brasilia", 180.00, "Polo 2005", "123x456"),
        new CorridaMoto("Jardim Guanabara", "Bueno", 20.00, "CG 150", "133f999"),
        new CorridaExecutiva("Centro", "Aeroporto", 15.00, "Golf GTI", "000s4f6")        
    };
    
    for (Corrida c : corridas) {
        
        System.out.printf("\n\nOrigem: %s\nDestino: %s\nDistancia: %.2f KM\nModelo do veiculo: %s\nPlaca: %s\n\nValor: %.2f",c.getOrigem(), c.getDestino(), c.getDistancia(), c.getModelo(), c.getPlaca(), c.calcularValor(0));
    }
    
    
  }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fatesg.leituradearquiv;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author pinheirocreator
 */
public class EscreverUsuario {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String caminho = "/home/pinheirocreator/NetBeansProjects/LeituraDeArquiv/goias.txt";
     
        System.out.println("Digite o texto que deseja salvar: ");
        String texto = sc.nextLine();
               
        try (FileWriter escritor = new FileWriter (caminho, true)) {
            
            escritor.write(texto + System.lineSeparator());
            
            System.out.println("Texto gravado com sucesso");
        }
        catch (IOException e) {
                System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
                }
        
   
    }
    
}

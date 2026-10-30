
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fatesg.leituradearquiv;

import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author pinheirocreator
 */
public class EscreverAquivo {

    public static void main(String[] args) {
        
        String caminho = "/home/pinheirocreator/NetBeansProjects/LeituraDeArquiv/goias.txt";
        String texto1 = "Hello, world";
        String texto2 = "testeeeeee";
               
        try (FileWriter escritor = new FileWriter (caminho, true)) {
            
            escritor.write(texto1 + System.lineSeparator());
            escritor.write(texto2 + System.lineSeparator());
            System.out.println("Texto gravado com sucesso");
        }
        catch (IOException e) {
                System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
                }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package fatesg.leituradearquiv;
import java.io.File;
import java.io.IOException;


public class LeituraDeArquiv {

    public static void main(String[] args) {
        
        try {
            File arquivo = new File("/home/pinheirocreator/NetBeansProjects/LeituraDeArquiv/goias.txt");
            
            if(arquivo.createNewFile()) {
            
                System.out.println("Arquivo criado: " + arquivo.getName());
                
            }
            
            else {System.out.println("O arquivo ja existe"); }
            
        } catch (IOException e) {

            System.out.println("Erro ao criar o arquivo: " + e.getMessage());
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fatesg.leituradearquiv;

/**
 *
 * @author pinheirocreator
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class LerArquivo {

    public static void main(String[] args) {

        
            String caminho = "/home/pinheirocreator/NetBeansProjects/LeituraDeArquiv/goias.txt";
            
            try (Scanner leitor = new Scanner (new File(caminho))) {
                
                while(leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                System.out.println(linha);
            }
            
            } catch(FileNotFoundException e) {
               
                System.out.println("Arquivo nao encontrado: " + e.getMessage());
            }
        
    }
}

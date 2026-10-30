package fatesg.atividade1308;

import java.util.Scanner;

public class Produto {

    String nome;
    double preco;
    int quantidadeEmEstoque;

    public void vender(Scanner sc) {

        if (quantidadeEmEstoque <= 0) {
            System.out.println("Nao tem Produto em estoque para ser vendido!!!!!!");
        } else {
            System.out.println("Qual a quantidade vendida?: ");
            int quantidadeVendida = sc.nextInt();

            if (quantidadeVendida > quantidadeEmEstoque) {
                System.out.println("Voce tem apenas " + quantidadeEmEstoque + "em estoque! \nNao foi possivel realizar a venda!!!!!");
            } 
            
            else {
                quantidadeEmEstoque = quantidadeEmEstoque - quantidadeVendida;
                System.out.println("Venda realizada com sucesso!!!!!!!!!    !!!!!!!!!!!");
            }
        }
    }

    public void reabastecer(Scanner sc) {
        
        System.out.println("Qual a quantidade que chegou em estoque: ");
        int quantidadeAbastecida = sc.nextInt();
        quantidadeEmEstoque += quantidadeAbastecida;
    }

       public void exibirInformacoes() {
        System.out.println("--------------------------------------------------------------");
        System.out.println("\nNome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade no EStoque: " + quantidadeEmEstoque);
        System.out.println("--------------------------------------------------------------");
    }

}

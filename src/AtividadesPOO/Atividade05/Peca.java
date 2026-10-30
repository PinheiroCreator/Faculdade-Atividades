package AtividadesPOO.Atividade05;

import java.util.Scanner;

public class Peca {

    private String nome, codigoFabricante;
    private double preco;
    private int quantidadeEstoque;

    public Peca(String nome, String codigoFabricante, double preco, int quantidadeEstoque) {

        this.nome = nome;
        this.codigoFabricante = codigoFabricante;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void exibirInfo() {

        System.out.println("----------------------------------------------------------------");
        System.out.println("\n\nNome: " + nome);
        System.out.println("Codigo do Fabricante: " + codigoFabricante);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade em Estoque: " + quantidadeEstoque + "\n");
        System.out.println("----------------------------------------------------------------");
            
    }

    public static void alterarPecas(Scanner sc) {

        System.out.println("Escolha a peça que deseja modificar:\n\n1- Turbina\n2- Filtro Esportivo\n3- Escapamento\n4- Multi-Midia\n5- Pistao");
        int escolherPeca = sc.nextInt();

        if (escolherPeca < 1 || escolherPeca > Oficina.pecasAutomotivas.length) {
            System.out.println("Opçao Invalida!!!!!");
            return;
        }

        Peca pecaAlterar = Oficina.pecasAutomotivas[escolherPeca - 1];

        pecaAlterar.exibirInfo();

        System.out.println("Qual Atributo deseja alterar: \n\n1- Nome\n2- Codigo do Fabricante\n3- Preco\n4- Quantidade em Estoque\nResposta:");
        int atributo = sc.nextInt();

        sc.nextLine();

        switch (atributo) {

            case 1 -> {
                System.out.println("Novo nome: ");
                pecaAlterar.nome = sc.nextLine();

                System.out.println("Alteraçao feita com sucesso!!!!!");
            }

            case 2 -> {
                System.out.println("Novo Codigo de Fabricante: ");
                pecaAlterar.codigoFabricante = sc.nextLine();

                System.out.println("Alteraçao feita com sucesso!!!!!");
            }

            case 3 -> {
                System.out.println("Novo preço(Exp: 0,00): ");
                pecaAlterar.preco = sc.nextDouble();

                System.out.println("Alteraçao feita com sucesso!!!!!");
            }

            case 4 -> {
                System.out.println("Nova Quantidade: ");
                pecaAlterar.quantidadeEstoque = sc.nextInt();

                System.out.println("Alteraçao feita com sucesso!!!!!");
            }
        }
    }
    
    protected static void exibirEstoque() {

        for (int i = 0; i < Oficina.pecasAutomotivas.length; i++) {
            Peca estoque = Oficina.pecasAutomotivas[i];
            estoque.exibirInfo();
        }
    }
}

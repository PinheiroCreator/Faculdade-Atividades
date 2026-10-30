import java.util.Scanner;

public class Cliente {
    
    private String usuarioCliente, senhaCliente;

    protected static void menuCliente(Scanner sc) {
    
        while (true) {
        
            System.out.println("\n\nMENU CLIENTE!!!!!!");
            
            System.out.println("Escolha uma opçao: \n\n1- Exibir estoque\n2- Fazer um pedido\n3- Ver ordens de serviço\n0- Sair");
            int escolhaCliente = sc.nextInt();
            
            sc.nextLine();
            
            switch (escolhaCliente) {
            
                case 1 -> {Peca.exibirEstoque();}
                
                case 2 -> {OrdemDeServico.fazerPedido(sc);}
                
                case 3 -> {OrdemDeServico.exibirOrdens();}
                
                case 0 -> {return;}
                
                default -> {System.out.println("Opçao invalida!!!!!!!\n\n");}
            }
        }
    }
}
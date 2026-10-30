import java.util.Scanner;

public class Admin {
 
    private String usuarioAdmin, senhaAdmin;
    private boolean ehAdmin;
   
    protected void verificacaoAdmin(Scanner sc) {
    
        System.out.println("Oficina do ZE\n\n1- Admin\n2- Cliente\n");
        int admnOhCliente = sc.nextInt();
    
        sc.nextLine();
        
        switch (admnOhCliente) {
            case 1 -> {
                System.out.println("Usuario: ");
                usuarioAdmin = sc.nextLine();
        
                System.out.println("Senha: ");
                senhaAdmin = sc.nextLine();
                
                if (usuarioAdmin.equalsIgnoreCase("admin") && senhaAdmin.equalsIgnoreCase("senha123")) {
                    menuAdmin(sc);
                }
            }
            case 2 -> {
                Cliente.menuCliente(sc);
            }
        }
    }
    private static void menuAdmin(Scanner sc) {
        while (true) {
           
            System.out.println("\n\nMENU ADMIN!!!!!!");
            
            System.out.println("Escolha uma opçao: \n\n1- Exibir estoque\n2- Ver Chamados de cliente\n3- Alterar peça\n0- Sair");
            int escolhaAdmin = sc.nextInt();
            
            switch (escolhaAdmin) {
                case 1 -> {
                    Peca.exibirEstoque();
                }
                case 2 -> {
                    OrdemDeServico.atenderChamados(sc);
                }
                case 3 -> {
                    Peca.alterarPecas(sc);
                }
                case 0 -> {
                    return;
                }
                default -> {
                    System.out.println("Opçao invalida!!!!!!!\n\n");
                }
            }
        }
    }
}
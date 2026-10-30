
import java.util.Scanner;

public class Atividade1308 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("Atividade 13/08\nMatheus Pinheiro - ADS\n\n== Menu de Escolha ==\n\n1- EStacionamento\n2- Produto\n3- Filme\n4- Paciente\n5- Funcionario\n0- Sair\n");

            System.out.println("Escolha a questao: ");
            int pergunta = sc.nextInt();

            switch (pergunta) {

                case 1 -> {

                    Estacionamento meuCarro = new Estacionamento();

                    meuCarro.placa = "T35T67";

                    System.out.println("Quantas horas voce ficou estacionado?: ");
                    meuCarro.horasEstacionadas = sc.nextInt();

                    meuCarro.calcularValorCobranca();

                    meuCarro.exibirTiquete();
                }

                case 2 -> {

                    Produto produto1 = new Produto();

                    produto1.nome = "Tenis Nike Air max 95";
                    produto1.preco = 1500.0;
                    produto1.quantidadeEmEstoque = 0;

                    while (true) {

                        System.out.println("\n\n===== Loja de Tenis =====\n\n1- Ver informaçoes\n2-Reabastecer Estoque\n3- Realizar venda\n0- Sair\n");

                        System.out.println("Escolha a operaçao desejada: ");
                        int escolhaMenuProduto = sc.nextInt();

                        switch (escolhaMenuProduto) {

                            case 1 -> {
                                produto1.exibirInformacoes();
                            }

                            case 2 -> {
                                produto1.reabastecer(sc);
                                
                                System.out.println("Agora voce tem: " + produto1.quantidadeEmEstoque);
                            }

                            case 3 -> {
                                produto1.vender(sc);
                            }
                            
                            case 0 -> {
                                return;
                            }
                            
                            default  -> {
                                System.out.println("\nError!!!! Escolha uma opçao valida!\n\n");
                            }
                        }
                    }
                }
                
                case 3 -> {
                    
                    Filme novoFilme = new Filme();
                    
                    sc.nextLine();
                     
                    System.out.println("Qual o titulo do filme?: ");
                        novoFilme.titulo = sc.nextLine();
                        
                    System.out.println("Qual a durançao dele em horas: ");
                        novoFilme.duracaoEmHoras = sc.nextDouble();
                        
                        sc.nextLine();
                        
                    System.out.println("Qual o diretor do filme: ");
                        novoFilme.diretor = sc.nextLine();
                        
                     novoFilme.verificarFilmeClassico(sc);
                     
                     novoFilme.exibirDetalhes();
                }
                
                case 4 -> {
                    
                    Paciente novoPaciente = new Paciente();
    
                    sc.nextLine();
                
                    novoPaciente.cadastrar(sc);
    
                    novoPaciente.exibirFicha();
                }
                
      
                case 5 -> {
                    
                    Funcionario novoFuncionario = new Funcionario();
    
                    sc.nextLine();
    
                    novoFuncionario.cadastrar(sc);
    
                    novoFuncionario.exibirContracheque();
                }
                
                case 0 -> {
                    return;
                }
                
                default -> {
                    System.out.println("\n\nERRO OPÇAO INVALIDA!!!\n\n");
                }
            }
           
        }
    }
}

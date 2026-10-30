
import java.util.Scanner;

public class Atividade2008 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1- Produto\n2- Aluno \n0- Sair\n\nQual atividade deseja (20/08/26): ");
        int escolha = sc.nextInt();

        while (true) {

            switch (escolha) {

                case 1 -> {

                    Produto tenis = new Produto();

                    tenis.nome = "nike airmax 95";
                    tenis.quantidade = 77;
                    //tenis.preco = 1.999;

                    tenis.exibirInfo();

                    System.out.println("");

                    tenis.venderProduto(sc, 0);
                    return;
                }

                case 2 -> {

                    Aluno novoAluno = new Aluno();

                    novoAluno.nome = "Matheus Pinheiro Machado";
                    novoAluno.matricula = "67676767676766";
                    //  novoAluno.idade = 99;

                    //   novoAluno.validarIdade();
                    novoAluno.exibirDados();
                    
                    return;
                }
                
                case 0 -> {
                    return;
                }
                
                default -> {
                    System.out.println("Escolha uma opçao valida!!!!\n\n");
                }
            }
        }
    }
}

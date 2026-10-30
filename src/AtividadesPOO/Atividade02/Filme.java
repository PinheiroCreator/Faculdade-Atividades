import java.util.Scanner;

public class Filme {
    
    String titulo;
    String diretor;
    int anoLancamento;
    double duracaoEmHoras;
    
    public void exibirDetalhes() {
        System.out.println("\n\n\nNome do Filme: " + titulo);
        System.out.println("Duraçao: " + duracaoEmHoras + " Horas");
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Diretor: " + diretor);
    }
    
    public void verificarFilmeClassico(Scanner sc) {
        
        System.out.println("Em que ano o filme foi lançado?: ");
            anoLancamento = sc.nextInt();
            
            if(anoLancamento - 2026 >= 30) {
                System.out.println("\\n\nO filme " + titulo + " e considerado um CLASSICO!!!\n\n");
            }
            
            else {
                System.out.println("\n\nO filme " + titulo + " nao e considerado classico!\n\n");
            }
    }
    
}

package fatesg.atividade252708;
import java.util.Scanner;

public class Oficina {

    static Peca pecasAutomotivas[] = new Peca[5];
    static OrdemDeServico ordensDeServico[] = new OrdemDeServico[20];
    static int totalOrdens = 0;
    static Admin admin1 = new Admin();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        pecasAutomotivas[0] = new Peca("Turbina", "1w6788", 1345.89, 3);
        
        pecasAutomotivas[1] = new Peca("Filtro Esportivo", "3458712", 145.77, 77);
        
        pecasAutomotivas[2] = new Peca("Escapamento 2 saidas", "8w9981", 100.00, 180);
        
        pecasAutomotivas[3] = new Peca("Multi-Midia", "9i8533", 347.12, 34);
        
        pecasAutomotivas[4] = new Peca("Pistao", "20y568-gpm", 56.99, 450);
       
   //     Peca.exibirEstoque();

        ordensDeServico[0] = new OrdemDeServico("Barulho no motor", 250.00);
        
        ordensDeServico[1] = new OrdemDeServico("Troca de pastilha de freio", 120.00);
        
        ordensDeServico[2] = new OrdemDeServico("Ar condicionado nao gela", 180.50);
        
        ordensDeServico[3] = new OrdemDeServico("Vazamento de oleo", 300.00);
        
        ordensDeServico[4] = new OrdemDeServico("Revisao geral", 400.00);
        
        totalOrdens = 5;
        
       // OrdemDeServico.exibirOrdens();

        admin1.verificacaoAdmin(sc);
    }
}
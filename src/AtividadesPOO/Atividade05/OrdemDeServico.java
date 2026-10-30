import java.util.Scanner;

public class OrdemDeServico {

    private int numero;
    private String descricaoProblema, status;
    double valorMaoDeObra;

    private static int contadorNumero = 1;

    public OrdemDeServico(String descricaoProblema, double valorMaoDeObra) {
            
        this.numero = contadorNumero;
        contadorNumero++;
        this.descricaoProblema = descricaoProblema;
        this.valorMaoDeObra = valorMaoDeObra;
        this.status = "aberta";
    }

    public void exibirInfo() {
        
        System.out.println("----------------------------------------------------------------");
        System.out.println("\n\nNumero da OS: " + numero);
        System.out.println("Problema: " + descricaoProblema);
        System.out.println("Valor Mao de Obra: " + valorMaoDeObra);
        System.out.println("Status: " + status + "\n");
        System.out.println("----------------------------------------------------------------");
    }

    public static void fazerPedido(Scanner sc) {
        
        if (Oficina.totalOrdens >= Oficina.ordensDeServico.length) {
            System.out.println("Limite de ordens de serviço atingido!!!!!");
            return;
        }
        
        System.out.println("Descreva o problema: ");
        String descricao = sc.nextLine();
        
        System.out.println("Valor da mao de obra(Exp: 0,00): ");
        double valor = sc.nextDouble();
        
        sc.nextLine();
        
        OrdemDeServico novaOrdem = new OrdemDeServico(descricao, valor);
        
        Oficina.ordensDeServico[Oficina.totalOrdens] = novaOrdem;
        
        Oficina.totalOrdens++;
        System.out.println("Ordem de serviço numero " + novaOrdem.numero + " aberta com sucesso!!!!!");
    }

    protected static void exibirOrdens() {
        
        if (Oficina.totalOrdens == 0) {
            System.out.println("Nenhuma ordem de serviço registrada.");
            return;
        }
        
        for (int i = 0; i < Oficina.totalOrdens; i++) {
            Oficina.ordensDeServico[i].exibirInfo();
        }
    }

    protected static void atenderChamados(Scanner sc) {
        
        if (Oficina.totalOrdens == 0) {
            System.out.println("Nenhum chamado registrado.");
            return;
        }
        
        for (int i = 0; i < Oficina.totalOrdens; i++) {
            Oficina.ordensDeServico[i].exibirInfo();
        }
        
        System.out.println("Digite o numero da OS para alterar o status(0 para cancelar): ");
        int numeroEscolhido = sc.nextInt();
        
        sc.nextLine();
        
        if (numeroEscolhido == 0) {
            return;
        }
        
        OrdemDeServico ordemEscolhida = null;
        
        for (int i = 0; i < Oficina.totalOrdens; i++) {
            
            if (Oficina.ordensDeServico[i].numero == numeroEscolhido) {
                
            }
        }
        if (ordemEscolhida == null) {
            
            System.out.println("OS nao encontrada!!!!!");
            return;
        }
        System.out.println("Novo status:\n\n1- Em andamento\n2- Concluida");
        int novoStatus = sc.nextInt();
        
        sc.nextLine();
        
        switch (novoStatus) {
            case 1 -> {
                ordemEscolhida.status = "em andamento";
                System.out.println("Status atualizado com sucesso!!!!!");
            } 
            case 2 -> {
                ordemEscolhida.status = "concluída";
                System.out.println("Status atualizado com sucesso!!!!!");
            }
            default -> {
                System.out.println("Opçao invalida!!!!!");
            }
        }
    }
}
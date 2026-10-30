package AtividadesPOO.Atividade02;

public class Estacionamento {

    String placa;
    int horasEstacionadas;
    
    public double calcularValorCobranca() {
        if (horasEstacionadas == 1) {
            return 8.0;
        }
        
        else if (horasEstacionadas > 1) {
            return 8 + 5 * (horasEstacionadas - 1);
        }
        
        else {
            System.out.println("Voce precisa ter no minimo 60 minutos para gerar a cobrança!! Boa viagem!");
            return 0;
        }
    }
    
    public void exibirTiquete() {
        
        System.out.println("\nPlaca: " + placa);
        System.out.println("Horas no estacionamento: " + horasEstacionadas);
        System.out.println("Cobrança: " + calcularValorCobranca());
    }
    
}


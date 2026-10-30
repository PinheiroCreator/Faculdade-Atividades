
public class Atividade1509 {
    
   public static void Separador() {System.out.println("\n\n---------------------------------------------------------------------------------------------");}

    public static void main(String[] args) {
       
        Funcionario gerente = new Gerente("Cristiano Lionel", 5000.00, "0000000000","Ronaldomelhordomundo@pontocom.com", "62 9928422",2500.00,"Gerente");
        
        gerente.exibirInfo();
        
        Separador();
        
        Funcionario estagiario = new Estagiario("Neymar Jose", 1750.00, "9199191919191", "arrogante@mavi.com", "78 81237217",500, "Estagiario");
        
        estagiario.exibirInfo();
        
        Separador();
        
        Funcionario engenheiro = new Engenheiro("Jaison Mendes", 3000.00, "123456778976", "sucodelaranja@mecanico.com", "62 70707070", "Engenheiro", 12, 150.00);
        
        engenheiro.exibirInfo();
        
        Separador();
        Separador();
        
        Veiculo Carro = new Carro ("mitsubishi", "lancer", 1998, "Carro", 4);
        
        Carro.exibirInfoVeiculo();
        
        Carro.acelerar();
        
        Carro.freiar();
        
        Separador();
        
        Veiculo Moto = new Moto("BMW", "S1000", 2026, "Moto", 1000);
        
        Moto.exibirInfoVeiculo();
        
        Moto.acelerar();
        
       // Moto.freiar();

       Separador();
       
       Veiculo Caminhao = new Caminhao("Scania", "Scania 67", 2027, "Caminhao", 10000);
       
       Caminhao.exibirInfoVeiculo();
       
//       Caminhao.acelerar();

        Caminhao.freiar();
     

        Separador();
        Separador();
        
        
        Animal Cachorro = new Cachorro ("Zeus", 9 , "Husk Siberiano");
        
        Cachorro.exibirInfoAnimal();
        
        Cachorro.exibirSom();
        
        Separador();
        
        Animal Gato = new Gato("bills", 1000, "Cornish Rex");
        
        Gato.exibirInfoAnimal();
        
        Gato.exibirSom();

        Separador();
        
        Animal Papagaio = new Papagaio("Louro Jose", 39, "Amazona aestiva");
        
        Papagaio.exibirInfoAnimal();
        
        Papagaio.exibirSom();
    }
}    

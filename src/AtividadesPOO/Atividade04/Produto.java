import java.util.Scanner;

public class Produto {


    public String nome;
    private double preco;
    protected int quantidade;
    
    public void venderProduto(Scanner sc, int unidades) {
        
        System.out.println("Qual a quantidade vendida?: ");
            unidades = sc.nextInt();
            
            if(unidades > quantidade) {
                
                System.out.println("NAO FOI POSSIVEL REALIZAR A VENDA!!! (QUANTIDADE EM ESTOQUE INSUFICIENTE!)");
            }
            
            else {
                quantidade -= unidades;
                
                System.out.println("VENDA REALIZADA COM SUCESSO!!!!");
                
                System.out.println("Agora voce tem " + quantidade + " em estoque");
            }    
    }
    
    public void exibirInfo () {
        
        System.out.println("Nome: " + nome);
        System.out.println("Quantidade em estoque: " + quantidade);
    }
}

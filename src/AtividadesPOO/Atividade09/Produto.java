
public class Produto {

    private String nome;
    private double preco;
    private double valorDesconto;
    private String tipoProduto;
    private double distancia;
    
    public String getNome() {return nome;} 
    
    public void setNome(String nome) {this.nome = nome;}
    
    public double getPreco() {return preco;}
    
    public void setPreco(double preco) {this.preco = preco;}
    
    public double getValorDesconto() {return valorDesconto;}
    
    public void setValorDesconto(double valorDesconto) {this.valorDesconto = valorDesconto;}
     
    public String getTipoProduto() {return tipoProduto;} 
    
    public void setTipoProduto(String tipoProduto) {this.tipoProduto = tipoProduto;}
    
    public double getDistancia() {return distancia;}
    
    public void setDistancia(double distancia) {this.distancia = distancia;}
    
    public Produto (String nome, double preco,double valorDesconto, String tipoProduto) {
    
                this.nome = nome;
                this.preco = preco;
                this.tipoProduto = tipoProduto;
                this.valorDesconto = valorDesconto;
    }
        
    protected double calcularFrete() {
        
        return this.getPreco() + this.getDistancia() * 1.2;
    }
    
    protected double caluclarFrete(double desconto) {
    
        return calcularFrete() / this.getValorDesconto();
    }
}



class ProdutoEletronico extends Produto {

    public ProdutoEletronico(String nome, double preco,double valorDesconto, String tipoProduto) {
        
        super(nome,preco,valorDesconto,tipoProduto);

    }
}

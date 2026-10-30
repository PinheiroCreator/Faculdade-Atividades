package AtividadesPOO.Atividade08;

public class Estagiario extends Funcionario {

    private double desconto;

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
   
    public Estagiario (String nome, double salario, String cpf, String email, String telefone, double desconto, String cargo){
    
        super(nome,salario,cpf,email,telefone,cargo);
        
        this.desconto = desconto;
    }
    
    private double calcularDesconto() {
        
        return this.getSalario() - this.desconto;
    }
    
    @Override 
    
    protected void exibirInfo() {
        
        super.exibirInfo();
        
        System.out.printf("\nDesconto: %.2f\nTotal Salario: %.2f",this.desconto , calcularDesconto());
    }
}
package AtividadesPOO.Atividade08;

public class Engenheiro extends Funcionario {

    private int projetaFeitos;
    
    private double valorPorProjeto;

    public int getProjetaFeitos() {
        return projetaFeitos;
    }

    public void setProjetaFeitos(int projetaFeitos) {
        this.projetaFeitos = projetaFeitos;
    }

    public double getValorPorProjeto() {
        return valorPorProjeto;
    }

    public void setValorPorProjeto(double valorPorProjeto) {
        this.valorPorProjeto = valorPorProjeto;
    }
    
    public Engenheiro (String nome, double salario, String cpf, String email, String telefone, String cargo, int projetosFeitos, double valorPorProjetos) {
        
        super(nome,salario,cpf,email,telefone,cargo);
        
        this.projetaFeitos = projetosFeitos;
        this.valorPorProjeto = valorPorProjetos;
    }
    
    private double CalcularValorPorProjetoFeito () {
        
        return (this.getProjetaFeitos() * this.valorPorProjeto) + this.getSalario();
    }
    
    @Override
    
    public void exibirInfo() {
    
        super.exibirInfo();
        
        System.out.printf("\nProjetos feitos esse mes: %d\nValor por Projetos: %.2f\nSalario Total: %.2f",this.projetaFeitos, this.valorPorProjeto,CalcularValorPorProjetoFeito());
    }
    
}

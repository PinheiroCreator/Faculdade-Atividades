
public class Aluno {
    
    public String nome;
    private int idade;
    protected String matricula;
    
    public void exibirDados() {
        
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Matricula: " + matricula);
    }
    
    private void validarIdade() {
        
        if (idade > 0) {
            System.out.println("Verificaçao concluida!!!!!\n");
        }
        
        else {
            System.out.println("A idade do aluno nao e valida!!!!");
            return;
        }
    }
}

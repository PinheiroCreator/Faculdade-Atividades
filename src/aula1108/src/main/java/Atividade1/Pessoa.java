package Atividade1;

public class Pessoa {

    String nome;
    int idade;
    double altura;
    String nacionalidade;
    
    public void aniversario() {
        System.out.printf("\n\nFeliz Aniversario %s!!!!!!!\n",nome);
        
        System.out.printf("\nAgora voce tem: %d\n\n\n\n",idade + 1);
    }
    
    public void exibir() {
        
        System.out.printf("Nome: %s \nIdade: %d \nAltura: %.2f \nNacionalidade: %s",nome, idade, altura, nacionalidade);
    }
    
}

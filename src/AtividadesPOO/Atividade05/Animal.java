package AtividadesPOO.Atividade05;

public class Animal {

    private String nome;
    String especie;
    private int idade;
    double peso;

    public Animal(String nome, String especie, int idade, double peso) {

        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
        this.peso = peso;
    }

    public void exibirInfo() {

        System.out.println("----------------------------------------------------------------");
        System.out.println("\n\nNome: " + nome);
        System.out.println("Especie: " + especie);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Peso: " + peso + " kg\n");
        System.out.println("----------------------------------------------------------------");
    }

    public void fazerAniversario() {
        idade++;
    }
}
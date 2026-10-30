package fatesg.atividade1308;
import java.util.Scanner;

public class Paciente {
 
    String nome;
    double peso;
    double altura;
    int idade;
 
    public double calcularIMC() {
        return peso / (altura * altura);
    }
 
    public String classificarIMC() {
        double imc = calcularIMC();
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc < 25.0) {
            return "Peso normal";
        } else if (imc < 30.0) {
            return "Sobrepeso";
        } else {
            return "Obesidade";
        }
    }
 
    public void exibirFicha() {
        System.out.println("\nNome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso + "kg");
        System.out.println("Altura: " + altura + "m");
        System.out.println("IMC: " + calcularIMC());
        System.out.println("Classificação: " + classificarIMC());
    }
 
    public void cadastrar(Scanner sc) {
        System.out.println("Qual o nome do paciente?: ");
        nome = sc.nextLine();
 
        System.out.println("Qual a idade do paciente?: ");
        idade = sc.nextInt();
 
        System.out.println("Qual o peso do paciente (kg)?: ");
        peso = sc.nextDouble();
 
        System.out.println("Qual a altura do paciente (m)?: ");
        altura = sc.nextDouble();
    }
 
}
 
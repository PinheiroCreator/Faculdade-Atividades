package AtividadesPOO.Atividade02;

import java.util.Scanner;

public class Funcionario {

    String nome;
    double salarioBruto;
    int horasExtras;

    static final double HORAS_MES = 220.0;

    public double calcularValorHoraExtra() {
        double valorHoraNormal = salarioBruto / HORAS_MES;
        double valorHoraExtra = valorHoraNormal * 1.5;
        return valorHoraExtra * horasExtras;
    }

    public double calcularDescontoINSS() {
        double baseCalculo = salarioBruto + calcularValorHoraExtra();
        double aliquota;
        if (baseCalculo <= 1412.00) {
            aliquota = 0.075;
        } else if (baseCalculo <= 2666.68) {
            aliquota = 0.09;
        } else if (baseCalculo <= 4000.03) {
            aliquota = 0.12;
        } else {
            aliquota = 0.14;
        }
        return baseCalculo * aliquota;
    }

    public double calcularSalarioLiquido() {
        double salarioComExtra = salarioBruto + calcularValorHoraExtra();
        return salarioComExtra - calcularDescontoINSS();
    }

    public void exibirContracheque() {
        System.out.println("\n===== Contracheque =====");
        System.out.println("Nome: " + nome);
        System.out.println("Salário Bruto: R$" + salarioBruto);
        System.out.println("Horas Extras: " + horasExtras);
        System.out.println("Valor Horas Extras: R$" + calcularValorHoraExtra());
        System.out.println("Desconto INSS: R$" + calcularDescontoINSS());
        System.out.println("Salário Líquido: R$" + calcularSalarioLiquido());
    }

    public void cadastrar(Scanner sc) {
        System.out.println("Qual o nome do funcionário?: ");
        nome = sc.nextLine();

        System.out.println("Qual o salário bruto?: ");
        salarioBruto = sc.nextDouble();

        System.out.println("Quantas horas extras foram trabalhadas?: ");
        horasExtras = sc.nextInt();
    }

}
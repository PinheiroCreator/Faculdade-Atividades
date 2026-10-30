package fatesg.atividade252708.Atividade252708Pet;

public class Veterinario {

    private String nome;
    private String crmv;
    String especialidade;
    int anosDeExperiencia;


    public Veterinario(String nome, String crmv, String especialidade, int anosDeExperiencia) {

        this.nome = nome;
        this.crmv = crmv;
        this.especialidade = especialidade;
        this.anosDeExperiencia = anosDeExperiencia;
    }

    public void exibirInfo() {

        System.out.println("----------------------------------------------------------------");
        System.out.println("\n\nNome: " + nome);
        System.out.println("CRMV: " + crmv);
        System.out.println("Especialidade: " + especialidade);
        System.out.println("Anos de Experiencia: " + anosDeExperiencia + "\n");
        System.out.println("----------------------------------------------------------------");
    }

    public void incrementarExperiencia() {
        anosDeExperiencia++;
    }
}